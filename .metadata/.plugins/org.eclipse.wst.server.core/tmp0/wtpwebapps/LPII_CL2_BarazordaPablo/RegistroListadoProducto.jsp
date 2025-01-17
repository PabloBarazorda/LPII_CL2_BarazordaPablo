<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RegistroListadoProducto</title>
</head>
<body bgcolor="c5dec5">
 <h2 align="center">Registrar Nuevo Producto</h2>
    <form action="ControladorProducto" method="post" style="margin: 20px auto; width: 50%; text-align: left;">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required><br>
        <hr>
        <label for="precio">Precio Compra:</label>
        <input type="text" id="precio" name="precio" required><br>
        <hr>
        <label for="precio_venta">Precio Venta:</label>
        <input type="text" id="precio_venta" name="precio_venta" required><br>
        <hr>
        <label for="estado">Estado:</label>
        <input type="text" id="estado" name="estado" required><br>
        <hr>
        <label for="descripcion">Descripci�n:</label>
        <textarea id="descripcion" name="descripcion" required></textarea><br>
        <hr>
        <input type="submit" value="Registrar">
    </form>
    
    <hr>
    
    <h2 align="center">Listado de Productos</h2>
    <table border="1" align="center" style="margin-top: 20px; width: 80%;">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Precio Compra</th>
            <th>Precio Venta</th>
            <th>Estado</th>
            <th>Descripci�n</th>
            <th>Acci�n</th>
        </tr>
        <c:forEach var="producto" items="${listadodeproductos}">
            <tr>
                <td>${producto.idproductocl2}</td>
                <td>${producto.nombrecl2}</td>
                <td>${producto.preciocompcl2}</td>
                <td>${producto.precioventacl2}</td>
                <td>${producto.estadocl2}</td>
                <td>${producto.descripcl2}</td>
                <td><a href="ControladorProducto?accion=Modificar&cod=${producto.idproductocl2}">Modificar</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>