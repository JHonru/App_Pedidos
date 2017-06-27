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
    
        <title>Listado Pedidos</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%
            
            ArrayList<Pedido> listado = (ArrayList)request.getAttribute("listado_pedidos");
            String listado_pedidos=PintaHTML.pintaJSONPedidos(listado);%>
    
    <body>
        <%=listado_pedidos%>
    </body>
</html>
