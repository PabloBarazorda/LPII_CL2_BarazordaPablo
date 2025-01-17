package interfaces;

import java.util.List;

import model.TblUsuariocl2;

public interface IUsuario {
	// declaracion de los metodos
	public void RegistrarUsuario(TblUsuariocl2 usuario);
	public void ActualizarUsuario(TblUsuariocl2 usuario);
	public void EliminarUsuario(TblUsuariocl2 usuario);
	public TblUsuariocl2 BuscarUsuario (TblUsuariocl2 usuario);
	public List<TblUsuariocl2> ListadoUsuario();
} // fin del interface
