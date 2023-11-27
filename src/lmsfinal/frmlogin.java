/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package lmsfinal;


import com.formdev.flatlaf.FlatLightLaf;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class frmlogin extends javax.swing.JFrame {

    public frmlogin() {
            
        initComponents();
        setVisible(true);
        setResizable(false);
        this.setLocationRelativeTo(null);
        clear();
    }

    public static void main(String args[]) {
       try {
    UIManager.setLookAndFeel( new FlatLightLaf() );
    } catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmlogin().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnclear = new javax.swing.JButton();
        bttnsignup = new javax.swing.JButton();
        fusername = new javax.swing.JTextField();
        bttnlogin = new javax.swing.JButton();
        showPass = new javax.swing.JLabel();
        fpassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttnclear.setBackground(new java.awt.Color(165, 36, 34));
        bttnclear.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        bttnclear.setForeground(java.awt.Color.white);
        bttnclear.setText("CLEAR");
        bttnclear.setBorder(null);
        bttnclear.setBorderPainted(false);
        bttnclear.setVerifyInputWhenFocusTarget(false);
        bttnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnclearActionPerformed(evt);
            }
        });
        getContentPane().add(bttnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 110, 40));

        bttnsignup.setFont(new java.awt.Font("Century Gothic", 1, 8)); // NOI18N
        bttnsignup.setForeground(new java.awt.Color(0, 0, 153));
        bttnsignup.setText("Click here to Create Account");
        bttnsignup.setBorder(null);
        bttnsignup.setBorderPainted(false);
        bttnsignup.setContentAreaFilled(false);
        bttnsignup.setVerifyInputWhenFocusTarget(false);
        bttnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnsignupActionPerformed(evt);
            }
        });
        getContentPane().add(bttnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 150, 20));

        fusername.setBorder(null);
        fusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fusernameActionPerformed(evt);
            }
        });
        getContentPane().add(fusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 220, -1));

        bttnlogin.setBackground(new java.awt.Color(165, 36, 34));
        bttnlogin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        bttnlogin.setForeground(java.awt.Color.white);
        bttnlogin.setText("LOGIN");
        bttnlogin.setBorder(null);
        bttnlogin.setBorderPainted(false);
        bttnlogin.setVerifyInputWhenFocusTarget(false);
        bttnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnloginActionPerformed(evt);
            }
        });
        getContentPane().add(bttnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 110, 40));

        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/picture eye.png"))); // NOI18N
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                showPassMouseReleased(evt);
            }
        });
        getContentPane().add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 30, -1));

        fpassword.setBorder(null);
        getContentPane().add(fpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 236, 210, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg-login.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void bttnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnclearActionPerformed
        clear();

    }//GEN-LAST:event_bttnclearActionPerformed

    private void bttnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnsignupActionPerformed

        this.setVisible(false);
        new frmsignup().setVisible(true);
    }//GEN-LAST:event_bttnsignupActionPerformed
    
    private void clear(){
        fusername.setText(null);
        fpassword.setText(null);
    }
    private void bttnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnloginActionPerformed
        String enteredUsername = fusername.getText();
        String enteredPassword = new String(fpassword.getPassword());

        String qry = "SELECT * FROM tbl_accounts WHERE username = ? AND password = ?";

        try (Connection con = DB.open(); PreparedStatement preparedStatement = con.prepareStatement(qry)) {

            preparedStatement.setString(1, enteredUsername);
            preparedStatement.setString(2, enteredPassword);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                if (rs.next()) {
                    Notification.show("Login Succesful");
                    GV.MAINUSERNAME = enteredUsername;
                    GV.MAINPASSWORD = enteredPassword;
                    this.setVisible(false);
                    new frmmain().setVisible(true);
                    
                } else {
                    Notification.show("Invalid username or password!");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    
    }//GEN-LAST:event_bttnloginActionPerformed

    private void fusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fusernameActionPerformed

    }//GEN-LAST:event_fusernameActionPerformed

    private void showPassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMouseReleased
        fpassword.setEchoChar('\u2022');
    }//GEN-LAST:event_showPassMouseReleased

    private void showPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMousePressed
        fpassword.setEchoChar((char)0);
    }//GEN-LAST:event_showPassMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnclear;
    private javax.swing.JButton bttnlogin;
    private javax.swing.JButton bttnsignup;
    private javax.swing.JPasswordField fpassword;
    private javax.swing.JTextField fusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel showPass;
    // End of variables declaration//GEN-END:variables

}
