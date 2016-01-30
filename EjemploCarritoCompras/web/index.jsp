<%-- 
    Document   : index
    Created on : 18-nov-2015, 9:27:53
    Author     : localhost
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carrito Compras</title>
    </head>
    
    <body>
        <h1>Ejemplo Carrito Compras</h1>
        
        <form action="/EjemploCarritoCompras/CarritoServlet"
              method="post"
              name="form1">

              Art&iacute;culo a agregar:
              <input type="text" name="articulo">
              <br>
              <input type="submit" value="Enviar">
        </form>
</html>
