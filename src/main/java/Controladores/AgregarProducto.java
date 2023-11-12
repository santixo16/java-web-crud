package Controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelos.Controladora;
import modelos.Producto;

/**
 *
 * @author santi
 */
@WebServlet(name="AgregarProductoServlet", urlPatterns={"/AgregarProducto"})
public class AgregarProducto extends HttpServlet {
    Controladora control = new Controladora();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String idProducto = request.getParameter("idProducto");
        String nombreProducto = request.getParameter("nombreProducto");
        String cantidadProducto = request.getParameter("cantidadProducto");
        String precioProducto = request.getParameter("precioProducto");
        String categoriaProducto = request.getParameter("categoriaProducto");
        
        Producto prod = new Producto();
        prod.setIdProducto(idProducto);
        prod.setNombreProducto(nombreProducto);
        prod.setCantidadProducto(cantidadProducto);
        prod.setPrecioProducto(precioProducto);
        prod.setCategoriaProducto(categoriaProducto);
        
        control.crearProducto(prod);
        response.sendRedirect("index.jsp");
    }   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            List<Producto> listaProductos = new ArrayList<>();  
            listaProductos = control.traerProductos();
            
            HttpSession miSesion = request.getSession();
            miSesion.setAttribute("listaProductos", listaProductos);
            response.sendRedirect("mostrarProductos.jsp");
        
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
