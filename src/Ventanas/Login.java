/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import biblioteca.Main;
import biblioteca.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Carla Daniela
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SALIR = new javax.swing.JButton();
        ENTRAR = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        cnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SALIR.setBackground(new java.awt.Color(255, 51, 51));
        SALIR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SALIR.setForeground(new java.awt.Color(255, 255, 255));
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        getContentPane().add(SALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 90, -1));

        ENTRAR.setBackground(new java.awt.Color(0, 204, 0));
        ENTRAR.setForeground(new java.awt.Color(255, 255, 255));
        ENTRAR.setText("ENTRAR");
        ENTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTRARActionPerformed(evt);
            }
        });
        getContentPane().add(ENTRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 90, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("   ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("NOMBRE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));
        getContentPane().add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 220, 30));

        cnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnombreActionPerformed(evt);
            }
        });
        getContentPane().add(cnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 220, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 290, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FONDO (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnombreActionPerformed

    private void ENTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTRARActionPerformed
        String nombreIngresado = cnombre.getText();
        String idIngresado = cid.getText();

        boolean encontrado = false;
        for (Usuario usuario : Main.listaUsuarios) {
            if (usuario.getNombre().equals(nombreIngresado) && usuario.getIdUser().equals(idIngresado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            new SegundaVentana().setVisible(true);
            this.dispose();  // Cierra la ventana de login
        } else {
            JOptionPane.showMessageDialog(this, "Nombre o ID incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_ENTRARActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SALIRActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ENTRAR;
    private javax.swing.JButton SALIR;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
