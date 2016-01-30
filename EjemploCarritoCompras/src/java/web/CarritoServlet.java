/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author localhost
 */
public class CarritoServlet extends HttpServlet {

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

        //Procesamos el nuevo articulo
         String articuloNuevo = request.getParameter("articulo");

         //Creamos o recuperamos la sesion http
         HttpSession sesion = request.getSession();

         //Recuperamos la lista de articulos previos
         //si es que existen en la sesion
         List<String> articulos = 
                 (List<String>) sesion.getAttribute("articulos");

         //Verificamos si la lista de articulos existe
         if(articulos == null){
           //si no existen, inicializamos la lista
           //y la agregamos a la sesion
           articulos = new ArrayList<String>();
           sesion.setAttribute("articulos", articulos);
         }

        //Ya tenemos la lista de articulos lista para trabajar
        //Agregamos el nuevo articulo
        //y lo agregamos por paso por referencia a la lista de
        //articulos
        if(articuloNuevo != null && !articuloNuevo.trim().equals("")){
          articulos.add(articuloNuevo);
        }

        //Mostramos los articulos totales al cliente
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Lista de Art&iacute;culos</h1>");
        out.println("<br>");

        //Iteramos todos los articulos, incluyendo el nuevo
        for(String articulo : articulos){
          out.print("<LI>" + articulo + "</LI>");
        }

        //Agregamos un link para regresar al inicio
        out.println("<br>");
        out.println("<a href='/EjemploCarritoCompras/index.jsp'>regresar</a>");
        out.close();
        
       
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
