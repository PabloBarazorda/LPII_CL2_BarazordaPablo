package testEntidades;

import java.util.List;

import dao.ClassUsuarioImp;
import model.TblUsuariocl2;

public class TestEntidadUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TblUsuariocl2 usuario = new TblUsuariocl2();
		ClassUsuarioImp crud = new ClassUsuarioImp();
		
		usuario.setUsuariocl2("Carloncho");
		usuario.setPassword("holagentita22");
		
		crud.RegistrarUsuario(usuario);
		
		TblUsuariocl2 usuariodos = new TblUsuariocl2();
		
		usuariodos.setUsuariocl2("Maria Antonella");
		usuariodos.setPassword("NightCrawler2004");
		
		// --- Actualizar ---
		/*
				usuario.setIdusuariocl2(1);
				usuario.setUsuariocl2("Carloncho");
				usuario.setPassword("soycarloncho20");
				
				crud.ActualizarUsuario(usuario);
				*/
				// --- Eliminar ---
				/*
				usuario.setIdUsuariocl2(2);
				crud.EliminarUsuario(usuario);
				*/
				
				// --- Buscar Productos ---
				/*
				 
				usuario.setIdusuariocl2(1);
				TblUsuariocl2 buscarusu = crud.BuscarUsuario(usuario);
				System.out.println("Codigo: "+buscarusu.getIdusuariocl2()
				+" Usuario: "+buscarusu.getUsuariocl2()+" Contrase�a: "+buscarusu.getPassword());
				
				*/
				// --- Listado Productos ---
				
				/*
				 
				List<TblUsuariocl2> listadousu = crud.ListadoUsuario();
				// bucle for
				for(TblUsuariocl2 listar:listadousu){
				
				//imprimimos los datos
				System.out.println("C�digo: "+listar.getIdusuariocl2()+ " Usuario: "+listar.getUsuariocl2()
				+" Contrase�a: "+listar.getPassword());
				
				}
				*/
	}

}
