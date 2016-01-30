/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author localhost
 */
public class CookiesServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

      //Suponemos que el usuario esta visitando por primera
      //vez nuestro sitio
      boolean nuevoUsuario = true;

      //Obtenemos todas las cookies
      Cookie[] cookies = request.getCookies();

      //Buscamos si ya existe una cookie creada con anterioridad
      //llamada visitanteRecurrente
      if( cookies != null){
        for(Cookie c: cookies){
          if(c.getName().equals("visitanteRecurrente")
                  && c.getValue().equals("si")){
            //En caso de que ya exista una cookie indicando
            //que ya existe un usuario registrado con anterioridad
            //ponemos la bandera en falso y salimos del ciclo
            nuevoUsuario = false;
            break;
          }
        }//fin del for
      }//fin del if

      //Revisamos si el usuario es un nuevo visitante
      String mensaje = null;
      if( nuevoUsuario ){
        //En caso de ser un usuario nuevo creamos el objeto Cookie
        Cookie visitanteCookie = new Cookie("visitanteRecurrente","si");
        //Agregamos la cookie en la respuesta
        response.addCookie(visitanteCookie);
        mensaje = "Gracias por visitar nuestro sitio";
      }
      else{
        mensaje = "Gracias por visitar NUEVAMENTE nuestro sitio";
      }

      //Escribimos la salida
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      //Omitimos el codigo HTML para simplificar el cÃ³digo
      out.println("Mensaje:" + mensaje);

        
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
