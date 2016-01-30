<%-- 
    Document   : setterParamJsp
    Created on : 24-nov-2015, 11:01:40
    Author     : localhost
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DATOS DEL USUARIO</title>
  </head>
  <body>
    <h1>DATOS DEL USUARIO</h1>
  

    <jsp:useBean id="datosUsuario" class="datos.datosUsuario"
                 scope="session" />

    Modificaci&oacuten de los atributos:
    <br>
    <br>

    <jsp:setProperty name="datosUsuario" 
                     property="dni" param="dni" />

    Dni del usuario: <%= request.getParameter("dni") %>
    <br>

    <jsp:setProperty name="datosUsuario"
                     property="nombre" param="nombre" />

    Nombre del usuario:<%= request.getParameter("nombre") %>
    <br>

    <jsp:setProperty name="datosUsuario"
                     property="apellido" param="apellido" />

    Apellido del usuario:<%= request.getParameter("apellido") %>
    <br>

    <jsp:setProperty name="datosUsuario"
                     property="direccion" param="direccion" />

    Direccion del usuario:<%= request.getParameter("direccion") %>

    <br>
    <br>
    <a href="index.html">Regresar al Inicio</a>
  </body>
</html>
