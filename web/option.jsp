<%@page import="Class.Encript"%>
<%@page import="java.util.List"%>
<%@page import="org.jdom2.Element"%>
<%@page import="org.jdom2.output.XMLOutputter"%>
<%@page import="org.jdom2.Document"%>
<%@page import="org.jdom2.input.SAXBuilder"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <tr>
<% 
          
    
    String type = request.getParameter("value");
    try{  
            
            
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
  
                 if (id.equals(type)) {
           String grado=child.get(i).getAttributeValue("grado");  
           
                 //System.out.println(grado);
            String tipo=child.get(i).getAttributeValue("tipo");            
            String estatus=child.get(i).getAttributeValue("estatus");            
            
            Element nombre=child.get(i).getChild("nombre");
            String valu=nombre.getText();
            %>
            
            
                    
                    
                    <td><%=valu%></td>
                    <td><%=grado%></td>
                    
                
                
            <%
            Element recursos=child.get(i).getChild("recursos");      
            Element monto_asignado=recursos.getChild("monto_asignado");
            Element institucion_otorgante=recursos.getChild("institucion_otorgante");
            Element numero_de_acuerdo=recursos.getChild("numero_de_acuerdo");
            
            Element  carreras=child.get(i).getChild("carreras");      
            List <Element> carrera = carreras.getChildren();
            %>
            <td>
                <%
            for(int j=0;j<carrera.size();j++){
                String carrera2=carrera.get(j).getText();
                %>
            <li><%=carrera2%></li> 
               <% //System.out.println(carrera2);
            }
            %>
              </td>
            <%
           Element asesor=child.get(i).getChild("asesor");      
           String id_asesor=asesor.getAttributeValue("id_asesor");
           String ases=asesor.getText();
           %>
           <td><%=tipo%></td>
           <td><%=ases%></td>
           <%

           String text=asesor.getText();
                  //System.out.println(text);
           Element periodo=child.get(i).getChild("periodo");      
           Element fecha_inicio=periodo.getChild("fecha_inicio");
           String dia=fecha_inicio.getAttributeValue("dia");
           String mes=fecha_inicio.getAttributeValue("mes");
           String año=fecha_inicio.getAttributeValue("año");
           String trimestre=fecha_inicio.getAttributeValue("trimestre");
           %>
           <td><%=dia+" de "+mes+año%></td>
           
           <%
           Element fecha_fin=periodo.getChild("fecha_fin");
           String dia_F=fecha_fin.getAttributeValue("dia");
           String mes_F=fecha_fin.getAttributeValue("mes");
           String año_F=fecha_fin.getAttributeValue("año");
           String trimestre_F=fecha_fin.getAttributeValue("trimestre");
           %>
           <td> <%=dia_F+" de "+mes_F+año_F%></td>
           <%
           
           Element laboratorio=child.get(i).getChild("laboratorio");      
           String lab=laboratorio.getText();
                 // System.out.println(lab);
           Element integrantes=child.get(i).getChild("integrantes");      
           List <Element> integrante=integrantes.getChildren();
           
           %>
           
           <td>
           <%
           for(int k=0;k<integrante.size();k++){
                String tipo_I=integrante.get(k).getAttributeValue("tipo");
                String nom=integrante.get(k).getAttributeValue("nom");
                String apat=integrante.get(k).getAttributeValue("apat");
                String amat=integrante.get(k).getAttributeValue("amat");
                String lic=integrante.get(k).getAttributeValue("lic");
                String estatus_I=integrante.get(k).getAttributeValue("estatus");
                 
                String cif=Encript.encrypt(nom);
                %>
           <li> Nombre: <a href="user.jsp?id=<%=cif%>"><%=nom%></a>  Apellidos: <%=apat+" "+amat %> </li>
                                 
               <% // System.out.println(estatus);
            } %>
            </td>
            <%

            Element resumen=child.get(i).getChild("resumen");      
            String resu=resumen.getText();
            %>
            <td><%=resu%> </td>
                
            <%
            //System.out.println(resu);
                  
            Element Obj_general=child.get(i).getChild("Obj_general");            
            String valor=Obj_general.getText();
                 //System.out.println(valor);
           Element Obj_especifico=child.get(i).getChild("Obj_especifico");                  
           String num=Obj_especifico.getAttributeValue("num");
           String val=Obj_especifico.getText();
                 // System.out.println(num+val);
                  
                  
           Element tecnologias=child.get(i).getChild("tecnologias");                  
           List <Element> tecnologia=tecnologias.getChildren();
               for(int q=0;q<tecnologia.size();q++){
                   String value=tecnologia.get(q).getText();
                   //System.out.println(value);
               }
               %>
               <td>
               <%
        Element conocimientos_previos=child.get(i).getChild("conocimientos_previos");                  
           List <Element> tema=conocimientos_previos.getChildren();
               for(int r=0;r<tema.size();r++){
                   String tema2=tema.get(r).getText();
                    %>
                        
            <li><%=tema2%></li> 
                    <%
//System.out.println(tema2);
               }
                }


              %>
              </td>
            
                   
<% } 
}catch(Exception e){ %>
<h1><%=e.getMessage()%></h1>
  <%         // System.out.println("Exception : "+e.getMessage());
           
        }
            %>
    </tr>           