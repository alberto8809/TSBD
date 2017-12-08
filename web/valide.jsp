<%@page import="Class.Encript"%>
<%@page import="java.util.List"%>
<%@page import="org.jdom2.Element"%>
<%@page import="org.jdom2.output.XMLOutputter"%>
<%@page import="org.jdom2.Document"%>
<%@page import="java.io.File"%>
<%@page import="org.jdom2.input.SAXBuilder"%>
<%
    String nombre = request.getParameter("nombre");
    String pass=request.getParameter("pass");
    File XmlFile = new File("C:/Users/mario/Documents/NetBeansProjects/Proyect_TSBD/admin.xml");
            SAXBuilder db = new SAXBuilder();
            Document dc = db.build(XmlFile);
            XMLOutputter output = new XMLOutputter();
            //Elemento Raiz root
            Element root=dc.getRootElement();
            //Elemnto hijo del root
            List  <Element> p=root.getChildren("persona");
            
                  for (int i = 0; i < p.size(); i++) {
                      Element nameU=p.get(i).getChild("nombre");
                      Element passU=p.get(i).getChild("pass");
                      String pas=passU.getText();
                      String name=nameU.getText();
                      if (name.equals(nombre) && pas.equals(pass)) {
                          String name2=Encript.encrypt(name);
                            response.sendRedirect("Admin.jsp?admin="+name2);
                            break;
                         }else{
                           response.sendRedirect("error.jsp");
                           break;
                      }
                  }
            
    
%>
    