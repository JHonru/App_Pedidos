/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import java.util.ArrayList;
import paqueteclases.*;
/**
 *
 * @author jhonrubia
 */

public class PintaHTML {
    
       public static String pintaArticulos(ArrayList<Articulo> articulos)
    {
        String aux="";
        for (int i=0;i<articulos.size();i++) {
            Articulo art =(Articulo) articulos.get(i);
            String nombre = art.getNombreart();
            String uso = art.getUso();
            int cantidad=art.getCantidad();
            String proveedor = art.getProveedor();
            float costeunit = art.getCosteunit();
            float costetotal = costeunit*cantidad;
            aux+="<tr><td>"+cantidad+"</td><td>"+nombre+"</td><td>"+uso+"</td><td>"+proveedor+"</td><td>"+costeunit+"</td><td>"+costetotal+"</td></tr>";
            
            
        }
        return aux;
    }
       public static String pintaPedido(Pedido pedido){
           String aux="<tr>";
           String fechapeti=pedido.getFechapet();
           String fechaentre=pedido.getFechaentrega();
           String ticket=pedido.getTicket();
           String prioridad=pedido.getPrioridad();
           String depto=pedido.getDepartamento();
           String tramit=pedido.getTramitado();
           String asignado=pedido.getAsignado();
           aux+="<td>"+fechapeti+"</td><td>"+fechaentre+"</td><td>"+ticket+"<td></td>"+prioridad+"</td><td>"+depto+"</td><td>"+tramit+"</td></tr></table>";
           aux+="*<em>Fecha de entrega m&aacute;xima en la que se debe realizar el pedido</em><br/><br/>";
           aux+="<table><tr><td colspan='2'><strong>ASIGNADO A**:</STRONG></td><td colspan='3'>"+asignado+"</td></tr>";
           return aux;
       }
       
       public static String pintaJSONPedidoArticulo(Pedido pedido, ArrayList<Articulo> articulos){
           String aux="{";
           aux+="codigo:\""+pedido.getCodpedido()+"\",";
           aux+="fecha_peticion:\""+pedido.getFechapet()+"\",";
           aux+="fecha_entrega:\""+pedido.getFechaentrega()+"\",";
           aux+="ticket:\""+pedido.getTicket()+"\",";
           aux+="prioridad:\""+pedido.getPrioridad()+"\",";
           aux+="depto:\""+pedido.getDepartamento()+"\",";
           aux+="tramitado_por:\""+pedido.getTramitado()+"\",";
           aux+="asignado:\""+pedido.getAsignado()+"\",";
           aux+="articulos:[{";
           for (int i=0;i<=articulos.size();i++){
               aux+="articulo"+articulos.get(i).getId()+":";
               aux+="cantidad:"+articulos.get(i).getCantidad()+",";
               aux+="nombre:\""+articulos.get(i).getNombreart()+"\",";
               aux+="proveedor:\""+articulos.get(i).getProveedor()+"\",";
               aux+="uso:\""+articulos.get(i).getUso()+"\",";
               aux+="coste:"+articulos.get(i).getCosteunit()+"}";
               aux+="}";
           }
           aux+="]}";
           aux+="total:"+pedido.getCostepedido();
           return aux;
       }
              public static String pintaJSONPedidos(ArrayList<Pedido> lista_pedidos){
           String aux="{pedidos:[";
          for (int i=0;i<=lista_pedidos.size();i++){
           aux+="codigo:\""+lista_pedidos.get(i).getCodpedido()+"\",";
           }
           aux+="]}";
           return aux;
       }
 
}


