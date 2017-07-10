<%-- 
    Document   : login
    Created on : 07/07/2017, 09:44:17 AM
    Author     : junio
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <%@include file="../../jspf/head.jspf" %>
                

    </head>
    <body style="background:url(http://www.upeu.edu.pe/wp-content/uploads/2016/08/fondo-upeu-virtual.jpg);">
       
        
            <div class="container" style="background-color: #ccccff; padding: 2px;margin: 0 auto;width: 400px; margin-top: 10%;">
                <div class="wrapper" style="padding: 60px;">
                    <form:form action="loguea" method="post" modelAttribute="user">      
                        
                        <h2 class="form-signin-heading" style="text-align: center;">Bienvenido ! ! !</h2>
                        <h4 class="form-signin-heading" style="text-align: center;">Sistema de prestamo de equipos de la UPeU</h4>

                      <input type="text" class="form-control" name="user" placeholder="Usuario" required="" autofocus="" />
                      <br>
                      <input type="password" class="form-control" name="pass" placeholder="Contraseña" required=""/>      
                      <label class="checkbox">

                      </label>
                      <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>   
                      
                    </form:form>
                </div>
            </div>
        

      
    </body>
</html>
