package lmsfinal;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class frmsignup extends javax.swing.JFrame {

    public frmsignup() {
        initComponents();
        clear();
        setVisible(true);
        setResizable(false);
        this.setLocationRelativeTo(null);
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
        jButton9 = new javax.swing.JButton();
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
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setVerifyInputWhenFocusTarget(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnsignupActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 110, 30));

        jButton9.setBackground(java.awt.Color.white);
        jButton9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton9.setForeground(java.awt.Color.white);
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/i-left.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setVerifyInputWhenFocusTarget(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9bttnsignupActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg-signup.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnclearActionPerformed
     clear();
      
    }//GEN-LAST:event_bttnclearActionPerformed

    private void jButton9bttnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9bttnsignupActionPerformed
       clear();this.setVisible(false);
       new frmlogin().setVisible(true);
    }//GEN-LAST:event_jButton9bttnsignupActionPerformed
    private void clear(){
      fname.setText(null);
      femail.setText(null);
      fpassword.setText(null);
      fconfirmpassword.setText(null);
      fusername.setText(null);
    }
    private void bttnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnsignupActionPerformed
        String sqlquery = "INSERT INTO tbl_accounts (username, password, name, email) VALUES (?,?,?,?)";
        if (!fusername.getText().isEmpty() && !fpassword.getText().isEmpty() && !fname.getText().isEmpty() && !femail.getText().isEmpty() && !fconfirmpassword.getText().isEmpty()) {
    if (fpassword.getText().equals(fconfirmpassword.getText())) {
                try (Connection con = DB.open(); PreparedStatement preparedStatement = con.prepareStatement(sqlquery)) {

                    preparedStatement.setString(1, fusername.getText());
                    preparedStatement.setString(2, fpassword.getText());
                    preparedStatement.setString(3, fname.getText());
                    preparedStatement.setString(4, femail.getText());
                          int rowsAffected = preparedStatement.executeUpdate();
                     if (rowsAffected  > 0) {
                            Notification.show("Account Created! Proceeding to Login Form");
                            this.setVisible(false);
                            clear();

                            new frmlogin().setVisible(true);
                        }
                
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            } else {
                Notification.show("Passwords do not match");
            }
        } else {
            Notification.show("Answer All Fields");
        }

    }//GEN-LAST:event_bttnsignupActionPerformed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                 try {
    UIManager.setLookAndFeel( new FlatLightLaf() );
    } catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmsignup().setVisible(true);
            }
        });
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fconfirmpassword;
    private javax.swing.JTextField femail;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fpassword;
    private javax.swing.JTextField fusername;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
