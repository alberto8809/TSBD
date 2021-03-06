
package Class;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author mario
 */
public class Test_Alumno {

    public static void main(String[] args) throws JDOMException, IOException {
        Scanner in = new Scanner(System.in);
        try {

            File XmlFile = new File("alumnos.xml");
            SAXBuilder db = new SAXBuilder();
            Document dc = db.build(XmlFile);
            XMLOutputter output = new XMLOutputter();
            //Elemento Raiz root
            Element root = dc.getRootElement();
            //Elemnto hijo del root
            List <Element> alumno =  root.getChildren("alumno");
            System.out.println("dame id");
            String idUser=in.next();
            
            
            
            for (int i = 0; i < alumno.size(); i++) {
                String id=alumno.get(i).getAttributeValue("id");
                if (id.equals(idUser)) {
                    Element datos_generales=alumno.get(i).getChild("datos_generales");
                    Element nombre_completo=datos_generales.getChild("nombre_completo");
                    Element nombre=nombre_completo.getChild("nombre");
                     String valu=nombre.getText();
                     System.out.println(valu);
                    Element apPaterno=nombre_completo.getChild("apPaterno");
                   String apPaterno2=apPaterno.getText();
            
                    Element apMaterno=nombre_completo.getChild("apMaterno");
                    String apM=apMaterno.getText();

                    Element direccion_completa=datos_generales.getChild("direccion_completa");
                    Element calle=direccion_completa.getChild("calle");
                    String c=calle.getText();
                           //System.out.println(c);
                    Element numero_ext=direccion_completa.getChild("numero_ext");       
                    String num=numero_ext.getText();
                           //System.out.println(num);
                    Element numero_int=direccion_completa.getChild("numero_int");              
                    String numI=numero_int.getText();

                    Element colonia=direccion_completa.getChild("colonia");              
                    String col=colonia.getText();

                    Element delegacion=direccion_completa.getChild("delegacion");              
                    String del=delegacion.getText();

                    Element cp=direccion_completa.getChild("cp");              
                    String c2=cp.getText();

                    Element datos_academicos=alumno.get(i).getChild("datos_academicos");
                    Element carrera=datos_academicos.getChild("carrera");
                    String ca=carrera.getText();
                          // System.out.println(ca);
                    Element universidad=datos_academicos.getChild("universidad");       
                    String uni=universidad.getText();
                          // System.out.println(uni);
                    Element creditos=datos_academicos.getChild("creditos");              
                    String credits=creditos.getText();
                           //System.out.println(credits);
                    Element division=datos_academicos.getChild("division");              
                    String div=division.getText();
                          // System.out.println(div);

         
                }
                
                
                
            }
            
            

          
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
            e.printStackTrace();
        }
        //Element root = new Element("personas");
    }
}
