<%-- 
    Document   : index
    Created on : 08-nov-2015, 12:57:09
    Author     : localhost
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Servlet</title>     
    </head>
    
    <body>
        
        <form name="Form1" action="/FormularioServlet/ServletForm"
              method = "get">
            
            Usuario: <input type="text" name="usuario"  />
            Pasword: <input type="password" name="password" />
            
            <input type="submit" value="Enviar" />
            
        </form>        
        
    </body>
</html>
