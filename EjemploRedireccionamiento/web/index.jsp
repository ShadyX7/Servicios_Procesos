<%-- 
    Document   : index
    Created on : 10-nov-2015, 5:04:10
    Author     : localhost
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Redireccionamiento</title>
    </head>
    <body>
        <h1>Ejemplo Redireccionamiento</h1>
        
        <a href="/EjemploRedireccionamiento/RedireccionamientoServlet">Link al Servlet</a>

        <br>
        <a href="/EjemploRedireccionamiento/RecursoNoExistente">Link a recurso no existente</a>

    <fieldset>
      <legend>Formulario de Autorizacion</legend>
      <form name="form1" action="/EjemploRedireccionamiento/FormularioServlet">
        Usuario: <input type="text" name="usuario">
        <br/><br/>
        Password: <input type="password" name="password">
        <br/><br/>
        <input type="submit" value="Enviar"/>
      </form>
    </fieldset>
        
        
    </body>
</html>
