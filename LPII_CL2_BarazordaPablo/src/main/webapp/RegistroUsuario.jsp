<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#c5dec5">
<h2 align="center">Ingresar al Sistema</h2>
<div align="center">
        <form action="ControladorUsuario" method="post">
            <table border="1">
                <tr>
                    <td>Usuario:</td>
                    <td><input type="text" name="usuario" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Registrar"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>