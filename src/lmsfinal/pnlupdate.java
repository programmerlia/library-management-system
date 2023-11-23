package lmsfinal;
import javax.swing.*;
import java.io.FileInputStream;
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
import javax.swing.filechooser.FileNameExtensionFilter;


public class pnlupdate extends javax.swing.JPanel {

 
    public pnlupdate() {
        setVisible(true);
        initComponents();
        pfiction.setVisible(false);
        pnonfiction.setVisible(false);
        clear();
    }
    
    
    private static byte[] imageBytes;
    private JFrame frame;
    private String genre;
    private String genreList;

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
        buttonGroup = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        ftitle = new javax.swing.JTextField();
        fauthor = new javax.swing.JTextField();
        pfiction = new javax.swing.JPanel();
        cc10 = new javax.swing.JCheckBox();
        cc1 = new javax.swing.JCheckBox();
        cc2 = new javax.swing.JCheckBox();
        cc3 = new javax.swing.JCheckBox();
        cc4 = new javax.swing.JCheckBox();
        cc5 = new javax.swing.JCheckBox();
        cc6 = new javax.swing.JCheckBox();
        cc7 = new javax.swing.JCheckBox();
        cc8 = new javax.swing.JCheckBox();
        cc9 = new javax.swing.JCheckBox();
        fisbn = new javax.swing.JTextField();
        pnonfiction = new javax.swing.JPanel();
        c10 = new javax.swing.JCheckBox();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        c5 = new javax.swing.JCheckBox();
        c6 = new javax.swing.JCheckBox();
        c7 = new javax.swing.JCheckBox();
        c8 = new javax.swing.JCheckBox();
        c9 = new javax.swing.JCheckBox();
        bttnsave = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jnonfiction = new javax.swing.JRadioButton();
        jfiction = new javax.swing.JRadioButton();
        fdate = new com.toedter.calendar.JDateChooser();
        bttnclear = new javax.swing.JButton();
        bttnupload = new javax.swing.JButton();
        pcover2 = new javax.swing.JPanel();
        pcover = new javax.swing.JPanel();
        plabel = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(55, 2, 2));
        jPanel3.setForeground(java.awt.Color.black);
        jPanel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel3.setVerifyInputWhenFocusTarget(false);
        jPanel3.setLayout(null);

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

        jPanel3.add(jPanel6);
        jPanel6.setBounds(30, 70, 690, 2);

        ftitle.setBackground(java.awt.Color.white);
        ftitle.setForeground(java.awt.Color.black);
        jPanel3.add(ftitle);
        ftitle.setBounds(180, 110, 180, 22);

        fauthor.setBackground(java.awt.Color.white);
        fauthor.setForeground(java.awt.Color.black);
        jPanel3.add(fauthor);
        fauthor.setBounds(180, 150, 180, 22);

        pfiction.setBackground(new java.awt.Color(55, 2, 2));
        pfiction.setForeground(java.awt.Color.white);
        pfiction.setLayout(null);

        cc10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cc10.setForeground(java.awt.Color.white);
        cc10.setText("Supernatural");
        cc10.setContentAreaFilled(false);
        pfiction.add(cc10);
        cc10.setBounds(90, 130, 99, 20);

        cc1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cc1.setForeground(java.awt.Color.white);
        cc1.setText("Romance");
        cc1.setContentAreaFilled(false);
        pfiction.add(cc1);
        cc1.setBounds(0, 10, 80, 20);

        cc2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cc2.setForeground(java.awt.Color.white);
        cc2.setText("Fantasy");
        cc2.setContentAreaFilled(false);
        pfiction.add(cc2);
        cc2.setBounds(0, 40, 68, 20);

        cc3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cc3.setForeground(java.awt.Color.white);
        cc3.setText("Thriller");
        cc3.setContentAreaFilled(false);
        pfiction.add(cc3);
        cc3.setBounds(0, 70, 60, 20);

        cc4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cc4.setForeground(java.awt.Color.white);
        cc4.setText("Comedy");
        cc4.setContentAreaFilled(false);
        pfiction.add(cc4);
        cc4.setBounds(0, 100, 73, 20);

        cc5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cc5.setForeground(java.awt.Color.white);
        cc5.setText("Adventure");
        cc5.setContentAreaFilled(false);
        pfiction.add(cc5);
        cc5.setBounds(0, 130, 87, 20);

        cc6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cc6.setForeground(java.awt.Color.white);
        cc6.setText("Mystery");
        cc6.setContentAreaFilled(false);
        pfiction.add(cc6);
        cc6.setBounds(90, 10, 68, 20);

        cc7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cc7.setForeground(java.awt.Color.white);
        cc7.setText("Horror");
        cc7.setContentAreaFilled(false);
        pfiction.add(cc7);
        cc7.setBounds(90, 40, 59, 20);

        cc8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cc8.setForeground(java.awt.Color.white);
        cc8.setText("Drama");
        cc8.setContentAreaFilled(false);
        pfiction.add(cc8);
        cc8.setBounds(90, 70, 63, 20);

        cc9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cc9.setForeground(java.awt.Color.white);
        cc9.setText("Science");
        cc9.setContentAreaFilled(false);
        pfiction.add(cc9);
        cc9.setBounds(90, 100, 72, 20);

        jPanel3.add(pfiction);
        pfiction.setBounds(180, 270, 190, 160);

        fisbn.setBackground(java.awt.Color.white);
        fisbn.setForeground(java.awt.Color.black);
        jPanel3.add(fisbn);
        fisbn.setBounds(530, 110, 200, 22);

        pnonfiction.setBackground(new java.awt.Color(55, 2, 2));
        pnonfiction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        c10.setForeground(java.awt.Color.white);
        c10.setText("Health");
        c10.setContentAreaFilled(false);
        pnonfiction.add(c10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        c1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        c1.setForeground(java.awt.Color.white);
        c1.setText("Biography");
        c1.setContentAreaFilled(false);
        pnonfiction.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        c2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        c2.setForeground(java.awt.Color.white);
        c2.setText("Memoir");
        c2.setContentAreaFilled(false);
        pnonfiction.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        c3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        c3.setForeground(java.awt.Color.white);
        c3.setText("Politics & Law");
        c3.setContentAreaFilled(false);
        pnonfiction.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        c4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        c4.setForeground(java.awt.Color.white);
        c4.setText("Travel & Arts");
        c4.setContentAreaFilled(false);
        pnonfiction.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        c5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        c5.setForeground(java.awt.Color.white);
        c5.setText("Learning & History");
        c5.setContentAreaFilled(false);
        pnonfiction.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        c6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        c6.setForeground(java.awt.Color.white);
        c6.setText("Cooking");
        c6.setContentAreaFilled(false);
        pnonfiction.add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        c7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        c7.setForeground(java.awt.Color.white);
        c7.setText("Religion");
        c7.setContentAreaFilled(false);
        pnonfiction.add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        c8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        c8.setForeground(java.awt.Color.white);
        c8.setText("Life");
        c8.setContentAreaFilled(false);
        pnonfiction.add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        c9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        c9.setForeground(java.awt.Color.white);
        c9.setText("Business");
        c9.setContentAreaFilled(false);
        pnonfiction.add(c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jPanel3.add(pnonfiction);
        pnonfiction.setBounds(180, 270, 202, 160);

        bttnsave.setBackground(new java.awt.Color(165, 36, 34));
        bttnsave.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        bttnsave.setForeground(java.awt.Color.white);
        bttnsave.setText("SAVE");
        bttnsave.setBorder(null);
        bttnsave.setBorderPainted(false);
        bttnsave.setVerifyInputWhenFocusTarget(false);
        bttnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnsaveActionPerformed(evt);
            }
        });
        jPanel3.add(bttnsave);
        bttnsave.setBounds(510, 430, 220, 40);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("Book Cover");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(410, 160, 115, 19);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setText("Genre");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(40, 240, 43, 19);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setText("Author");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(40, 150, 115, 19);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(java.awt.Color.white);
        jLabel15.setText("Publish Date");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(40, 191, 85, 19);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("BOOK DETAILS");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(30, 30, 210, 23);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(java.awt.Color.white);
        jLabel17.setText("ISBN");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(410, 110, 115, 19);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("Title");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(40, 111, 115, 19);

        buttonGroup.add(jnonfiction);
        jnonfiction.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jnonfiction.setForeground(java.awt.Color.white);
        jnonfiction.setText("Non-Fiction");
        jnonfiction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnonfictionActionPerformed(evt);
            }
        });
        jPanel3.add(jnonfiction);
        jnonfiction.setBounds(260, 240, 120, 24);

        buttonGroup.add(jfiction);
        jfiction.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jfiction.setForeground(java.awt.Color.white);
        jfiction.setText("Fiction");
        jfiction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfictionActionPerformed(evt);
            }
        });
        jPanel3.add(jfiction);
        jfiction.setBounds(180, 240, 70, 24);

        fdate.setBackground(java.awt.Color.white);
        fdate.setForeground(java.awt.Color.black);
        fdate.setDateFormatString("y m d");
        fdate.setMinSelectableDate(new java.util.Date(-62135794704000L));
        fdate.setName("fdate"); // NOI18N
        jPanel3.add(fdate);
        fdate.setBounds(180, 190, 180, 22);

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
        jPanel3.add(bttnclear);
        bttnclear.setBounds(510, 380, 220, 40);

        bttnupload.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        bttnupload.setForeground(java.awt.Color.blue);
        bttnupload.setText("Upload File");
        bttnupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnuploadActionPerformed(evt);
            }
        });
        jPanel3.add(bttnupload);
        bttnupload.setBounds(410, 190, 90, 23);

        pcover2.setBackground(new java.awt.Color(204, 204, 204));
        pcover2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pcover.setBackground(new java.awt.Color(204, 204, 204));
        pcover.setPreferredSize(new java.awt.Dimension(130, 170));

        javax.swing.GroupLayout pcoverLayout = new javax.swing.GroupLayout(pcover);
        pcover.setLayout(pcoverLayout);
        pcoverLayout.setHorizontalGroup(
            pcoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pcoverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(plabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pcoverLayout.setVerticalGroup(
            pcoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pcoverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(plabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pcover2.add(pcover, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 130, 170));

        jPanel3.add(pcover2);
        pcover2.setBounds(530, 150, 200, 170);

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

    private void bttnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnsaveActionPerformed
       if(REUSABLES.checkNotNull(fisbn.getText(), fauthor.getText(), ftitle.getText(), fdate.getDate())){
           if(REUSABLES.checkNotNull(imageBytes)){
               insertBookandImage(fisbn.getText(), ftitle.getText(), fauthor.getText(), fdate.getDate(), imageBytes);
           }else{   
               insertBook(fisbn.getText(), ftitle.getText(), fauthor.getText(), fdate.getDate());
           }
        }else{
           REUSABLES.showNotif("Fill all Text/Date Fields");
    }
       
    }//GEN-LAST:event_bttnsaveActionPerformed
    
    private void clear(){
        ftitle.setText(null);
        fauthor.setText(null);
        fisbn.setText(null);
        fdate.setDate(null);
        plabel.setIcon(null);
        imageBytes = null;
        buttonGroup.clearSelection();
        genre = null;
        genreList = null;
        
    }
    
        private void insertBookandImage(String isbn, String title, String author, Date date, byte[] imageBytes) {
        String insertQuery = "INSERT INTO tbl_books (isbn, title, author, publishdate, cover, genre, genrelist) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DB.open();
             PreparedStatement preparedStatement = con.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, isbn);
            preparedStatement.setString(2, title);
            preparedStatement.setString(3, author);
            preparedStatement.setDate(4, new java.sql.Date(date.getDate()));
            preparedStatement.setBytes(5, imageBytes);
            preparedStatement.setString(6, genre);
            preparedStatement.setString(7, getGenreList());

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
        String insertQuery = "INSERT INTO tbl_books (isbn, title, author, publishdate, genre, genrelist, cover) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DB.open(); PreparedStatement preparedStatement = con.prepareStatement(insertQuery)) {

            preparedStatement.setString(1, isbn);
            preparedStatement.setString(2, title);
            preparedStatement.setString(3, author);
            preparedStatement.setDate(4, new java.sql.Date(date.getDate()));
            preparedStatement.setString(5, genre);
            preparedStatement.setString(6, getGenreList());

            ClassLoader classLoader = getClass().getClassLoader();
            File defaultImageFile = new File(classLoader.getResource("assets/no.png").getFile());

            try (FileInputStream defaultFis = new FileInputStream(defaultImageFile)) {
                imageBytes = new byte[(int) defaultImageFile.length()];
                defaultFis.read(imageBytes);
            } catch (IOException e) {
                e.printStackTrace();
            }

            preparedStatement.setBytes(7, imageBytes);
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
    

    private void jfictionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfictionActionPerformed
       jnonfiction.setSelected(false);
       pfiction.setVisible(true);
       pnonfiction.setVisible(false);
       genre="Fiction";
       clearCheckboxes();
       genreList = null;
       genreList = getGenreList();
       
    }//GEN-LAST:event_jfictionActionPerformed

    private void jnonfictionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnonfictionActionPerformed
        jfiction.setSelected(false);
        pfiction.setVisible(false);
        pnonfiction.setVisible(true);
        genre="Non-Fiction";
        clearCheckboxes();
        genreList = null;
        genreList = getGenreList();
    }//GEN-LAST:event_jnonfictionActionPerformed

    private void bttnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnclearActionPerformed
       clear();
       clearCheckboxes();
        pfiction.setVisible(false);
        pnonfiction.setVisible(false);
    }//GEN-LAST:event_bttnclearActionPerformed

    private void bttnuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnuploadActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png");
        fileChooser.setFileFilter(filter);
    
        int result = fileChooser.showOpenDialog(null);

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
    
    private void clearCheckboxes(){
        c1.setSelected(false);c2.setSelected(false);c3.setSelected(false);c4.setSelected(false);
        c5.setSelected(false);c6.setSelected(false);c7.setSelected(false);c8.setSelected(false);
        c9.setSelected(false);c10.setSelected(false);cc1.setSelected(false);cc2.setSelected(false);
        cc3.setSelected(false);cc4.setSelected(false);cc5.setSelected(false);cc6.setSelected(false);
        cc7.setSelected(false);cc8.setSelected(false);cc9.setSelected(false);cc10.setSelected(false);
    }
    private String getGenreList() {
        StringBuilder cgenreList = new StringBuilder();
        if (c1.isSelected()) {
            cgenreList.append("Biography, ");
        }
        if (c2.isSelected()) {
            cgenreList.append("Memoir, ");
        }
        if (c3.isSelected()) {
            cgenreList.append("Politics and Law, ");
        }
        if (c4.isSelected()) {
            cgenreList.append("Travel and Arts, ");
        }
        if (c5.isSelected()) {
            cgenreList.append("Learning and History, ");
        }
        if (c6.isSelected()) {
            cgenreList.append("Cooking, ");
        }
        if (c7.isSelected()) {
           cgenreList.append("Religion, ");
        }
        if (c8.isSelected()) {
            cgenreList.append("Life, ");
        }
        if (c9.isSelected()) {
            cgenreList.append("Business, ");
        }
        if (c10.isSelected()) {
            cgenreList.append("Health, ");
        }
        if (cc1.isSelected()) {
            cgenreList.append("Romance, ");
        }
        if (cc2.isSelected()) {
            cgenreList.append("Fantasy, ");
        }
        if (cc3.isSelected()) {
            cgenreList.append("Thriller, ");
        }
        if (cc4.isSelected()) {
            cgenreList.append("Comedy, ");
        }
        if (cc5.isSelected()) {
            cgenreList.append("Adventure, ");
        }
        if (cc6.isSelected()) {
            cgenreList.append("Mystery, ");
        }
        if (cc7.isSelected()) {
            cgenreList.append("Horror, ");
        }
        if (cc8.isSelected()) {
            cgenreList.append("Drama, ");
        }
        if (cc9.isSelected()) {
            cgenreList.append("Science, ");
        }
        if (cc10.isSelected()) {
            cgenreList.append("Supernatural, ");
        }
       
        int length = cgenreList.length();
    if (length >= 2) {
        cgenreList.setLength(length - 2);
        return cgenreList.toString();
    } else {
        return cgenreList.toString();
    }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnclear;
    private javax.swing.JButton bttnsave;
    private javax.swing.JButton bttnupload;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c10;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c5;
    private javax.swing.JCheckBox c6;
    private javax.swing.JCheckBox c7;
    private javax.swing.JCheckBox c8;
    private javax.swing.JCheckBox c9;
    private javax.swing.JCheckBox cc1;
    private javax.swing.JCheckBox cc10;
    private javax.swing.JCheckBox cc2;
    private javax.swing.JCheckBox cc3;
    private javax.swing.JCheckBox cc4;
    private javax.swing.JCheckBox cc5;
    private javax.swing.JCheckBox cc6;
    private javax.swing.JCheckBox cc7;
    private javax.swing.JCheckBox cc8;
    private javax.swing.JCheckBox cc9;
    private javax.swing.JTextField fauthor;
    private com.toedter.calendar.JDateChooser fdate;
    private javax.swing.JTextField fisbn;
    private javax.swing.JTextField ftitle;
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
    private javax.swing.JRadioButton jfiction;
    private javax.swing.JRadioButton jnonfiction;
    private javax.swing.JPanel pcover;
    private javax.swing.JPanel pcover2;
    private javax.swing.JPanel pfiction;
    private javax.swing.JLabel plabel;
    private javax.swing.JPanel pnonfiction;
    // End of variables declaration//GEN-END:variables
}
