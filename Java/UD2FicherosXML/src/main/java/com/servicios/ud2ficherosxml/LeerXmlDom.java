/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servicios.ud2ficherosxml;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 *
 * @author hector.garaboacasas
 */
public class LeerXmlDom {
    
    public static void main(String[] args) {
        
        try {
            File fichero=new File("./src/main/resources/datos/clase_1.xml");
            
            if(!fichero.exists()){
                System.out.println("fichero no existe");
                return;
            }
            System.out.println("Proceso de lectura xml");
            
            DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder= dbFactory.newDocumentBuilder();
            Document doc=dBuilder.parse(fichero);
            
            NodeList Lista=doc.getElementsByTagName("alumno");
            
            for(int i=0;i<Lista.getLength();i++){
                Node nodo=Lista.item(i);
                //convertimos a elemento el nodo si el nodo es del tipo elemneto
                if(nodo.getNodeType()==Node.ELEMENT_NODE){
                    Element elalumno=(Element)nodo; 
                    
                    System.out.print("numero: "+ elalumno.getAttribute("numero"));
                    System.out.print(" nombre: "+elalumno.getElementsByTagName("nombre").item(0).getTextContent());
                    System.out.print(" apellido: "+elalumno.getElementsByTagName("apellido").item(0).getTextContent());
                    System.out.print(" apodo: "+elalumno.getElementsByTagName("apodo").item(0).getTextContent());
                    
                    System.out.print(" atributo de apodo: "+elalumno.getElementsByTagName("apodo").item(0).getNodeName());
                   
                    System.out.print(" marca: "+elalumno.getElementsByTagName("marca").item(0).getTextContent());
                    
                    System.out.println("");
                    
                    if(elalumno.getElementsByTagName("delegado").getLength()>0)
                        System.out.print("\t es el delegado\n");
                    
                }
                    
                
            }
            
            
            
            
            
            
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(LeerXmlDom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(LeerXmlDom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerXmlDom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
