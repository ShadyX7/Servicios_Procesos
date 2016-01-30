<%-- 
    Document   : accesoJavaBeans
    Created on : 25-nov-2015, 9:27:40
    Author     : localhost
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>Acceso a JavaBeans</title>
  </head>
  <body>
    <h1>Acceso a JavaBeans</h1>

    <jsp:useBean id="rectangulo" class="beans.Rectangulo" />

    <!-- asignamos los valores del formulario al JavaBean -->
    <jsp:setProperty name="rectangulo" property="*" />

    <br>
    Valor base: ${rectangulo.base}
    <br>
    Valor altura: ${rectangulo.altura}
    <br>
    Valor Area: ${rectangulo.area}
    <br>
    Calculo del Area: ${rectangulo.base*rectangulo.altura}

    <br>
    <br>
    <a href="index.jsp">Regresar al Inicio</a>

</html>
