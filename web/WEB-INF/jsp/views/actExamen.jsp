<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <%@include file="cabecera.jsp" %><br>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <body>

   
       <div class="container">
            <div class="row">
                <div class="col-sm-4 col-sm-offset-4">
                    <div>
                        <h1>Actualizar Examenes</h1>                    
                    </div><center>
                        <div class="carb body">
                           <form:form cssClass="navbar-form " method="post" commandName="consulta">
                                <form:errors path="*" element="div" cssClass="alert alert-danger" />
                                <div class="form-group">
                                    <form:label path="NombreDoctor" >Nombre Doctor Asignado: </form:label><br>
                                    <form:input path="NombreDoctor" cssClass="form-control"></form:input>            
                                </div><br><br>
                                <div class="form-group" >
                                    <form:label path="TipoExamen">Tipo de Examen: </form:label><br>
                                    <form:input path="TipoExamen" cssClass="form-control"></form:input>
                                </div>
                                <br> <br>            
                                <div class="form-group" >
                                    <form:label path="Consultorio" >Consultorio Asignado: </form:label><br>
                                    <form:input path="Consultorio" cssClass="form-control"></form:input>
                                </div>
                                <br><br><br>         
                                <center>
                                    <form:button name="BtnEnviar" class="btn btn-info">Actualizar Examen</form:button>
                                    <form:button href="index.htm" name="BtnRegresar" class="btn btn-info">Regresar</form:button>
                                </center>
                             </form:form>

                        </div></center>
                </div>
            </div>
        </div>
    </body>
</html>
