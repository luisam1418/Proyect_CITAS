<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <%@include file="cabecera.jsp" %><br>
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

        <div class="card border-info"><center>
                <div class="">
                    <a href="agregarExamen.htm" class="btn btn-primary">Agregar Examen</a>
                </div></center><br>
                <div class="card-body ">
                    <table class="table table-bordered table-striped table-hover" id="TabExam">
                        <thead>
                            <th>Id</th>
                            <th>Nombre Doctor</th>
                            <th>Tipo Examen</th>
                            <th>Consultorio</th>
                            <th>Acciones</th>
                        </thead>
                        <tbody>
                            <c:forEach items="${consultar}" var="dato">
                            <tr>
                                <td><c:out value="${dato.IdUsuario}"></c:out></td>
                                <td><c:out value="${dato.NombreDoctor}"></c:out></td>
                                <td><c:out value="${dato.TipoExamen}"></c:out></td>
                                <td><c:out value="${dato.Consultorio}"></c:out></td>
                                <td>
                                    <a href="actExamen.htm?IdUsuario=${dato.IdUsuario}" class="btn btn-warning">
                                    Update
                                    </a> 
                                    <a href="borrarExamen.htm?IdUsuario=${dato.IdUsuario}" class="btn btn-danger">
                                    Delete
                                    </a>
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
    </body>
</html>

