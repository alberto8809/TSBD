package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Class.Proyects;
import java.util.List;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;
import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import java.io.File;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Temas Selectos de Base de Datos</title>\n");
      out.write("\n");
      out.write("            <meta charset=\"utf-8\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("            <meta name=\"description\" content=\"Base de Datos\">\n");
      out.write("            <meta name=\"author\" content=\"Base de Datos\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css\" >\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.1.1.slim.min.js\" ></script>\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js\" ></script>\n");
      out.write("            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js\" ></script>\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("            <script src=\"functions.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"page-top\">\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-inverse bg-primary \">\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                  <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button> \n");
      out.write("                <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">Equipo 1 - Mario, Ricardo, Tonatiuh -</a>\n");
      out.write("                      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("\n");
      out.write("                          <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"\" data-toggle=\"modal\" data-target=\"#myModal3\">Entrar</a>\n");
      out.write("                          </li>\n");
      out.write("                                                   \n");
      out.write("                        </ul>\n");
      out.write("                      </div>\n");
      out.write("        </nav>\n");
      out.write("        <header>\n");
      out.write("   \n");
      out.write("          <div align=\"center\" class=\"jumbotron\">\n");
      out.write("             \n");
      out.write("              <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                    <ol class=\"carousel-indicators \">\n");
      out.write("                      <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                      <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("                      <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("                      <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"3\"></li>\n");
      out.write("                      <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"4\"></li>\n");
      out.write("                    </ol>\n");
      out.write("                    <div class=\"carousel-inner \" role=\"listbox\">\n");
      out.write("                      <div class=\"carousel-item active\">\n");
      out.write("                          <img class=\"img-fluid\" src=\"índice.png\" alt=\"First slide\">\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block img-fluid\" src=\"2.png\" alt=\"Second slide\">\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block img-fluid\" src=\"3.png\" alt=\"Third slide\">\n");
      out.write("                      </div>\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block img-fluid\" src=\"4.png\" alt=\"Third slide\">\n");
      out.write("                      </div>\n");
      out.write("                        <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block img-fluid\" src=\"5.png\" alt=\"Third slide\">\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                      <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                      <span class=\"sr-only\">Anterior</span>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("                      <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                      <span class=\"sr-only\">Siguiente</span>\n");
      out.write("                    </a>\n");
      out.write("                  </div>\n");
      out.write("           </div>\n");
      out.write("        </header>\n");
      out.write("         \n");
      out.write("        <section class=\"container text-center\" >\n");
      out.write("            <h3 style=\"color:#0000ff \"><b> Proyectos: </b></h3><br>\n");
      out.write("                 \n");
      out.write("                    <select name=\"select\" class=\"form-control\" >\n");
      out.write("                        \n");
      out.write("                        ");

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
  
                                        
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print(id);
      out.write("\" selected>");
      out.print(id);
      out.write("</option>\n");
      out.write("                                    ");

                                        }
                                        
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                 \n");
      out.write("            <br><br><br>\n");
      out.write("            <div>\n");
      out.write("                 <table class=\"table table-responsive \">\n");
      out.write("\n");
      out.write("                  <thead class=\"table-info\">\n");
      out.write("                    <tr>\n");
      out.write("                      <th>Nombre del Proyecto</th>\n");
      out.write("                      <th>Nivel</th>\n");
      out.write("                      <th>Carrera</th>\n");
      out.write("                      <th>Tipo</th>\n");
      out.write("                      <th>Asesor</th>\n");
      out.write("                      <th>Fecha de Inicio</th>\n");
      out.write("                      <th>Fecha Fin</th>\n");
      out.write("                      <th>Integrantes</th>\n");
      out.write("                      <th>Breve Resumen</th>\n");
      out.write("                      <th>Conocimientos Previos</th>\n");
      out.write("                    </tr>\n");
      out.write("                  </thead>\n");
      out.write("                    <tbody id=\"body\">\n");
      out.write("                    </tbody>\n");
      out.write("                 </table>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("<div class=\"modal fade\" id=\"myModal3\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <div class=\"\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <center><br>\n");
      out.write("          <h3 style=\"color:#745ea8;\"><b> Ingresar Datos  </b></h3> \n");
      out.write("          </center>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("  <div class=\"modal-body\">\n");
      out.write("          <form class=\"form-horizontal\" action=\"valide.jsp\" method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("               <label class=\"control-label col-sm-2\" for=\"nombre\">Nombre:</label>\n");
      out.write("               <div class=\"col-sm-10\">\n");
      out.write("                <input type=\"text\" class=\"form-control\"  name=\"nombre\" required/>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("               <label class=\"control-label col-sm-2\" for=\"pass\">Contraseña:</label>\n");
      out.write("               <div class=\"col-sm-10\">\n");
      out.write("                <input type=\"password\" class=\"form-control\" name=\"pass\" required/>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("            <center>\n");
      out.write("\n");
      out.write("              <input type=\"submit\"  value=\"Ingresar\" class=\"btn btn-primary\">\n");
      out.write("               \n");
      out.write("            </center>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
