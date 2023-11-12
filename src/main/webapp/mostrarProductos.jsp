<%-- 
    Document   : mostrarProductos
    Created on : 9/11/2023, 11:14:33 p. m.
    Author     : santi
--%>

<%@page import="java.util.List"%>
<%@page import="modelos.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos</title>
    </head>
    <body>
        <h1>Lista de productos</h1>
        <%
            List<Producto> listaProductos = (List) request.getSession().getAttribute("listaProductos");
            int cont = 1;  
            for(Producto prod: listaProductos){                                 
        %>
        
        <h3>Producto número <%=cont%></h3>
        <p>ID: <%=prod.getId()%></p>
        <p>Id producto: <%=prod.getIdProducto()%></p>
        <p>Nombre producto: <%= prod.getNombreProducto() %></p>
        <p>Cantidad: <%= prod.getCantidadProducto() %></p>
        <p>Precio <%= prod.getPrecioProducto()%></p>
        <p>Categoría producto: <%= prod.getCategoriaProducto() %></p>
        <p>----------------------------------------------------</p>
        <% cont = cont + 1;%>
        <% } %>
    </body>
</html>
