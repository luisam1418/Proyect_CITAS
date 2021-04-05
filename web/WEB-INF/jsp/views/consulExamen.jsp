

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    
    <head>
 <%@include file="cabecera.jsp" %><br>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
        <script src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.23/js/dataTables.bootstrap.min.js"></script>
        <link href="https://cdn.datatables.net/1.10.23/css/dataTables.bootstrap.min.css"/>
        

        <script>
            $(document).ready(function() {
                $('#TabExam').DataTable({
                    "paging": true,
                    "buttons": true,
                    "lengthMenu": [[5, 10, 25, -1], [5, 10, 25, "ALL"]],
                    "language": {"url": "https://cdn.datatables.net/plug-ins/1.10.22/i18n/Spanish.json"},
                    "paginate": true    
                });
            } );
        </script>
        
    </head>
    <body>
       
        <div class="container">
            <div class="row">
                <div class="col-sm-4 col-sm-offset-4">
                    <div>
                        <h1>Consultar Examenes</h1>                    
                    </div>
                    <form:form cssClass="navbar-form " method="post" commandName="consultar">  
                        <center>
                            <form:button name="BtnEnviar" class="btn btn-info">Enviar</form:button>
                            <form:button href="index.htm" name="BtnRegresar" class="btn btn-info">Regresar</form:button>
                        </center>
                     </form:form>
                    <br><br>
                    
                </div>
            </div>
        </div></center>
    </body>
</html>

