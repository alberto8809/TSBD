package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"MarketLine Mobile\">\n");
      out.write("    <meta name=\"author\" content=\"MarketLine Mobile\">\n");
      out.write("    <!-- <link rel=\"shortcut icon\" href=\"../../img/favicon.ico\"> -->\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("   \n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/simple-line-icons/css/simple-line-icons.css\">\n");
      out.write("\n");
      out.write("    <link href=\"css/new-age.min.css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("      <body id=\"page-top\">\n");
      out.write("\n");
      out.write("    <!-- Navigation -->\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light fixed-top\" id=\"mainNav\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">MarketLine Mobile</a>\n");
      out.write("        <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          Menu\n");
      out.write("          <i class=\"fa fa-bars\"></i>\n");
      out.write("        </button> \n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("          <ul class=\"navbar-nav ml-auto\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link js-scroll-trigger\" href=\"\" data-toggle=\"modal\" data-target=\"#myModal3\"><i class=\"fa fa-user-o\"></i>  Entrar </a>\n");
      out.write("            </li>\n");
      out.write("             <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link js-scroll-trigger\" href=\"tienda.php\" ><i class=\"fa fa-navicon\"></i>  Tienda en Línea </a>\n");
      out.write("            </li>\n");
      out.write("             <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link js-scroll-trigger\" href=\"telefonia.php\" ><i class=\"fa fa-navicon\"></i>  Telefonía </a>\n");
      out.write("            </li>\n");
      out.write("             <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link js-scroll-trigger\" href=\"servicios.php\"><i class=\"fa fa-navicon\"></i>  Servicios </a>\n");
      out.write("            </li>\n");
      out.write("            <!-- <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link js-scroll-trigger\"  href=\"\" data-toggle=\"modal\" data-target=\"#myModal2\"><i class=\"fa fa-file-excel-o\"></i>  Ver Registros CDR's</a>\n");
      out.write("            </li> -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link js-scroll-trigger\" href=\"\" data-toggle=\"modal\" data-target=\"#myModal\"><i class=\"fa fa-navicon\"></i>  ¿Quiénes somos?</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    <br><br>\n");
      out.write("    \n");
      out.write("    <header >\n");
      out.write("      <!-- <div class=\"container h-100\">\n");
      out.write("        <div class=\"row h-100\">\n");
      out.write("          <div class=\"col-lg-8 my-auto\">\n");
      out.write("            <div class=\"header-content mx-auto\"> -->\n");
      out.write("          <div align=\"center\" class=\"jumbotron\">   \n");
      out.write("             <!-- <img src=\"img/market.png\"> -->\n");
      out.write("\n");
      out.write("             <div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\n");
      out.write("  <!-- Indicators -->\n");
      out.write("  <ul class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"2\"></li>\n");
      out.write("    <li data-target=\"#demo\" data-slide-to=\"3\"></li>\n");
      out.write("  </ul>\n");
      out.write("\n");
      out.write("  <!-- The slideshow -->\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img src=\"img/1.jpg\" alt=\"Telcel\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"img/2.jpg\" alt=\"Telcel\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"img/3.jpg\" alt=\"Telcel\">\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("<div class=\"carousel-item\">\n");
      out.write("      <img src=\"img/4.jpg\" alt=\"Telcel\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("   </div>\n");
      out.write("  <!-- Left and right controls -->\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\"></span>\n");
      out.write("  </a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("           \n");
      out.write("              \n");
      out.write("            <!-- </div>\n");
      out.write("          </div>\n");
      out.write("      \n");
      out.write("        </div>\n");
      out.write("      </div> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("  <!--   <br><br><br>\n");
      out.write("   -->\n");
      out.write("    <?php include('dynamic/lib/footer.php'); ?>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript -->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/popper/popper.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Plugin JavaScript -->\n");
      out.write("    <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom scripts for this template -->\n");
      out.write("    <script src=\"js/new-age.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <div class=\"\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <center><br>\n");
      out.write("          <h3 class=\"bg-primary\" style=\"color:#745ea8;\"><b> Acerca de nosotros </b></h3> \n");
      out.write("          \n");
      out.write("          </center>\n");
      out.write("        </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("\n");
      out.write("     <div align=\"center\">\n");
      out.write("                    <h2 style=\"color:#745ea8;\">MarkeLine Mobile</h2><br>\n");
      out.write("          <img src=\"img/market.png\"><br><br>\n");
      out.write("          <p style=\"text-align: justify;\">En la actualidad los distribuidores autorizados de telefonía móvil dan servicios como: artículos, planes tarifarios, accesorios, servicio al cliente, entro otros. Cada distribuidor está comprometido a cierto servicio de telefonía en particular. Es importante reconocer destacar que cada distribuidor lleva como referencia una compañía (carrier).\n");
      out.write("Lo que se busca como nueva propuesta llamada “MarketLine Mobile” es ofrecer los mismos servicios de un distribuidor con una idea diferente a la que se viene haciendo en la actualidad. MarketLine Mobile ofrecerá los servicios de cualquier tipo de compañía (carrier) no necesariamente uno en particular.\n");
      out.write("</p><b>Objetivo General</b>\n");
      out.write("<br><p style=\"text-align: justify;\"> <br><br>\n");
      out.write("Generar una plataforma para lograr un mayor alcance para la venta de los accesorios, servicios, paquetes y celulares de la empresa MarketLine Mobile y tener una mayor presencia en el Mercado.\n");
      out.write("</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("  <footer>\n");
      out.write("     \n");
      out.write("    <?php include('dynamic/lib/footer.php'); ?>\n");
      out.write("      \n");
      out.write("    </footer> \n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("     \n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- login -->\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"myModal3\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <div class=\"\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("          <center><br>\n");
      out.write("          <h3 style=\"color:#745ea8;\"><b> Ingresar datos correspondientes </b></h3> \n");
      out.write("          </center>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("  <div class=\"modal-body\">\n");
      out.write("          <form class=\"form-horizontal\" action=\"valida.php\" method=\"post\">\n");
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
      out.write("                 <br><br><a href=\"\" data-toggle=\"modal\" data-target=\"#exampleModalLong\"> <b>Registar</b></a>\n");
      out.write("\n");
      out.write("            </center>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("     <br><br>\n");
      out.write("\t\t <footer>\n");
      out.write("\n");
      out.write("</html>\n");
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
