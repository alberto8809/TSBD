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
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

public class Test_persona {

    public static void main(String[] args) throws JDOMException, IOException {
        Scanner in = new Scanner(System.in);
        try {

            File XmlFile = new File("personas.xml");
            SAXBuilder db = new SAXBuilder();
            Document dc = db.build(XmlFile);
            XMLOutputter output = new XMLOutputter();
            //Elemento Raiz root
            Element root = dc.getRootElement();
            //Elemnto hijo del root
            List<Element> child = root.getChildren("persona");
            System.out.println("dame id");
            String idUser = in.next();

            for (int i = 0; i < child.size(); i++) {
                String id = child.get(i).getAttributeValue("id");
                //System.out.println(id);
                if (id.equals(idUser)) {
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
                    System.out.println(foto + cancion + value);
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
                    String direccion_postal = oficina.getAttributeValue("direccion_postal");
                    //System.out.println(direccion_postal);
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
                    List<Element> grado = grados.getChildren();
                    for (int j = 0; j < grado.size(); j++) {
                        String nivel = grado.get(j).getAttributeValue("nivel");
                        String año = grado.get(j).getAttributeValue("año");
                        String institucion = grado.get(j).getAttributeValue("institucion");
                        String pais = grado.get(j).getAttributeValue("pais");
                        //System.out.println(nivel+año+institucion+pais);
                    }
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
                    for (int k = 0; k < area.size(); k++) {
                        String nombreA = area.get(k).getAttributeValue("nombre");
                        // System.out.println(nombreA);
                    }
                    Element tesis_PhD = datos_academicos.getChild("tesis_PhD");
                    String titulo = tesis_PhD.getAttributeValue("titulo");
                    // System.out.println(titulo);
                    String institucion2 = tesis_PhD.getAttributeValue("institucion");
                    //System.out.println(institucion2);
                    String pais = tesis_PhD.getAttributeValue("pais");
                    // System.out.println(pais);
                    String año = tesis_PhD.getAttributeValue("año");
                    //System.out.println(año);
                }

            }

        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
            e.printStackTrace();
        }
        
        Person p=new Person();
        String n=p.Value("Reyna Carolina");
        System.out.println(n);
        //Element root = new Element("personas");
    }
}
