<%-- 
    Document   : ListarVentas
    Created on : 03/07/2017, 10:17:49 AM
    Author     : junio
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title><link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
        <%@include file="../../jspf/head.jspf" %>
    </head>
    <body>
                <%@include file="../../jspf/header.jspf"%>
        <div class="container" style="max-width: 500px; margin: 0 auto; margin-top: 40px;">
        <h1>Lista de Ventas</h1>
        <hr>
        <h3><a href="newContact" class="btn btn-primary"><i class="fa fa-plus" aria-hidden="true"></i></a></h3>
        <table class="table">
            <th>No</th>
            <th>CLIENTE</th>
            <th>VENDEDOR</th>
            <th>FECHA</th>
            <th colspan="2">OPERACION</th>
            <c:forEach var="venta" items="${listVenta}" varStatus="status">
                <tr>
                <td>${status.index + 1}</td>
                <td>${venta.nombres} ${venta.apellidos}</td>
                <td>${venta.nom_user}</td>
                <td>${venta.fecha}</td>
                 <td>
                        <button onclick="${venta.idventas})" class="btn btn-warning"><i class="fa fa-pencil-square-o" aria-hidden="true"></i></button>
                        <button onclick="{venta.idventas})" class="btn btn-danger"><i class="fa fa-times" aria-hidden="true"></i></button>
                        <a href="listarDetalle?id=${venta.idventas}" class="btn btn-info"><i class="fa fa-list-ol" aria-hidden="true"></i></a>
                    </td> 
                </tr>
            </c:forEach>

        </table>
    	</div>
    </body>
</html>