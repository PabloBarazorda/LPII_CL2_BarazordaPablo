package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IUsuario;
import model.TblUsuariocl2;

public class ClassUsuarioImp implements IUsuario {

	@Override
	public void RegistrarUsuario(TblUsuariocl2 usuario) {
		//establecer la cadena de conexion con la unidad de persistencia
		EntityManagerFactory em=Persistence.createEntityManagerFactory("BDpablobarazordacl2");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//registramos
		emanager.persist(usuario);	
		//emitimos mensaje por consola
		System.out.print("Usuario Registrado en la BD");
		//configuramos
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
		
	}

	@Override
	public void ActualizarUsuario(TblUsuariocl2 usuario) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("BDpablobarazordacl2");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//actualizamos
		emanager.merge(usuario);
		//emitimos un mensaje
		System.out.println("Usuario actualizado exitosamente");
		//confirmamos
		emanager.getTransaction().commit();
		//cerramos la transaccion
		emanager.close();
		
	}

	@Override
	public void EliminarUsuario(TblUsuariocl2 usuario) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("BDpablobarazordacl2");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//recuperamos el codigo a eliminar
		TblUsuariocl2 elim= emanager.merge(usuario);
		//procedemos a eliminar
		emanager.remove(elim);
		//emitimos mensaje
		System.out.println("Usuario eliminado");
		//confirmamos
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
		
	}

	@Override
	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 usuario) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("BDpablobarazordacl2");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//recuperamos el codigo de buscar
		TblUsuariocl2 buscarusu = emanager.find(TblUsuariocl2.class , usuario.getIdusuariocl2());
		//confirmamos
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
		//retornamos el producto buscado
		return buscarusu;
		
	}

	@Override
	public List<TblUsuariocl2> ListadoUsuario() {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("LPII_CL2_BarazordaPablo");
		//gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		//iniciamos la transaccion
		emanager.getTransaction().begin();
		//recuperamos el listado de productos de la base de datos
		//aplicamos consultas JPQL
		List<TblUsuariocl2> listado=emanager.createQuery("select c from TblUsuariocl2 c", TblUsuariocl2.class).getResultList();
		//confirmamos
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
		//retornamos el listado
		return listado;
	}

}
