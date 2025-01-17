package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClassProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    } //fin del controlador

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		TblProductocl2 producto = new TblProductocl2();
		ClassProductoImp crud = new ClassProductoImp();
		List<TblProductocl2> listadopro = crud.ListadoProducto();
		request.setAttribute("listadodeproductos", listadopro);
		//request.getRequestDispatcher("/RegistroListadoProducto.jsp").forward(request, response);
		
		String accion=request.getParameter("accion");
		if(accion!=null){
		switch(accion){
		case "Modificar":
			int codigo=Integer.parseInt(request.getParameter("cod"));
			producto.setIdproductocl2(codigo);
			TblProductocl2 buscarcod = crud.BuscarProducto(producto);
			
			//actualizar
			request.setAttribute("codigo", buscarcod.getIdproductocl2());
			request.setAttribute("nombre", buscarcod.getNombrecl2());
			request.setAttribute("precio", buscarcod.getPreciocompcl2());
			request.setAttribute("precio_venta", buscarcod.getPrecioventacl2());
			request.setAttribute("estado", buscarcod.getEstadocl2());
			request.setAttribute("descripcion", buscarcod.getDescripcl2());
			
			//request.getRequestDispatcher("/FormActualizarProducto.jsp").forward(request, response);
		}
		}
	} // fin de getWriter

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		
		String nombre=request.getParameter("nombre");
		String precio=request.getParameter("precio");
		String precioventa=request.getParameter("precio_venta");
		String estado=request.getParameter("estado");
		String descripcion=request.getParameter("descripcion");
		
		TblProductocl2 producto=new TblProductocl2();
		ClassProductoImp crud=new ClassProductoImp();
		
		producto.setNombrecl2(nombre);
		producto.setPreciocompcl2(0);
		producto.setPrecioventacl2(0);
		producto.setEstadocl2(estado);
		producto.setDescripcl2(descripcion);
		
		crud.RegistrarProducto(producto);
		List<TblProductocl2> listadoproducto = crud.ListadoProducto();
		request.setAttribute("listadoproducto", listadoproducto);
		request.getRequestDispatcher("/RegistroListadoProducto.jsp").forward(request, response);
	} // fin de doPost

}
