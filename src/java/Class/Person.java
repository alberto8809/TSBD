/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Person {
    
    public String Value(String name) throws JDOMException{
        try {
            File XmlFile = new File("personas.xml");
            SAXBuilder db = new SAXBuilder();
            Document dc = db.build(XmlFile);
            XMLOutputter output = new XMLOutputter();
            //Elemento Raiz root
            Element root = dc.getRootElement();
            //Elemnto hijo del root
            List<Element> child = root.getChildren("persona");
            for (int i = 0; i < child.size(); i++) {
                
                Element datos_generales2 = child.get(i).getChild("datos_generales");
                //elemento del hijo
                Element nombre_completo2 = datos_generales2.getChild("nombre_completo");
                //elemento del hijo
                Element nombre2 = nombre_completo2.getChild("nombre");
                
                String nameP=nombre2.getText();
                if (nameP.equals(name)) {
                    return nameP;
                }else{
                    return name;
                }
            }
            return name;
        } catch (IOException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
         return name;
    }
    
    
}
