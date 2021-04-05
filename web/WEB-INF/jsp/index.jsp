<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <style>
            ul {
              list-style-type: none;
              margin: 0;
              padding: 0;
              overflow: hidden;
              background-color: #333;
            }

            li {
              float: left;
            }

            li a {
              display: block;
              color: white;
              text-align: center;
              padding: 14px 16px;
              text-decoration: none;
            }

            li a:hover:not(.active) {
              background-color: #111;
              color: #0B5345;
            }

            .active {
              background-color: #2874A6;
            }
        </style>
        <title>EJERCICIO</title>
    </head>
    <body>
         <h1><b><center>EJERCICIO CON JSP, JSTL, FORMS, SPRING Y BEANS</center></b></h1>
        <nav>
            <ul>
                <li><a class="active" href="index.htm"> Home </a></li>
                <li><a href="AgregarUsuario.htm"> Agregar Usuario </a></li>
                <li><a href="AgendarCita.htm"> Agendar cita </a></li>
                <li><a href="consulExamen.htm">Consultar Examenes</a></li>
            </ul>
        </nav>
    </body>
</html>
