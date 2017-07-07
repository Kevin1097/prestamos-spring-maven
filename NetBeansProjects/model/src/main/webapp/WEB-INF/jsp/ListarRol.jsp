<%-- 
    Document   : ListarRol
    Created on : 02/07/2017, 10:45:30 PM
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
        <h1>Lista de Roles</h1>
        <hr>
        <h3><a href="newContact" class="btn btn-primary"><i class="fa fa-plus" aria-hidden="true"></i></a></h3>
        <table class="table">
            <th>No</th>
            <th>Rol</th>
            <th>Action</th>

            <c:forEach var="rol" items="${listRol}" varStatus="status">
                <tr>
                <td>${status.index + 1}</td>
                <td>${rol.nomrol}</td>
                <td>
                        <a href="editContact?id=${rol.idrol}" class="btn btn-warning"><i class="fa fa-pencil" aria-hidden="true"></i></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="deleteContact?id=${rol.idrol}" class="btn btn-danger"><i class="fa fa-trash" aria-hidden="true"></i></a>
                </td>
                </tr>
            </c:forEach>	        	
        </table>
    	</div>
    </body>
</html>
