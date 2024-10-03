/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectografico;

import java.awt.Font;
import javax.swing.JMenuItem;

/**
 *
 * @author hecto
 */
public class Procesador extends javax.swing.JFrame {

    /**f
     * Creates new form Procesador
     */
    public Procesador() {
        initComponents();
        
        
        //metodo alternativo para construir elementos de menu personalizados
        //configura("Arial","fuente","",1,1);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        fuente = new javax.swing.JMenu();
        Arial = new javax.swing.JMenuItem();
        Courier = new javax.swing.JMenuItem();
        Verdana = new javax.swing.JMenuItem();
        estilo = new javax.swing.JMenu();
        Negrita = new javax.swing.JMenuItem();
        Cursiva = new javax.swing.JMenuItem();
        tamaño = new javax.swing.JMenu();
        tamaño12 = new javax.swing.JMenuItem();
        tamaño14 = new javax.swing.JMenuItem();
        tamaño16 = new javax.swing.JMenuItem();
        tamaño20 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setMargin(new java.awt.Insets(10, 10, 10, 10));

        fuente.setText("Fuente");

        Arial.setText("Arial");
        Arial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArialActionPerformed(evt);
            }
        });
        fuente.add(Arial);

        Courier.setText("Courier");
        Courier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourierActionPerformed(evt);
            }
        });
        fuente.add(Courier);

        Verdana.setText("Verdana");
        Verdana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerdanaActionPerformed(evt);
            }
        });
        fuente.add(Verdana);

        jMenuBar1.add(fuente);

        estilo.setText("Estilo");

        Negrita.setText("Negrita");
        estilo.add(Negrita);

        Cursiva.setText("Cursiva");
        estilo.add(Cursiva);

        jMenuBar1.add(estilo);

        tamaño.setText("Tamaño");

        tamaño12.setText("12");
        tamaño.add(tamaño12);

        tamaño14.setText("14");
        tamaño.add(tamaño14);

        tamaño16.setText("16");
        tamaño.add(tamaño16);

        tamaño20.setText("20");
        tamaño.add(tamaño20);

        jMenuBar1.add(tamaño);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CourierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourierActionPerformed
        
        jTextPane1.setFont(new Font("Courier",Font.PLAIN, 12));
        
        
    }//GEN-LAST:event_CourierActionPerformed

    private void ArialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArialActionPerformed
       jTextPane1.setFont(new Font("Arial", Font.PLAIN, 12)); 
    }//GEN-LAST:event_ArialActionPerformed

    private void VerdanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerdanaActionPerformed
         jTextPane1.setFont(new Font("Verdana", Font.PLAIN, 12));
    }//GEN-LAST:event_VerdanaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Procesador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Procesador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Procesador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Procesador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Procesador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Arial;
    private javax.swing.JMenuItem Courier;
    private javax.swing.JMenuItem Cursiva;
    private javax.swing.JMenuItem Negrita;
    private javax.swing.JMenuItem Verdana;
    private javax.swing.JMenu estilo;
    private javax.swing.JMenu fuente;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JMenu tamaño;
    private javax.swing.JMenuItem tamaño12;
    private javax.swing.JMenuItem tamaño14;
    private javax.swing.JMenuItem tamaño16;
    private javax.swing.JMenuItem tamaño20;
    // End of variables declaration//GEN-END:variables

    
    //metodo alternativo para construir elementos de menu
    public void configura(String rotulo,String menu, String tipo_letra, int estilos, int tam){
        
        JMenuItem elem_menu=new JMenuItem(rotulo);
        
        if(menu=="fuente"){
            fuente.add(elem_menu);
        }else if(menu=="estilo"){
            estilo.add(elem_menu);
        }else if(menu=="tamaño")
            tamaño.add(elem_menu);
        
        
        
        
    }

}
