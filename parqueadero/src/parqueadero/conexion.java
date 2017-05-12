
package parqueadero;

import java.sql.*;
import javax.swing.*;
public class conexion {
    public String usuario="sa";
    public String password="123";
    public String url="jdbc:sqlserver://localhost:1433;databaseName:Parqueadero";
    
    public Connection cn=null;
    public Statement st=null;
    
    public Statement Conectar(){
        try{
            Connection cn=DriverManager.getConnection(url,usuario,password);
            st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        }
        catch (SQLException i){
            JOptionPane.showMessageDialog(null,i);
        }
        return st;
    }
}

javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncerrarsesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 130, 460);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Planta-de-parqueaderos.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 20, 300, 250);

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jToggleButton1.setText("UNO");
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(180, 70, 130, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnacercadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnacercadeMouseClicked
        AcercaDe d=new AcercaDe();
        d.setVisible(true);
    }//GEN-LAST:event_btnacercadeMouseClicked

    private void btnsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseClicked
        int reply=JOptionPane.showConfirmDialog(null,"Desea salir del sistema");
        if (reply == JOptionPane.YES_OPTION)
        {
          System.exit(0);
        }
    }//GEN-LAST:event_btnsalirMouseClicked

    private void btncerrarsesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarsesionMouseClicked
        int reply=JOptionPane.showConfirmDialog(null,"Desea cerrar Seción");
        if (reply==JOptionPane.YES_OPTION)
        {
            LogIn d=new LogIn();
            d.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btncerrarsesionMouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ParqueaderoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParqueaderoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParqueaderoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParqueaderoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParqueaderoAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnacercade;
    private javax.swing.JToggleButton btncerrarsesion;
    private javax.swing.JToggleButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
