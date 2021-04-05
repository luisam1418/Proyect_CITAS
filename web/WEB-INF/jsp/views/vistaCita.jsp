<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="cabecera.jsp" %><br>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
    
        <div class="container" style="width: 30%; margin: auto">
            <div class="panel panel-primary">
                <div class="panel-heading">Datos Cita Médica</div>
                <div class="panel-body">
                    <p>Nombre: <b> <c:out value="${nombre}"></c:out> </b></p>
                    <p>Número de identificación: <b> <c:out value="${ident}"></c:out> </b></p>
                    <p>Fecha: <b> <c:out value="${fecha}"></c:out> </b></p>
                    <p>Tipo de cita: <b> <c:out value="${tipo}"></c:out> </b></p>
                </div><br><center>
                    <a href="index.htm"><input type="button" class="btn btn-info" value="Regresar"></a>
                    <a href="AgendarCita.htm"><input type="button" class="btn btn-info" value="Volver a Ingresar"></a>
                </center><br>
            </div>
        </div>
    </body>
</html>
