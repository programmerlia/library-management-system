package lmsfinal;

import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.SwingUtilities;


public class frmsignup extends javax.swing.JFrame {

    public frmsignup() {
        initComponents();
        setVisible(true);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        femail = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        fpassword = new javax.swing.JTextField();
        fconfirmpassword = new javax.swing.JTextField();
        fusername = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        femail.setBackground(new java.awt.Color(246, 246, 246));
        femail.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        femail.setForeground(java.awt.Color.black);
        femail.setBorder(null);
        getContentPane().add(femail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 167, 180, -1));

        fname.setBackground(new java.awt.Color(246, 246, 246));
        fname.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        fname.setForeground(java.awt.Color.black);
        fname.setBorder(null);
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 223, 180, -1));

        fpassword.setBackground(new java.awt.Color(246, 246, 246));
        fpassword.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        fpassword.setForeground(java.awt.Color.black);
        fpassword.setBorder(null);
        getContentPane().add(fpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 284, 180, -1));

        fconfirmpassword.setBackground(new java.awt.Color(246, 246, 246));
        fconfirmpassword.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        fconfirmpassword.setForeground(java.awt.Color.black);
        fconfirmpassword.setBorder(null);
        getContentPane().add(fconfirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 180, -1));

        fusername.setBackground(new java.awt.Color(246, 246, 246));
        fusername.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        fusername.setForeground(java.awt.Color.black);
        fusername.setBorder(null);
        getContentPane().add(fusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 113, 180, -1));

        jButton7.setBackground(new java.awt.Color(165, 36, 34));
        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton7.setForeground(java.awt.Color.white);
        jButton7.setText("CLEAR");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setVerifyInputWhenFocusTarget(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnclearActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 110, 30));

        jButton8.setBackground(new java.awt.Color(165, 36, 34));
        jButton8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton8.setForeground(java.awt.Color.white);
        jButton8.setText("SIGNUP");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setVerifyInputWhenFocusTarget(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnsignupActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/signupbg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnclearActionPerformed
      fname.setText(null);
      femail.setText(null);
      fpassword.setText(null);
      fconfirmpassword.setText(null);
      fusername.setText(null);
      
    }//GEN-LAST:event_bttnclearActionPerformed

    private void bttnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnsignupActionPerformed

        if (fpassword.getText().equals(fconfirmpassword.getText())) {
            String sqlquery = "INSERT INTO tbl_accounts (username, password, name, email) VALUES ('" + fusername.getText() +
                    "', '" + fpassword.getText() +  "', '" + fname.getText() +  "', '" + femail.getText() +"')";
            DB.execute(sqlquery);
            showMessageDialog(null, "Account Created! Proceeding to Login Form");
            
            this.setVisible(false);
            new frmlogin().setVisible(true);
            
       
        } else {
            showMessageDialog(null, "Passwords do not match");
        }

    }//GEN-LAST:event_bttnsignupActionPerformed

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
            java.util.logging.Logger.getLogger(frmsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmsignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmsignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fconfirmpassword;
    private javax.swing.JTextField femail;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fpassword;
    private javax.swing.JTextField fusername;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
