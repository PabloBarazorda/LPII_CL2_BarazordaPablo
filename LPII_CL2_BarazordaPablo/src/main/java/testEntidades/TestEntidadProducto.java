package testEntidades;

import java.util.List;

import dao.ClassProductoImp;
import model.TblProductocl2;

public class TestEntidadProducto {

	public static void main(String[] args) {
		TblProductocl2 producto = new TblProductocl2();
		ClassProductoImp crud = new ClassProductoImp();
		
		producto.setNombrecl2("Leche");
		producto.setPreciocompcl2(5);
		producto.setPrecioventacl2(3);
		producto.setEstadocl2("Vigente");
		producto.setDescripcl2("oferta");
		//invocamos metodo registrar
		crud.RegistrarProducto(producto);
		
		TblProductocl2 productodos = new TblProductocl2();
		
		productodos.setNombrecl2("Aceite");
		productodos.setPreciocompcl2(11);
		productodos.setPrecioventacl2(9);
		productodos.setEstadocl2("Vigente");
		productodos.setDescripcl2("oferta");
		
		crud.RegistrarProducto(productodos);
		
		
		// --- Actualizar ---
		/*
		producto.setIdproductocl2(1);
		producto.setNombrecl2("Leche");
		producto.setPreciocompcl2(5);
		producto.setPrecioventacl2(3);
		producto.setEstadocl2("Acabado");
		producto.setDescripcl2("oferta");
		crud.ActualizarProducto(producto);
		*/
		
		// --- Eliminar ---
		/*
		producto.setIdproductocl2(1);
		crud.EliminarProducto(producto);
		*/
		
		// --- Buscar Productos ---
		/*
		producto.setIdproductocl2(2);
		TblProductocl2 buscarpro = crud.BuscarProducto(producto);
		System.out.println("Codigo: "+buscarpro.getIdproductocl2()
		+" Nombre: "+buscarpro.getNombrecl2()+" Precio: "+buscarpro.getPreciocompcl2()
		+" Precio venta: "+buscarpro.getPrecioventacl2()+" Estado: "+buscarpro.getEstadocl2()
		+" Descripci�n: "+buscarpro.getDescripcl2());
		*/
		
		// --- Listado Productos ---
		
		/*
		List<TblProductocl2> listadopro = crud.ListadoProducto();
		// bucle for
		for(TblProductocl2 listar:listadopro){
		
		//imprimimos los datos
		System.out.println("C�digo: "+listar.getIdproductocl2()+ " Nombre: "+listar.getNombrecl2()
		+" Precio: "+listar.getPreciocompcl2()+" Precio compra: "+listar.getPrecioventacl2()
		+" Estado: "+listar.getEstadocl2()+" Descripci�n: "+listar.getDescripcl2());
		
		}*/
		
	}

}
