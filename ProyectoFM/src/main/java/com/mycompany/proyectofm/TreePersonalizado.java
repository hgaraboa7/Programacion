/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofm;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 *
 * @author hector.garaboacasas
 */
public class TreePersonalizado extends DefaultTreeCellRenderer {

  private ImageIcon directorioCerrado;
    private ImageIcon directorioAbierto;
    private ImageIcon archivoIcono;

    public TreePersonalizado() {
        // Cargar iconos desde el directorio de recursos
        directorioCerrado = new ImageIcon("src/main/resources/images/directory_closed.png");
        directorioAbierto = new ImageIcon("src/main/resources/images/directory_open.png");
        archivoIcono = new ImageIcon("src/main/resources/images/file.png");
    }

   
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, int row) {
        // Llamar al método de la superclase para obtener el componente base
       // super.getTreeCellRendererComponent(tree, value, selected, expanded, row);
        
        // Comprobar si el nodo es un ArchivoNodo
        if (value instanceof DefaultMutableTreeNode) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
            if (node.getUserObject() instanceof ArchivoNodo) {
                ArchivoNodo archivo = (ArchivoNodo) node.getUserObject();
                // Asignar el icono adecuado según si es directorio o archivo
                if (archivo.isDirectorio()) {
                    setIcon(expanded ? directorioAbierto : directorioCerrado);
                } else {
                    setIcon(archivoIcono);
                }
            }
        }
        
        return this; // Retornar el componente
    }
}
