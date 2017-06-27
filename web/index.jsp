<%@page import="java.util.ArrayList"%>
<%@page import="paqueteclases.*"%>
<%@page import="Control.PintaHTML"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    
        <title>Pedido Interno</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%
            Pedido pedido = (Pedido)request.getAttribute("pedido");
            ArrayList<Articulo> articulos = (ArrayList)request.getAttribute("lista_art");
            String listado_pedido=PintaHTML.pintaJSONPedidoArticulo(pedido, articulos);%>
    
    <body>
        <%=listado_pedido%>
    </body>
</html>
