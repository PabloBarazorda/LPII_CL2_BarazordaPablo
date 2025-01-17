package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IProducto;
import model.TblProductocl2;

public class ClassProductoImp implements IProducto{

	@Override
	public void RegistrarProducto(TblProductocl2 producto) {
		//establecer la cadena de conexion con la unidad de persistencia
				EntityManagerFactory em=Persistence.createEntityManagerFactory("LPII_CL2_BarazordaPablo");
				//gestionar las entidades
				EntityManager emanager=em.createEntityManager();
				//iniciamos la transaccion
				emanager.getTransaction().begin();
				//registramos
				emanager.persist(producto);	
				//emitimos mensaje por consola
				System.out.print("Producto Registrado en la BD");
				//configuramos
				emanager.getTransaction().commit();
				//cerramos
				emanager.close();
		
	}

	@Override
	public void ActualizarProducto(TblProductocl2 producto) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("LPII_CL2_BarazordaPablo");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//actualizamos
		emanager.merge(producto);
		//emitimos un mensaje
		System.out.println("Producto actualizado exitosamente");
		//confirmamos
		emanager.getTransaction().commit();
		//cerramos la transaccion
		emanager.close();
	} // fin del metodo actualizar

	@Override
	public void EliminarProducto(TblProductocl2 producto) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("LPII_CL2_BarazordaPablo");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//recuperamos el codigo a eliminar
		TblProductocl2 elim= emanager.merge(producto);
		//procedemos a eliminar
		emanager.remove(elim);
		//emitimos mensaje
		System.out.println("Producto eliminado");
		//confirmamos
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
	} // fin de eliminar

	@Override
	public TblProductocl2 BuscarProducto(TblProductocl2 producto) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("LPII_CL2_BarazordaPablo");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//recuperamos el codigo de buscar
		TblProductocl2 buscarpro = emanager.find(TblProductocl2.class , producto.getIdproductocl2());
		//confirmamos
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
		//retornamos el producto buscado
		return buscarpro;
	}

	@Override
	public List<TblProductocl2> ListadoProducto() {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("LPII_CL2_BarazordaPablo");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//recuperamos el listado de productos de la base de datos
		//aplicamos consultas JPQL
		List<TblProductocl2> listado=emanager.createQuery("select c from TblProductocl2 c", TblProductocl2.class).getResultList();
		//confirmamos
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
		//retornamos el listado
		return listado;
	}

}
