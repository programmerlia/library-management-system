package lmsfinal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.File;
import java.io.IOException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.util.Date;
import javax.imageio.ImageIO;


public class pnlupdate extends javax.swing.JPanel {

 
    public pnlupdate() {
        setVisible(true);
        initComponents();
    }
    
    
    private static byte[] imageBytes;
    private BufferedImage image;
    private JFrame frame;
    

    public void displayImage() {
        try {
            if (imageBytes != null) {
                ByteArrayInputStream bis = new ByteArrayInputStream(imageBytes);
                BufferedImage image = ImageIO.read(bis);
                Image scaledImage = image.getScaledInstance(pcover.getWidth(), pcover.getHeight(), Image.SCALE_SMOOTH);
                plabel.setIcon(new ImageIcon(scaledImage));
            } else {
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        ftitle = new javax.swing.JTextField();
        fauthor = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        fisbn = new javax.swing.JTextField();
        pcover = new javax.swing.JPanel();
        plabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bttnupload = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        fdate = new com.toedter.calendar.JDateChooser();

        jPanel3.setBackground(new java.awt.Color(55, 2, 2));
        jPanel3.setForeground(java.awt.Color.black);
        jPanel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.setVerifyInputWhenFocusTarget(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        ftitle.setBackground(java.awt.Color.white);
        ftitle.setForeground(java.awt.Color.black);
        jPanel3.add(ftitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 180, -1));

        fauthor.setBackground(java.awt.Color.white);
        fauthor.setForeground(java.awt.Color.black);
        jPanel3.add(fauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 180, -1));

        jPanel7.setBackground(new java.awt.Color(55, 2, 2));
        jPanel7.setForeground(java.awt.Color.white);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox1.setForeground(java.awt.Color.white);
        jCheckBox1.setText("Supernatural");
        jCheckBox1.setContentAreaFilled(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel7.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox2.setForeground(java.awt.Color.white);
        jCheckBox2.setText("Romance");
        jCheckBox2.setContentAreaFilled(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel7.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox3.setForeground(java.awt.Color.white);
        jCheckBox3.setText("Fantasy");
        jCheckBox3.setContentAreaFilled(false);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel7.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jCheckBox4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox4.setForeground(java.awt.Color.white);
        jCheckBox4.setText("Thriller");
        jCheckBox4.setContentAreaFilled(false);
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel7.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jCheckBox5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox5.setForeground(java.awt.Color.white);
        jCheckBox5.setText("Comedy");
        jCheckBox5.setContentAreaFilled(false);
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        jPanel7.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jCheckBox6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox6.setForeground(java.awt.Color.white);
        jCheckBox6.setText("Fiction");
        jCheckBox6.setContentAreaFilled(false);
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jPanel7.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        jCheckBox7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox7.setForeground(java.awt.Color.white);
        jCheckBox7.setText("Non-Fiction");
        jCheckBox7.setContentAreaFilled(false);
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        jPanel7.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jCheckBox8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox8.setForeground(java.awt.Color.white);
        jCheckBox8.setText("Horror");
        jCheckBox8.setContentAreaFilled(false);
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        jPanel7.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jCheckBox9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox9.setForeground(java.awt.Color.white);
        jCheckBox9.setText("Drama");
        jCheckBox9.setContentAreaFilled(false);
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });
        jPanel7.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jCheckBox10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox10.setForeground(java.awt.Color.white);
        jCheckBox10.setText("Sci-Fi");
        jCheckBox10.setContentAreaFilled(false);
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });
        jPanel7.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 190, 160));

        fisbn.setBackground(java.awt.Color.white);
        fisbn.setForeground(java.awt.Color.black);
        jPanel3.add(fisbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 200, -1));

        pcover.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pcoverLayout = new javax.swing.GroupLayout(pcover);
        pcover.setLayout(pcoverLayout);
        pcoverLayout.setHorizontalGroup(
            pcoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        pcoverLayout.setVerticalGroup(
            pcoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plabel, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );

        jPanel3.add(pcover, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 200, 190));

        jButton6.setBackground(new java.awt.Color(165, 36, 34));
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton6.setForeground(java.awt.Color.white);
        jButton6.setText("SAVE");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setVerifyInputWhenFocusTarget(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 220, 50));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Book Cover");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 115, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Genre");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Author");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 115, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("Publish Date");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 191, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("BOOK DETAILS");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setText("ISBN");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 115, -1));

        bttnupload.setBackground(new java.awt.Color(55, 2, 2));
        bttnupload.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        bttnupload.setForeground(java.awt.Color.blue);
        bttnupload.setText("Upload File");
        bttnupload.setBorder(null);
        bttnupload.setBorderPainted(false);
        bttnupload.setMargin(new java.awt.Insets(10, 15, 15, 10));
        bttnupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnuploadActionPerformed(evt);
            }
        });
        jPanel3.add(bttnupload, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 200, 30));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("Title");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 111, 115, -1));

        fdate.setBackground(java.awt.Color.white);
        fdate.setForeground(java.awt.Color.black);
        fdate.setName("fdate"); // NOI18N
        jPanel3.add(fdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       if(REUSABLES.checkNotNull(fisbn.getText(), fauthor.getText(), ftitle.getText(), fdate.getDate())){
           if(REUSABLES.checkNotNull(imageBytes)){
               insertBookandImage(fisbn.getText(), ftitle.getText(), fauthor.getText(), fdate.getDate(), imageBytes);
           }else{   
               insertBook(fisbn.getText(), ftitle.getText(), fauthor.getText(), fdate.getDate());
           }
        }else{
           REUSABLES.showNotif("Fill all Text/Date Fields");
    }
       
    }//GEN-LAST:event_jButton6ActionPerformed
    
    private void clear(){
        ftitle.setText(null);
        fauthor.setText(null);
        fisbn.setText(null);
        fdate.setDate(null);
        plabel.setIcon(null);
        imageBytes = null;
        image = null;
        
    }
    
        private void insertBookandImage(String isbn, String title, String author, Date date, byte[] imageBytes) {
        String insertQuery = "INSERT INTO tbl_books (isbn, title, author, date, cover) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DB.open();
             PreparedStatement preparedStatement = con.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, isbn);
            preparedStatement.setString(2, title);
            preparedStatement.setString(3, author);
            preparedStatement.setDate(4, new java.sql.Date(date.getDate()));
            preparedStatement.setBytes(5, imageBytes);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                REUSABLES.showNotif("Book inserted successfully!");
                clear();
                
            } else {
                  REUSABLES.showNotif("Failed to insert book.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void insertBook(String isbn, String title, String author, Date date) {
        String insertQuery = "INSERT INTO tbl_books (isbn, title, author, date) VALUES (?, ?, ?, ?)";

        try (Connection con = DB.open();
             PreparedStatement preparedStatement = con.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, isbn);
            preparedStatement.setString(2, title);
            preparedStatement.setString(3, author);
            preparedStatement.setDate(4, new java.sql.Date(date.getDate()));

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                REUSABLES.showNotif("Book inserted successfully!");
                clear();
            } else {
                  REUSABLES.showNotif("Failed to insert book.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void uploadCoverToSql(){
          String insertQuery = "INSERT INTO tbl_books (cover) VALUES (?)    ";
                try (Connection con = DB.open(); PreparedStatement preparedStatement = con.prepareStatement(insertQuery)) {

                    preparedStatement.setBytes(1, imageBytes);

                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                         REUSABLES.showNotif("Image inserted into database.");
                    } else {
                          REUSABLES.showNotif("Failed to insert image into the database.");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
       
    }
    private void bttnuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnuploadActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(frame);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try (FileInputStream fis = new FileInputStream(selectedFile)) {
                imageBytes = new byte[(int) selectedFile.length()];
                fis.read(imageBytes);
                fis.close();
                REUSABLES.showNotif("File Uploaded");
                displayImage();

        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception according to your needs
        }
        }
    }//GEN-LAST:event_bttnuploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnupload;
    private javax.swing.JTextField fauthor;
    private com.toedter.calendar.JDateChooser fdate;
    private javax.swing.JTextField fisbn;
    private javax.swing.JTextField ftitle;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel pcover;
    private javax.swing.JLabel plabel;
    // End of variables declaration//GEN-END:variables
}
