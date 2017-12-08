<%@page import="Class.Encript"%>

<%@page import="Class.Proyects"%>
<%@page import="java.util.List"%>
<%@page import="org.jdom2.Element"%>
<%@page import="org.jdom2.output.XMLOutputter"%>
<%@page import="org.jdom2.Document"%>
<%@page import="org.jdom2.input.SAXBuilder"%>
<%@page import="java.io.File"%>
<%
     String user = request.getParameter("user");
    String name = Encript.decrypt(user);  

%>

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
        
   
          <div  class="jumbotron ">   
          
                <div class="card text-center">
                    <div class="card-header">
                        <h2><b>Perfil</b></h2>  
                    </div>
                    <%
                         File XmlFile = new File("C:/Users/mario/Documents/NetBeansProjects/Proyect_TSBD/personas.xml");
            SAXBuilder db = new SAXBuilder();
            Document dc = db.build(XmlFile);
            XMLOutputter output = new XMLOutputter();
            //Elemento Raiz root
            Element root = dc.getRootElement();
            String direccion_postal="";
            //Elemnto hijo del root
            List<Element> child = root.getChildren("persona");
            
            for (int i = 0; i < child.size(); i++) {
              
                     
                    String tipo = child.get(i).getAttributeValue("tipo");
                    //System.out.println(tipo);
                    //elemnto del hijo
                    Element datos_generales = child.get(i).getChild("datos_generales");
                    //elemento del hijo
                    Element nombre_completo = datos_generales.getChild("nombre_completo");
                    //elemento del hijo
                    Element nombre = nombre_completo.getChild("nombre");
                    //atributo del hijo
                    String foto = nombre.getAttributeValue("foto");
                    //atributo del hijo
                    String cancion = nombre.getAttributeValue("canción");
                    //valor del hijo
                    String value = nombre.getText();
                     // String nombre2 = child.get(i).getText();
                 if (value.equals(name)) {

// System.out.println(foto + cancion + value);
                    Element apat = nombre_completo.getChild("apat");
                    //valor del hijo
                    String val = apat.getText();
                    //System.out.println(val);
                    //elemnto hijo
                    Element amat = nombre_completo.getChild("amat");
                    //texto del hijo
                    String v = amat.getText();
                       
                    //System.out.println(v);
                    Element contacto = datos_generales.getChild("contacto");
                    //elemento del hijo contacto
                    Element telefono_numero = contacto.getChild("telefono_numero");
                    String value2 = telefono_numero.getValue();
                    String tip = telefono_numero.getAttributeValue("tipo");
                    String ext = telefono_numero.getAttributeValue("ext");
                    //System.out.println(tip+ext+value2);

                    Element correo = contacto.getChild("correo");
                    String corre = correo.getText();
                    //      System.out.println(corre);
                    Element oficina = contacto.getChild("oficina");
                    String edificio = oficina.getAttributeValue("edificio");
                    // System.out.println(edificio);
                    String num_oficina = oficina.getAttributeValue("num_oficina");
                    //System.out.println(num_oficina);
                     direccion_postal = oficina.getAttributeValue("direccion_postal");
                    //System.out.println(direccion_postal);
                    
                    %>
                    
                  <div class="container mt-5 mb-7 text-center text-md-left">
        <div class="row mt-7">

            <!--First column-->
            <div class="col-md-3 col-lg-5 col-xl-5 mb-r">
               
                        <img src="<%=foto%>" width="55%" height="60%">                    
                        <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;"><br>
                Nombre: <%=value+" "+val+" "+v%><br>
                                Correo: <%=corre%><br>
                                Tel: <%=value2%> ext: <%= ext%>
                                Cubiculo:<%=edificio+"-" + num_oficina%>   
            </div>
            
            
                                <%
                                    
                                    Element datos_academicos = child.get(i).getChild("datos_academicos");
                    String categoria = datos_academicos.getAttributeValue("categoria");
                    //System.out.println(categoria);
                    String año_ingreso = datos_academicos.getAttributeValue("año_ingreso");
                    //System.out.println(año_ingreso);
                    String tiempo_dedicacion = datos_academicos.getAttributeValue("tiempo_dedicacion");
                    // System.out.println(tiempo_dedicacion);
                    String tipo_contrato = datos_academicos.getAttributeValue("tipo_contrato");
                    //System.out.println(tipo_contrato);
                    String departamento = datos_academicos.getAttributeValue("departamento");
                    //System.out.println(departamento);
                    Element grados = datos_academicos.getChild("grados");
                    
                    %>
                     <div class="col-md-3 col-lg-4 col-xl-3 mb-r">
                <h6 class="title font-bold"><strong>Datos Académicos</strong></h6>
                <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
                
                    <%
                    List<Element> grado = grados.getChildren();
                    for (int j = 0; j < grado.size(); j++) {
                        String nivel = grado.get(j).getAttributeValue("nivel");
                        String año = grado.get(j).getAttributeValue("año");
                        String institucion = grado.get(j).getAttributeValue("institucion");
                        String pais = grado.get(j).getAttributeValue("pais");
                       %> 
                       <li><%=nivel+" "+año+" "+institucion+" "+pais%></li>
                   <% }%>
                    
            </div>
                    <%
                    
                    Element reconocimientos = datos_academicos.getChild("reconocimientos");
                    Element reconocimiento = reconocimientos.getChild("reconocimiento");
                    String tipoR = reconocimiento.getAttributeValue("tipo");
                    //System.out.println(tipoR);
                    String año_ini = reconocimiento.getAttributeValue("año_ini");
                    //System.out.println(año_ini);
                    String año_fin = reconocimiento.getAttributeValue("año_fin");
                    //System.out.println(año_fin);
                    Element areas_de_interes = datos_academicos.getChild("areas_de_interes");
                    List<Element> area = areas_de_interes.getChildren();
                    %>
                        <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-r">
                        <h6 class="title font-bold"><strong>Intereses de Investigación</strong></h6>
                        <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">

            
                    <%
                    for (int k = 0; k < area.size(); k++) {
                        String nombreA = area.get(k).getAttributeValue("nombre");
                        %>
                        <li><%=nombreA%></li> 
                        <%
                    } %>
                        </div>
                        <br><br>
 <div class="col-md-3 col-lg-5 col-xl-5 mb-r">
                <h6 class="title font-bold"><strong>Intereses de docencia</strong></h6>
                <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
                
            </div>
<%
                    Element tesis_PhD = datos_academicos.getChild("tesis_PhD");
                    String titulo = tesis_PhD.getAttributeValue("titulo");
                    // System.out.println(titulo);
                    String institucion2 = tesis_PhD.getAttributeValue("institucion");
                    //System.out.println(institucion2);
                    String pais = tesis_PhD.getAttributeValue("pais");
                    // System.out.println(pais);
                    String año = tesis_PhD.getAttributeValue("año");
                    
                                    %>
                               <div class="col-md-3 col-lg-4 col-xl-3 mb-r">
                <h6 class="title font-bold"><strong>Semblanza</strong></h6>
                <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
            </div>
            <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-r">
                <h6 class="title font-bold"><strong>Mas información</strong></h6>
                <hr class="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
            </div>
        </div>               
          </div>
             <%                  
                 }
            
            }    
%>


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

    