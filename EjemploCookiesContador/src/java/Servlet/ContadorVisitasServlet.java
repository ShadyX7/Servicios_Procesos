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
public class ContadorVisitasServlet extends HttpServlet {

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

        //Declaramos la variable contador
        int contador = 0;

        //Si existe, obtenemos el contador de visitas actual
        Cookie[] cookies = request.getCookies();
    
      
        if(cookies != null){
            for(Cookie c : cookies)
            {
                if(c.getName().equals("contadorVisitas")){

                try
                {
                  //Obtenemos el valor del contador de visitas actual
                  contador = Integer.parseInt( c.getValue() );

               }catch(NumberFormatException e){
                  //En caso de error, reiniciamos el contador de visitas
                  contador = 0;
                }   
            } //fin del for   
        } //fin del if
 
 

        //incrementamos el contador de visitas
        //y lo agregamos la cookie en la respuesta
        contador++;
     
        Cookie c = new Cookie("contadorVisitas", Integer.toString(contador));        
        
        //La cookie se almacenara en el cliente por 1 hora (3600 seg)
        c.setMaxAge(3600);
        
        response.addCookie(c);
        
        //Mandamos el mensaje al navegador
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();       
        
        
        out.println("Contador de visitas de cada cliente: " + contador);
}
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
