
<%@page import="Class.Proyects"%>
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
            <script src="functions.js"></script>
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
                            <a class="nav-link" href="" data-toggle="modal" data-target="#myModal3">Entrar</a>
                          </li>
                                                   
                        </ul>
                      </div>
        </nav>
        <header>
   
          <div align="center" class="jumbotron">
             
              <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators ">
                      <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                      <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                      <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                      <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
                      <li data-target="#carouselExampleIndicators" data-slide-to="4"></li>
                    </ol>
                    <div class="carousel-inner " role="listbox">
                      <div class="carousel-item active">
                          <img class="img-fluid" src="índice.png" alt="First slide">
                      </div>
                      <div class="carousel-item">
                        <img class="d-block img-fluid" src="2.png" alt="Second slide">
                      </div>
                      <div class="carousel-item">
                        <img class="d-block img-fluid" src="3.png" alt="Third slide">
                      </div>
                        <div class="carousel-item">
                        <img class="d-block img-fluid" src="4.png" alt="Third slide">
                      </div>
                        <div class="carousel-item">
                        <img class="d-block img-fluid" src="5.png" alt="Third slide">
                      </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                      <span class="sr-only">Anterior</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                      <span class="carousel-control-next-icon" aria-hidden="true"></span>
                      <span class="sr-only">Siguiente</span>
                    </a>
                  </div>
           </div>
        </header>
         
        <section class="container text-center" >
            <h3 style="color:#0000ff "><b> Proyectos: </b></h3><br>
                 
                    <select name="select" class="form-control" >
                        
                        <%
                            File XmlFile = new File("C:/Users/mario/Documents/NetBeansProjects/Proyect_TSBD/Proyectos.xml");
                            SAXBuilder db = new SAXBuilder();
                            Document dc = db.build(XmlFile);
                            XMLOutputter output = new XMLOutputter();
                            //Elemento Raiz root
                            Element root=dc.getRootElement();
                            //Elemnto hijo del root
                            List <Element> child=root.getChildren("proyecto");


                                  for (int i = 0; i < child.size(); i++) {

                                         String id=child.get(i).getAttributeValue("estatus");
  
                                        %>
                                        <option value="<%=id%>" selected><%=id%></option>
                                    <%
                                        }
                                        %>
                    </select>
                 
            <br><br><br>
            <div>
                 <table class="table table-responsive ">

                  <thead class="table-info">
                    <tr>
                      <th>Nombre del Proyecto</th>
                      <th>Nivel</th>
                      <th>Carrera</th>
                      <th>Tipo</th>
                      <th>Asesor</th>
                      <th>Fecha de Inicio</th>
                      <th>Fecha Fin</th>
                      <th>Integrantes</th>
                      <th>Breve Resumen</th>
                      <th>Conocimientos Previos</th>
                    </tr>
                  </thead>
                    <tbody id="body">
                    </tbody>
                 </table>
            </div>
            
        </section>
        
        
        
        
        
<div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
        <div class="">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <center><br>
          <h3 style="color:#745ea8;"><b> Ingresar Datos  </b></h3> 
          </center>
        </div>
      
  <div class="modal-body">
          <form class="form-horizontal" action="valide.jsp" method="post">
            <div class="form-group">
               <label class="control-label col-sm-2" for="nombre">Nombre:</label>
               <div class="col-sm-10">
                <input type="text" class="form-control"  name="nombre" required/>
              </div>
            </div>
            <div class="form-group">
               <label class="control-label col-sm-2" for="pass">Contraseña:</label>
               <div class="col-sm-10">
                <input type="password" class="form-control" name="pass" required/>
              </div>
            </div>
          
            <center>

              <input type="submit"  value="Ingresar" class="btn btn-primary">
               
            </center>

        </form>
      </div>
     
    </div>
  </div>


    </body>
</html>

