<%-- 
    Document   : main
    Created on : 13/06/2017, 07:20:56 PM
    Author     : UPEU
--%>
<
<%
     HttpSession sesion = request.getSession();
    if(sesion.getAttribute("user") == null){
        response.sendRedirect("index.html");

}else{
        
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Expires" content="0" />
        <meta http-equiv="Pragma" content="no-cache" />
        <%@include file="../../jspf/head.jspf" %>
        <title>Ventas</title>        
        <script type="text/javascript">            
           if (history.forward(1)) {
                    location.replace(history.forward(1));
            }
        </script>
        <script>
            window.oncontextmenu = function() {
            return false;
        };
        </script>
    </head>
    <body >
        <%@include file="../../jspf/header.jspf"%>
        <div class="container" style="max-width: 500px; margin: 0 auto; margin-top: 40px;">
            <h1 style="text-align: center;">Bienvenido a nuestro Sistema de Ventas</h1>
        </div>
        
    </body>
</html>
