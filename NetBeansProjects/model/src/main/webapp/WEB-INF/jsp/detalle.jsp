<%-- 
    Document   : detalle
    Created on : 03/07/2017, 02:11:48 PM
    Author     : junio
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <%@include file="../../jspf/head.jspf" %>
    </head>
    <body>
        <div class="container" style="width: 650px;">            
            <div class="row">
                <div class="col-md-12">
                    <div class="pull-right">
                        <a class="btn btn-primary" href="Allventas"><i class="fa fa-arrow-left" aria-hidden="true"></i></a>
                    </div>
                    <hr>
                    <h3><i class="fa fa-sitemap" aria-hidden="true" style="color: #cccc00"></i><strong style="margin-left: 5px;">Detalle de Venta</strong></h3>
                                                    
                </div>
            </div>
            <hr>
            
            <c:forEach var="det" items="${listDetalle}" varStatus="status">
            <div class="row">                
                <div class="col-md-2">
                  Fecha:  
                </div>
                <div class="col-md-4">
                   ${det.fecha}
                </div>
                <div class="col-md-2">
                  Vendedor:  
                </div>
                <div class="col-md-3">
                    <b>  ${det.nom_user}</b>
                </div>
            </div>
                <br>
            <div class="row">
                    <div class="col-md-2">
                  Cliente:  
                </div>
                <div class="col-md-4">
                    <b>${det.nombres} ${det.apellidos}</b>
                </div>
            </div>
            </c:forEach>
            
            <hr>
            <br><br>
            <table class="table">
                <thead>
                    <tr>
                        <th>N°</th>
                        <th>PRODUCTO</th>
                        <th>PRECIO</th>
                        <th>CANTIDAD</th>
                        <th colspan="2">OPERACION</th>
                    </tr>
                </thead>
                <tbody id="tablita">
                    
                    <c:forEach  var="det" items="${listDetalle}" varStatus="status">
                        <tr>
                            <td>${status.index +1}</td>
                            <td>${det.nom_producto}</td> 
                            <td>${det.precio}</td> 
                            <td>${det.cantidad}</td> 
                            <td>
                            <td>
                                <%---
                                <button onclick="modificarVenta(${det.idd})" class="btn btn-warning"><i class="fa fa-pencil-square-o" aria-hidden="true"></i></button>
                                <button onclick="eliminarVenta(${det.idd})" class="btn btn-danger"><i class="fa fa-times" aria-hidden="true"></i></button>
                                --%>
                            </td> 
                        </tr>
                    </c:forEach>
                </tbody>

            </table>
        </div>

        <div class="modal fade" id="add_new_record_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Registrar Rol</h4>
                    </div>
                    <div class="modal-body">
                        <div class="form-group">
                            <label for="first_name">Rol</label>
                            <input type="text" id="nomrol" placeholder="Rol.." class="form-control" />
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                        <button type="button" class="btn btn-primary" onclick="nuevo()" data-dismiss="modal"><i class="fa fa-floppy-o" aria-hidden="true"></i></button>
                    </div>
                </div>
            </div>
        </div> 
        <div class="modal fade" id="update_user_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Modificar Rol</h4>
                    </div>
                    <div class="modal-body">
                        <div class="form-group">
                            <label for="first_name">Rol</label>
                            <input type="text" id="rol-edit" placeholder="Rol.." class="form-control"/>
                            <input type="hidden" id="rol-edit-id"/>
                            <input type="hidden" id="rol-edit-op" value="3"/>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                        <button type="button" class="btn btn-primary" onclick="actualizar()"><i class="fa fa-floppy-o" aria-hidden="true"></i></button>
                    </div>
                </div>
            </div>
        </div>
        </script>
    </body>
</html>
