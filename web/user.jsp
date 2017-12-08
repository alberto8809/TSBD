<%@page import="Class.Person"%>
<%@page import="Class.Encript"%>

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


        <%

            String nom = request.getParameter("id");
            String name = Encript.decrypt(nom);

            Person p = new Person();
            String nameP = p.Value(name);

            if (name.equals(nameP)) {
                File XmlFile = new File("C:/Users/mario/Documents/NetBeansProjects/Proyect_TSBD/personas.xml");
                SAXBuilder db = new SAXBuilder();
                Document dc = db.build(XmlFile);
                XMLOutputter output = new XMLOutputter();
                //Elemento Raiz root
                Element root = dc.getRootElement();
                //Elemnto hijo del root
                List<Element> child = root.getChildren("persona");

                for (int i = 0; i < child.size(); i++) {

                    String tipo = child.get(i).getAttributeValue("tipo");

                    Element datos_generales = child.get(i).getChild("datos_generales");
                    //elemento del hijo
                    Element nombre_completo = datos_generales.getChild("nombre_completo");
                    //elemento del hijo
                    Element nombre = nombre_completo.getChild("nombre");

                    nameP = nombre.getText();

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
        %>
        <header>

            <div align="center" class="jumbotron">   

                <h2>Bienvenid@: <%=value + " " + val + " " + v%></h2> 
            </div>
        </header>
        <div class="card text-center">
            <div class="card-header">
                <h2><b>Pasatiempos</b></h2>  
            </div>



            <center>
                <br>
                <img src="<%=foto%>" width="25%" height="60%">                                                        
                <br><br>
                <h5>Canción Favorita : <a href="<%=cancion%>" target="_blank"><%=cancion%></a> </h5>
                <br>
                <a href="CV.jsp?user=<%=nom%>"> <button class="btn btn-primary">Ver CV</button></a>
                <br><br>
            </center>    


            <%
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
                String direccion_postal = oficina.getAttributeValue("direccion_postal");
                //System.out.println(direccion_postal);

            %>
            <br><br>
            <div class="card-footer text-muted">

                <a href="mailto:<%=corre%>"><%=corre%></a> 

            </div>
        </div>
        <%

                }
            }
        } else {
        %>
        <header>
            <div align="center" class="jumbotron">   
                asasas
                <h2>Bienvenid@: <%=nameP%></h2> 
                <h1><%=nameP%></h1>
            </div>

        </header>
        <%
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
