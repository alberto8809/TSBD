/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.File;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author mario
 */
public class Proyects {
    
    
    public void activo(){
        try{  
            
            
            File XmlFile = new File("Proyectos.xml");
            SAXBuilder db = new SAXBuilder();
            Document dc = db.build(XmlFile);
            XMLOutputter output = new XMLOutputter();
            //Elemento Raiz root
            Element root=dc.getRootElement();
            //Elemnto hijo del root
            List <Element> child=root.getChildren("proyecto");
              
            
                  for (int i = 0; i < child.size(); i++) {
                      
                  
            //valor de atributo del hijo
            //String tipo=child.getAttributeValue("tipo");
            //System.out.println(tipo);
            //elemnto del hijo
            //Element proyecto=child.getChild("proyecto");
            String id=child.get(i).getAttributeValue("estatus");
  
          
                //System.out.println(id);
                if (id.equals("activo")) {
                  //System.out.println(id);
            String grado=child.get(i).getAttributeValue("grado");      
                  //System.out.println(grado);
            String tipo=child.get(i).getAttributeValue("tipo");            
            String estatus=child.get(i).getAttributeValue("estatus");            
            
            Element nombre=child.get(i).getChild("nombre");
            String valu=nombre.getText();
                  System.out.println(valu);
            Element recursos=child.get(i).getChild("recursos");      
            Element monto_asignado=recursos.getChild("monto_asignado");
            Element institucion_otorgante=recursos.getChild("institucion_otorgante");
            Element numero_de_acuerdo=recursos.getChild("numero_de_acuerdo");
            
            Element  carreras=child.get(i).getChild("carreras");      
            List <Element> carrera = carreras.getChildren();
            for(int j=0;j<carrera.size();j++){
                String carrera2=carrera.get(j).getText();
                //System.out.println(carrera2);
            }
           Element asesor=child.get(i).getChild("asesor");      
           String id_asesor=asesor.getAttributeValue("id_asesor");
                  //System.out.println(id_asesor);
           String text=asesor.getText();
                  //System.out.println(text);
           Element periodo=child.get(i).getChild("periodo");      
           Element fecha_inicio=periodo.getChild("fecha_inicio");
           String dia=fecha_inicio.getAttributeValue("dia");
           String mes=fecha_inicio.getAttributeValue("mes");
           String año=fecha_inicio.getAttributeValue("año");
           String trimestre=fecha_inicio.getAttributeValue("trimestre");
           
           Element fecha_fin=periodo.getChild("fecha_fin");
           String dia_F=fecha_inicio.getAttributeValue("dia");
           String mes_F=fecha_inicio.getAttributeValue("mes");
           String año_F=fecha_inicio.getAttributeValue("año");
           String trimestre_F=fecha_inicio.getAttributeValue("trimestre");
           
           
           Element laboratorio=child.get(i).getChild("laboratorio");      
           String lab=laboratorio.getText();
                 // System.out.println(lab);
           Element integrantes=child.get(i).getChild("integrantes");      
           List <Element> integrante=integrantes.getChildren();
            for(int k=0;k<integrante.size();k++){
                String tipo_I=integrante.get(k).getAttributeValue("tipo");
                String nom=integrante.get(k).getAttributeValue("nom");
                String apat=integrante.get(k).getAttributeValue("apat");
                String amat=integrante.get(k).getAttributeValue("amat");
                String lic=integrante.get(k).getAttributeValue("lic");
                String estatus_I=integrante.get(k).getAttributeValue("estatus");
                 System.out.println(estatus);
            }
            Element resumen=child.get(i).getChild("resumen");      
            String resu=resumen.getText();
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
           Element conocimientos_previos=child.get(i).getChild("conocimientos_previos");                  
           List <Element> tema=conocimientos_previos.getChildren();
               for(int r=0;r<tema.size();r++){
                   String tema2=tema.get(r).getText();
                   //System.out.println(tema2);
               }
                }
       }
            
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
            e.printStackTrace();
        }
    }
}
