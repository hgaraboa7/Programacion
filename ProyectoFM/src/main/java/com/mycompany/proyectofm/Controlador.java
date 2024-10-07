package com.mycompany.proyectofm;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.tree.DefaultMutableTreeNode;

public class Controlador {

    public File seleccionarDirectorio() {
        // Crea un nuevo JFileChooser para seleccionar archivos.
        JFileChooser fc = new JFileChooser();

        // Configura el JFileChooser para permitir solo la selección de directorios.
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        // Muestra el diálogo de selección de directorios y almacena el resultado.
        int result = fc.showOpenDialog(null);

        // Comprueba si el usuario aprobó la selección.
        if (result == JFileChooser.APPROVE_OPTION) {
            // Devuelve el directorio seleccionado.
            return fc.getSelectedFile();
        }
        // Si el usuario cancela, devuelve null.
        return null;
    }

    public void cargarArchivos(File dir, DefaultMutableTreeNode node) {
        // Obtiene la lista de archivos en el directorio especificado.
        File[] files = dir.listFiles();
        // Verifica si el directorio no está vacío.
        if (files != null) {
            for (File file : files) {
                // Crea un nuevo nodo para cada archivo o directorio.
                DefaultMutableTreeNode nodeHijo = new DefaultMutableTreeNode(file.getName());
                // Agrega el nodo hijo al nodo actual.
                node.add(nodeHijo);
                // Comprueba si el archivo actual es un directorio.
                if (file.isDirectory()) {
                    // Llama recursivamente al método para cargar archivos en el nodo hijo.

                    cargarArchivos(file, nodeHijo);
                }
            }
        }
    }
    
   
    
   // Método que carga un directorio por defecto y devuelve un nodo que representa su estructura.
 
    public DefaultMutableTreeNode cargarDirectorioPorDefecto() {
        // Directorio  por defecto, debe cambiarse para funcionar 
        File dirDefecto = new File("C:\\Users\\hecto\\OneDrive\\Escritorio");
         // Crea un nodo raíz que representará el directorio por defecto.
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(dirDefecto.getName());
          // Llama al método para llenar el nodo raíz con los archivos y subdirectorios del directorio por defecto.
        cargarArchivos(dirDefecto, root); 
        return root;
    }

}
