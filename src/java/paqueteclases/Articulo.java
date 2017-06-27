/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteclases;

/**
 *
 * @author jhonrubia
 */
public class Articulo {
    int cantidad,id,id_pedido;
    String nombreart, uso, proveedor;
    float costeunit;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreart() {
        return nombreart;
    }

    public void setNombreart(String nombreart) {
        this.nombreart = nombreart;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public float getCosteunit() {
        return costeunit;
    }

    public void setCosteunit(float costeunit) {
        this.costeunit = costeunit;
    }

    public Articulo(int id, String nombreart, String uso, String proveedor, float costeunit,int cantidad) {
        this.cantidad = cantidad;
        this.id = id;
        this.nombreart = nombreart;
        this.uso = uso;
        this.proveedor = proveedor;
        this.costeunit = costeunit;
    }
    
    
}
