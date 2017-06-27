<%-- 
    Document   : lista_pedidos
    Created on : 05-abr-2017, 17:30:09
    Author     : jhonrubia
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="paqueteclases.Pedido"%>
<%@page import="Control.PintaHTML"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><%
    ArrayList<Pedido> lista_pedidos = (ArrayList)request.getAttribute("lista_pedidos");
    String json_pedidos=PintaHTML.pintaJSONPedido(lista_pedidos);
%>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Pedidos</title>
    </head>
    <body>
        <%=json_pedidos%>
    </body>
</html>
