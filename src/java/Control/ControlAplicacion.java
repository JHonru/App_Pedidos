/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.minidev.json.parser.*;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.JSONStyle;
import net.minidev.json.JSONValue;
import paqueteclases.*;

/**
 *
 * @author jhonrubia
 */
@WebServlet(name = "ControlAplicacion", urlPatterns = {"/ControlAplicacion"})
public class ControlAplicacion extends HttpServlet {

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
        String path =request.getServletPath();
        switch(path){
            case "guardaPedido":
                guardaPedido(request,response);break;
            case "listarPedidos":
                listarPedidos(request,response);break;
            case "verPedido":
                verPedido(request,response);break;
            case "inicioApp":
                cargaInicio(request,response);break;
                    
        }
    }
    
    private void guardaPedido (HttpServletRequest request, HttpServletResponse response){
        
    }
    private void listarPedidos (HttpServletRequest request, HttpServletResponse response){
                
        ArrayList<Pedido> lista_pedidos = AccesoBBDD.cargaPedidos();
        request.setAttribute("lista_pedidos", lista_pedidos);
        try {
            request.getRequestDispatcher("listado_pedidos.jsp").forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(ControlAplicacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControlAplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    
    private void verPedido (HttpServletRequest request, HttpServletResponse response){
        int id_ped=Integer.parseInt(request.getParameter("id_pedido"));
        Pedido pedido = AccesoBBDD.buscaPedido(id_ped);
        ArrayList<Articulo> lista_art = AccesoBBDD.cargaArticulos(id_ped);
        request.setAttribute("lista_art", lista_art);
        request.setAttribute("pedido", pedido);
        try {
            request.getRequestDispatcher("pedido.jsp").forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(ControlAplicacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControlAplicacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private ArrayList<Pedido> cargaListado (){
        ArrayList<Pedido> lista_pedidos = new ArrayList();
        lista_pedidos=control.AccesoBBDD.listaPedidos();
        return lista_pedidos;
    }
     private void cargaInicio(HttpServletRequest request, HttpServletResponse response) {
         ArrayList<Pedido> lista_pedidos = cargaListado();
        request.setAttribute("lista_pedidos", lista_pedidos);
        try {
            request.getRequestDispatcher("pedido.jsp").forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(ControlAplicacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControlAplicacion.class.getName()).log(Level.SEVERE, null, ex);
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
        String id = request.getParameter("id");
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
