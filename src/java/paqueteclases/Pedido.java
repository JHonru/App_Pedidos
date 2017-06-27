/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteclases;

import java.util.ArrayList;

/**
 *
 * @author jhonrubia
 */
public class Pedido {
    private String fechapet, fechaentrega, ticket, prioridad, departamento, tramitado, codpedido,asignado;
    private int id;
    private ArrayList<Articulo> articulos;

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public String getAsignado() {
        return asignado;
    }

    public void setAsignado(String asignado) {
        this.asignado = asignado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCostepedido() {
        return costepedido;
    }

    public void setCostepedido(float costepedido) {
        this.costepedido = costepedido;
    }
    float costepedido;

    public String getFechapet() {
        return fechapet;
    }

    public void setFechapet(String fechapet) {
        this.fechapet = fechapet;
    }

    public String getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(String fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTramitado() {
        return tramitado;
    }

    public void setTramitado(String tramitado) {
        this.tramitado = tramitado;
    }

    public String getCodpedido() {
        return codpedido;
    }

    public void setCodpedido(String codpedido) {
        this.codpedido = codpedido;
    }



    public Pedido() {
    }

    public Pedido(String fechapet, String fechaentrega, String ticket, String prioridad, String departamento, String tramitado, String codpedido, String asignado, int id, ArrayList<Articulo> articulos, float costepedido) {
        this.fechapet = fechapet;
        this.fechaentrega = fechaentrega;
        this.ticket = ticket;
        this.prioridad = prioridad;
        this.departamento = departamento;
        this.tramitado = tramitado;
        this.codpedido = codpedido;
        this.asignado = asignado;
        this.id = id;
        this.articulos = articulos;
        this.costepedido = costepedido;
    }


    
}
