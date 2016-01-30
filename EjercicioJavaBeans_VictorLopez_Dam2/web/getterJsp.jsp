<%-- 
    Document   : getterJsp
    Created on : 24-nov-2015, 10:54:20
    Author     : localhost
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Leer valores del usuario</title>
    </head>
  
  <body>
    <h1>Leer valores del usuario</h1>

    <jsp:useBean id="datosUsuario"
                 class="datos.datosUsuario" scope="session" />

    
    <br>
    Valor dni: <jsp:getProperty name="datosUsuario" property="dni" />
    <br>
    Valor nombre: <jsp:getProperty name="datosUsuario" property="nombre" />
    <br>
    Valor apellido: <jsp:getProperty name="datosUsuario" property="apellido" />
    <br>
    Valor direccion: <jsp:getProperty name="datosUsuario" property="direccion" />
    <br>
    
   
    Datos usuario: <jsp:getProperty name="datosUsuario" property="resul" />
    <br>
    <br>
    <a href="index.html">Regresar al Inicio</a>

  </body>
</html>
