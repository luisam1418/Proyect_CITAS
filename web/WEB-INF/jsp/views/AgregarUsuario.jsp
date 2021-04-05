<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="cabecera.jsp" %><br>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    
    </head>
    <body>
   
        <div class="container">
            <div class="row">
                <div class="col-sm-4 col-sm-offset-4">
                    <div class="row">
                        <h3>Datos Usuario</h3>
                    </div>
                    <form:form method="post" commandName="usuario"> 
                        <div class="form-group">
                            <form:label path="nombre">Ingrese su nombre: </form:label>
                            <form:input path="nombre" class="form-control" placeholder="Luisa"></form:input>
                            <form:errors cssClass="alert alert-danger" element="div" path="Nombre"></form:errors>
                        </div>
                         <div class="form-group">
                            <form:label path="correo">Ingrese su correo electronico: </form:label>
                            <form:input path="correo" class="form-control" placeholder="bananasenpijama@gmail.com"></form:input>
                            <form:errors cssClass="alert alert-danger" element="div" path="Correo"></form:errors>
                        </div>
                         <div class="form-group">
                            <form:label path="edad">Ingrese su edad: </form:label>
                            <form:input path="edad" class="form-control" placeholder="18"></form:input>
                            <form:errors cssClass="alert alert-danger" element="div" path="Edad"></form:errors>
                        </div>
                            <form:button name="BtnEnviar" class="btn btn-info">Enviar</form:button>
                            <form:button href="index.htm" name="BtnRegresar" class="btn btn-info">Regresar</form:button>
                    </form:form><br>
                </div>
            </div>
        </div>
    </body>
</html>
