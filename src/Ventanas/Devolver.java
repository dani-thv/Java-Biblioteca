/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Ventanas;

import biblioteca.Biblioteca;
import biblioteca.Libro;
import biblioteca.Main;
import static biblioteca.Main.listaPrestamos;
import biblioteca.Prestamo;
import java.util.List;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Carla Daniela
 */
public class Devolver extends javax.swing.JFrame {
    /** Creates new form SegundaVentana */
    public Devolver() {
        initComponents();

        this.setLocationRelativeTo(null);

    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        note = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        devolver = new javax.swing.JButton();
        fecha = new javax.swing.JTextField();
        titulolib = new javax.swing.JTextField();
        MENU = new javax.swing.JButton();
        compraver = new javax.swing.JButton();
        compras = new javax.swing.JLabel();
        saliir = new javax.swing.JButton();
        notee = new javax.swing.JButton();
        product = new javax.swing.JButton();
        notee1 = new javax.swing.JButton();
        verproductos1 = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        note2 = new javax.swing.JLabel();
        note1 = new javax.swing.JLabel();
        barra = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        note.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        note.setText("No sé");

        jMenuItem1.setText("jMenuItem1");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setText("FECHA DE DEVOLUCIÓN");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setText("  FECHA DE DEVOLUCIÓN:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 180, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("  TÍTULO DEL LIBRO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 160, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("fecha en la que este es devuelto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 240, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setText("Usuario para realizar la devolución, digite el libro y la");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 370, 30));

        devolver.setBackground(new java.awt.Color(204, 51, 255));
        devolver.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        devolver.setText("DEVOLVER");
        devolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverActionPerformed(evt);
            }
        });
        getContentPane().add(devolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 150, -1));
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 240, 30));

        titulolib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titulolibActionPerformed(evt);
            }
        });
        getContentPane().add(titulolib, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 240, 30));

        MENU.setBackground(new java.awt.Color(204, 153, 255));
        MENU.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        MENU.setText("MENÚ");
        MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUActionPerformed(evt);
            }
        });
        getContentPane().add(MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, 40));

        compraver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listado (1).png"))); // NOI18N
        compraver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraverActionPerformed(evt);
            }
        });
        getContentPane().add(compraver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 30, 20));

        compras.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        compras.setText("      Préstamos");
        getContentPane().add(compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 80));

        saliir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CERRAR.png"))); // NOI18N
        saliir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saliirActionPerformed(evt);
            }
        });
        getContentPane().add(saliir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 30, 20));

        notee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/devolver (1).png"))); // NOI18N
        notee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteeActionPerformed(evt);
            }
        });
        getContentPane().add(notee, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 30, 20));

        product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libroo (1).png"))); // NOI18N
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });
        getContentPane().add(product, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 30, 20));

        notee1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prestarr (1).png"))); // NOI18N
        notee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notee1ActionPerformed(evt);
            }
        });
        getContentPane().add(notee1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 30, 20));

        verproductos1.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        verproductos1.setText("      Libros");
        getContentPane().add(verproductos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, 80));

        salir.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        salir.setText("Salir");
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 140, 80));

        note2.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        note2.setText("Devolver");
        getContentPane().add(note2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 140, 80));

        note1.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        note1.setText("Prestar");
        getContentPane().add(note1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 140, 80));

        barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BARRA (1).png"))); // NOI18N
        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 500));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDO (1).png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compraverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraverActionPerformed
        new Prestamos().setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_compraverActionPerformed

    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed
        new Libros().setVisible(true);
        this.dispose();     
        
    }//GEN-LAST:event_productActionPerformed

    private void noteeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteeActionPerformed

    }//GEN-LAST:event_noteeActionPerformed

    private void saliirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saliirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_saliirActionPerformed

    private void MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUActionPerformed
        new SegundaVentana().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MENUActionPerformed

    private void notee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notee1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notee1ActionPerformed

    private void titulolibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titulolibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titulolibActionPerformed

    private void devolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverActionPerformed
    String tituloLibro = titulolib.getText().trim(); 
    String fechaDevolucion = fecha.getText().trim(); 

    // Validar que la fecha de devolución sea válida
    boolean fechaValida = validarFechaDevolucion(fechaDevolucion);

    if (!fechaValida) {
        JOptionPane.showMessageDialog(this, "La fecha de devolución no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Buscar el libro por el título en la lista de libros
    boolean libroEncontrado = false;
    Prestamo prestamoEncontrado = null;
    for (Prestamo prestamo : Main.listaPrestamos) {
        if (prestamo.getLibro().getTitulo().equalsIgnoreCase(tituloLibro)) {
            libroEncontrado = true;
            prestamoEncontrado = prestamo;
            break;
        }
    }        

    // Verificar si se encontró el libro y si está prestado
    if (!libroEncontrado) {
        JOptionPane.showMessageDialog(this, "El libro no está registrado como prestado.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // Verificar si la fecha de devolución coincide con la fecha esperada
        if (!prestamoEncontrado.getFechaDevolucion().equals(fechaDevolucion)) {
            JOptionPane.showMessageDialog(this, "La fecha de devolución no coincide con la fecha esperada.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Realizar la devolución eliminando el préstamo de la lista
            Main.listaPrestamos.remove(prestamoEncontrado);
            JOptionPane.showMessageDialog(this, "Devolución realizada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_devolverActionPerformed
    private boolean validarFechaDevolucion(String fechaDevolucion) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);
            Date fecha = sdf.parse(fechaDevolucion);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
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
            java.util.logging.Logger.getLogger(Devolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Devolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Devolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Devolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Devolver().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton MENU;
    private javax.swing.JLabel barra;
    private javax.swing.JLabel compras;
    private javax.swing.JButton compraver;
    private javax.swing.JButton devolver;
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel note;
    private javax.swing.JLabel note1;
    private javax.swing.JLabel note2;
    private javax.swing.JButton notee;
    private javax.swing.JButton notee1;
    private javax.swing.JButton product;
    private javax.swing.JButton saliir;
    private javax.swing.JLabel salir;
    private javax.swing.JTextField titulolib;
    private javax.swing.JLabel verproductos1;
    // End of variables declaration//GEN-END:variables



}

