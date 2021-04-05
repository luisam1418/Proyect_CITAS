
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
                        <h3>Asignación cita médica</h3>
                    </div>
                    <form:form method="post" commandName="cita"> 
                        <div class="form-group">
                            <form:label path="nombre">Ingrese su nombre completo: </form:label>
                            <form:input path="nombre" class="form-control" placeholder="Luisa Fernanda Manrique Fonseca"></form:input>
                            <form:errors cssClass="alert alert-danger" element="div" path="Nombre"></form:errors>
                        </div>
                        <div class="form-group">
                            <form:label path="ident">Ingrese su número de identificación: </form:label>
                            <form:input path="ident" class="form-control" placeholder="1000159211"></form:input>
                            <form:errors cssClass="alert alert-danger" element="div" path="Ident"></form:errors>
                        </div>
                         <div class="form-group">
                            <form:label path="fecha">Ingrese fecha en la que desea asignar su cita: </form:label>
                            <form:input path="fecha" class="form-control" placeholder="23/02/2021"></form:input>
                            <form:errors cssClass="alert alert-danger" element="div" path="Fecha"></form:errors>
                        </div>
                         <div class="form-group">
                            <form:label path="tipo">Ingrese el tipo de cita a asignar: </form:label>
                            <form:input path="tipo" class="form-control" placeholder="Odontologica"></form:input>
                            <form:errors cssClass="alert alert-danger" element="div" path="Tipo"></form:errors>
                        </div>
                        
                            <form:button name="BtnEnviar" class="btn btn-info">Enviar</form:button>
                            <form:button href="index.htm" name="BtnRegresar" class="btn btn-info">Regresar</form:button>
                    </form:form><br>
                </div>
            </div>
        </div>
    </body>
</html>