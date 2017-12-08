<%@page import="Class.Encript"%>
<%
    String nombre = request.getParameter("admin");
    String name = Encript.decrypt(nombre);

%>

<%@page import="java.util.List"%>
<%@page import="org.jdom2.Element"%>
<%@page import="org.jdom2.output.XMLOutputter"%>
<%@page import="org.jdom2.Document"%>
<%@page import="org.jdom2.input.SAXBuilder"%>
<%@page import="java.io.File"%>

   
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Temas Selectos de Base de Datos</title>

            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
            <meta name="description" content="Base de Datos">
            <meta name="author" content="Base de Datos">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" >
            <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" ></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" ></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" ></script>
            <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    </head>
    <body id="page-top">
        
        
        
        <nav class="navbar navbar-inverse bg-primary ">
  <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button> 
  <a class="navbar-brand js-scroll-trigger" href="#page-top">Equipo 1 - Mario, Ricardo, Tonatiuh -</a>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">

            <li class="nav-item">
              <a class="nav-link" href="index.jsp" >Salir</a>
            </li>

          </ul>
        </div>
</nav>
       <header >
   
          <div align="center" class="jumbotron">   
              <h2>Bienvenido: <%=name%></h2> 
            </div>
        </header>
         
            
    </body>
</html>

