package lmsfinal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EmptyBorder;
        
public class frmmain extends javax.swing.JFrame {

    private static Color normalColor = new Color(237, 231, 217);
    private static Color hoverColor = new Color(209, 190, 158); 
    private static Color clickedColor = new Color(209, 190, 158);

    public frmmain() {
        
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
        bttnrecords.setBackground(clickedColor);
        pnlhome1.setVisible(true);
        pnlaccount1.setVisible(false);
        pnlrecords1.setVisible(false);
        pnlupdate1.setVisible(false);
        
        /*hover(bttnhome);
        hover(bttnrecords);
        hover(bttnaccount);
        hover(bttnrecords);*/
        
        
        
        
    }
    
    /*
    private static JLabel hover(JLabel panel) {
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(normalColor);
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                panel.setBackground(clickedColor);
            }
        });
        return panel;
    }
*/
        
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bttnrecords = new javax.swing.JLabel();
        bttnaccount = new javax.swing.JLabel();
        bttnupdate = new javax.swing.JLabel();
        bttnhome = new javax.swing.JLabel();
        pnlmain = new javax.swing.JPanel();
        pnlaccount1 = new lmsfinal.pnlaccount();
        pnlrecords1 = new lmsfinal.pnlrecords();
        pnlhome1 = new lmsfinal.pnlhome();
        pnlupdate1 = new lmsfinal.pnlupdate();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(10000, 630));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/header.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(237, 231, 217));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("System");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Library Cataloging");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        bttnrecords.setBackground(new java.awt.Color(209, 190, 158));
        bttnrecords.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttnrecords.setForeground(java.awt.Color.black);
        bttnrecords.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/i-records.png"))); // NOI18N
        bttnrecords.setText("RECORDS");
        bttnrecords.setToolTipText("");
        bttnrecords.setBorder(new EmptyBorder (0, 20, 0, 0));
        bttnrecords.setIconTextGap(20);
        bttnrecords.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnrecordsMouseClicked(evt);
            }
        });

        bttnaccount.setBackground(new java.awt.Color(209, 190, 158));
        bttnaccount.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttnaccount.setForeground(java.awt.Color.black);
        bttnaccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/i-user.png"))); // NOI18N
        bttnaccount.setText("ACCOUNT");
        bttnaccount.setToolTipText("");
        bttnaccount.setBorder(new EmptyBorder (0, 20, 0, 0));
        bttnaccount.setIconTextGap(20);
        bttnaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnaccountMouseClicked(evt);
            }
        });

        bttnupdate.setBackground(new java.awt.Color(209, 190, 158));
        bttnupdate.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttnupdate.setForeground(java.awt.Color.black);
        bttnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/i-square-plus.png"))); // NOI18N
        bttnupdate.setText("UPDATE");
        bttnupdate.setToolTipText("");
        bttnupdate.setBorder(new EmptyBorder (0, 20, 0, 0));
        bttnupdate.setIconTextGap(20);
        bttnupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnupdateMouseClicked(evt);
            }
        });

        bttnhome.setBackground(new java.awt.Color(209, 190, 158));
        bttnhome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttnhome.setForeground(java.awt.Color.black);
        bttnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/i-home.png"))); // NOI18N
        bttnhome.setText("HOME");
        bttnhome.setToolTipText("");
        bttnhome.setBorder(new EmptyBorder (0, 20, 0, 0));
        bttnhome.setIconTextGap(20);
        bttnhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttnhomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1)))))
                .addGap(0, 30, Short.MAX_VALUE))
            .addComponent(bttnrecords, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bttnaccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bttnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bttnhome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(bttnhome, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bttnrecords, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttnaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 530));

        pnlmain.setPreferredSize(new java.awt.Dimension(790, 520));
        pnlmain.setLayout(null);

        javax.swing.GroupLayout pnlaccount1Layout = new javax.swing.GroupLayout(pnlaccount1);
        pnlaccount1.setLayout(pnlaccount1Layout);
        pnlaccount1Layout.setHorizontalGroup(
            pnlaccount1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        pnlaccount1Layout.setVerticalGroup(
            pnlaccount1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        pnlmain.add(pnlaccount1);
        pnlaccount1.setBounds(0, 0, 806, 537);

        javax.swing.GroupLayout pnlrecords1Layout = new javax.swing.GroupLayout(pnlrecords1);
        pnlrecords1.setLayout(pnlrecords1Layout);
        pnlrecords1Layout.setHorizontalGroup(
            pnlrecords1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        pnlrecords1Layout.setVerticalGroup(
            pnlrecords1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        pnlmain.add(pnlrecords1);
        pnlrecords1.setBounds(0, 0, 790, 520);
        pnlmain.add(pnlhome1);
        pnlhome1.setBounds(0, 0, 790, 520);
        pnlmain.add(pnlupdate1);
        pnlupdate1.setBounds(0, 0, 790, 520);

        getContentPane().add(pnlmain, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 790, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnrecordsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnrecordsMouseClicked
        pnlhome1.setVisible(false);
        pnlaccount1.setVisible(false);
        pnlrecords1.setVisible(true);
        pnlupdate1.setVisible(false);
        bttnhome.setBackground(normalColor);
        bttnrecords.setBackground(clickedColor);
        bttnupdate.setBackground(normalColor);
        bttnaccount.setBackground(normalColor);
    }//GEN-LAST:event_bttnrecordsMouseClicked

    private void bttnhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnhomeMouseClicked
        pnlhome1.setVisible(true);
        pnlaccount1.setVisible(false);
        pnlrecords1.setVisible(false);
        pnlupdate1.setVisible(false);
        bttnhome.setBackground(clickedColor);
        bttnupdate.setBackground(normalColor);
        bttnrecords.setBackground(normalColor);
        bttnaccount.setBackground(normalColor);
    }//GEN-LAST:event_bttnhomeMouseClicked

    private void bttnaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnaccountMouseClicked
        pnlhome1.setVisible(false);
        pnlaccount1.setVisible(true);
        pnlrecords1.setVisible(false);
        pnlupdate1.setVisible(false);
        bttnrecords.setBackground(normalColor);
        bttnupdate.setBackground(normalColor);
        bttnrecords.setBackground(normalColor);
        bttnaccount.setBackground(clickedColor);
    }//GEN-LAST:event_bttnaccountMouseClicked

    private void bttnupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttnupdateMouseClicked
        pnlhome1.setVisible(false);
        pnlaccount1.setVisible(false);
        pnlrecords1.setVisible(false);
        pnlupdate1.setVisible(true);
        bttnrecords.setBackground(normalColor);
        bttnupdate.setBackground(clickedColor);
        bttnrecords.setBackground(normalColor);
        bttnaccount.setBackground(normalColor);
    }//GEN-LAST:event_bttnupdateMouseClicked
 
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmmain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bttnaccount;
    private javax.swing.JLabel bttnhome;
    private javax.swing.JLabel bttnrecords;
    private javax.swing.JLabel bttnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private lmsfinal.pnlaccount pnlaccount1;
    private lmsfinal.pnlhome pnlhome1;
    public javax.swing.JPanel pnlmain;
    private lmsfinal.pnlrecords pnlrecords1;
    private lmsfinal.pnlupdate pnlupdate1;
    // End of variables declaration//GEN-END:variables
}
