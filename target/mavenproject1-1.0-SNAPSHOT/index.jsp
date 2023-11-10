<%-- 
    Document   : index
    Created on : 7/11/2023, 03:08:10 PM
    Author     : s.hernandez.co
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <title>Aplicación Web</title>
    </head>
    <body>
        <h1>Testing...3</h1>
        <%String prueba ="testing desde java";%>
        <%=prueba%>
        <h1>Agregar Producto</h1>

    <form method="POST" action="AgregarProducto">
        ID Producto: <input type="text" name="idProducto"><br>
        Nombre Producto: <input type="text" name="nombreProducto"><br>
        Cantidad Producto: <input type="text" name="cantidadProducto"><br>
        Precio Producto: <input type="text" name="precioProducto"><br>
        Categoria Producto: <input type="text" name="categoriaProducto"><br>
        <input type="submit">
    </form>
    <form action="AgregarProducto" method="GET">
        <button type="submit">Mostrar lista de productos</button>
    </form>
    </body>
</html>