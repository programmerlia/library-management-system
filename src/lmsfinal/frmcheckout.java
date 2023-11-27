package lmsfinal;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
public class frmcheckout extends javax.swing.JFrame{


    public frmcheckout() {
        
        setVisible(false);
        initComponents();
        
        setResizable(false);
        this.setLocationRelativeTo(null);
        
        listBook.setModel(REUSABLES.modelBook);
        listBook.setSelectedIndex(0);
        
        lblRecBorName.setVisible(false);
        lblDayHand.setVisible(false);
        lblDayOver.setVisible(false);
        lblServFee.setVisible(false);
        lblBookFee.setVisible(false);
        lblOverFee.setVisible(false);
        lblTotalFee.setVisible(false);
        bttnsave.setVisible(false);
    
        
        tblRec.getTableHeader().setReorderingAllowed(false);
        tblRec.setModel(tableModell);
        
        for (int i=0; i<REUSABLES.arrBook.size();i++)  {
            tableModell.addRow(new Object[]{REUSABLES.arrBook.get(i), REUSABLES.arrIsbn.get(i), "1"});
        }
    }

    
    private void clear() {
        REUSABLES.modelBook.clear();
        REUSABLES.modelIsbn.clear();
        REUSABLES.arrBook.clear();
        REUSABLES.arrIsbn.clear();
        listBook.setModel(REUSABLES.modelBook);
        cmbQuant.setSelectedItem("1");
        txtBorName.setText("");
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        jDateChooser3.setDate(null);
        DefaultTableModel tableModel = new DefaultTableModel();
        tblRec.setModel(tableModel);
        lblRecBorName.setText(null);
        lblDayHand.setText(null);
        lblDayOver.setText(null);
        lblBookFee.setText("");
        lblOverFee.setText("");
        lblServFee.setText("");
        lblTotalFee.setText("");
        this.setVisible(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cmbQuant = new javax.swing.JComboBox<>();
        txtBorName = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        pnlprint = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRec = new javax.swing.JTable();
        lblTotalFee = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblRecBorName = new javax.swing.JLabel();
        lblDayHand = new javax.swing.JLabel();
        lblDayOver = new javax.swing.JLabel();
        lblServFee = new javax.swing.JLabel();
        lblBookFee = new javax.swing.JLabel();
        lblOverFee = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bttngenerate = new javax.swing.JButton();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listBook = new javax.swing.JList<>();
        jLabel31 = new javax.swing.JLabel();
        bttnclear = new javax.swing.JButton();
        bttnsave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(64, 9, 9));
        jPanel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHECKOUT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 116, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 153));
        jPanel6.setPreferredSize(new java.awt.Dimension(631, 2));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("Quantity:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel21.setForeground(java.awt.Color.white);
        jLabel21.setText("Date Received:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 140, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel22.setForeground(java.awt.Color.white);
        jLabel22.setText("Borrower's Name:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, -1));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel23.setForeground(java.awt.Color.white);
        jLabel23.setText("Date Borrowed:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 140, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel24.setForeground(java.awt.Color.white);
        jLabel24.setText("Date Due:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 140, -1));

        cmbQuant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        cmbQuant.setToolTipText("Select the book's title then set the book's quantity");
        cmbQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbQuantActionPerformed(evt);
            }
        });
        jPanel1.add(cmbQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        txtBorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBorNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtBorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 120, -1));

        jDateChooser1.setFocusable(false);
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 150, -1));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 150, -1));

        pnlprint.setBackground(new java.awt.Color(64, 9, 9));
        pnlprint.setLayout(null);

        tblRec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblRec.setEnabled(false);
        tblRec.setShowGrid(false);
        jScrollPane1.setViewportView(tblRec);

        pnlprint.add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 270, 120);

        lblTotalFee.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblTotalFee.setForeground(new java.awt.Color(51, 51, 51));
        lblTotalFee.setText("TOTAL");
        pnlprint.add(lblTotalFee);
        lblTotalFee.setBounds(200, 300, 110, 19);

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("RECEIPT");
        jLabel26.setToolTipText("");
        pnlprint.add(jLabel26);
        jLabel26.setBounds(100, 10, 110, 23);

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("Days in Hand:");
        pnlprint.add(jLabel30);
        jLabel30.setBounds(20, 190, 130, 19);

        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("Borrower's Name:");
        pnlprint.add(jLabel35);
        jLabel35.setBounds(20, 170, 130, 19);

        jLabel36.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setText("Overdue Fee");
        pnlprint.add(jLabel36);
        jLabel36.setBounds(40, 265, 130, 15);

        jLabel37.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setText("Days Overdue:");
        pnlprint.add(jLabel37);
        jLabel37.setBounds(20, 210, 130, 19);

        jLabel38.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("Fees:");
        pnlprint.add(jLabel38);
        jLabel38.setBounds(20, 230, 130, 19);

        jLabel39.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 51));
        jLabel39.setText("Service Fee");
        pnlprint.add(jLabel39);
        jLabel39.setBounds(40, 280, 130, 15);

        jLabel40.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("Books Fee");
        pnlprint.add(jLabel40);
        jLabel40.setBounds(40, 250, 130, 15);

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        pnlprint.add(jSeparator1);
        jSeparator1.setBounds(190, 300, 100, 10);

        lblRecBorName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRecBorName.setForeground(new java.awt.Color(51, 51, 51));
        lblRecBorName.setText("name");
        pnlprint.add(lblRecBorName);
        lblRecBorName.setBounds(150, 170, 110, 19);

        lblDayHand.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDayHand.setForeground(new java.awt.Color(51, 51, 51));
        lblDayHand.setText("date");
        pnlprint.add(lblDayHand);
        lblDayHand.setBounds(150, 190, 170, 19);

        lblDayOver.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDayOver.setForeground(new java.awt.Color(51, 51, 51));
        lblDayOver.setText("date");
        pnlprint.add(lblDayOver);
        lblDayOver.setBounds(150, 210, 160, 19);

        lblServFee.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblServFee.setForeground(new java.awt.Color(51, 51, 51));
        lblServFee.setText("P0");
        pnlprint.add(lblServFee);
        lblServFee.setBounds(200, 280, 110, 15);

        lblBookFee.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblBookFee.setForeground(new java.awt.Color(51, 51, 51));
        lblBookFee.setText("P0");
        pnlprint.add(lblBookFee);
        lblBookFee.setBounds(200, 250, 110, 15);

        lblOverFee.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblOverFee.setForeground(new java.awt.Color(51, 51, 51));
        lblOverFee.setText("P0");
        pnlprint.add(lblOverFee);
        lblOverFee.setBounds(200, 265, 110, 15);

        jLabel3.setBackground(new java.awt.Color(64, 9, 9));
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/receipt1.png"))); // NOI18N
        pnlprint.add(jLabel3);
        jLabel3.setBounds(0, 0, 310, 330);

        jPanel1.add(pnlprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 310, 330));

        bttngenerate.setBackground(new java.awt.Color(255, 201, 121));
        bttngenerate.setText("Generate Receipt");
        bttngenerate.setToolTipText("");
        bttngenerate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttngenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttngenerateActionPerformed(evt);
            }
        });
        jPanel1.add(bttngenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
        jPanel1.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 150, -1));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel29.setForeground(java.awt.Color.white);
        jLabel29.setText("Book:");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 50, -1));

        listBook.setToolTipText("Select a book title then set its quantity afterwards");
        listBook.setOpaque(false);
        listBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listBookMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listBookMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(listBook);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, 80));

        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel31.setForeground(java.awt.Color.white);
        jLabel31.setText("Book:");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 50, -1));

        bttnclear.setBackground(new java.awt.Color(255, 201, 121));
        bttnclear.setText("Cancel");
        bttnclear.setToolTipText("");
        bttnclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnclearActionPerformed(evt);
            }
        });
        jPanel1.add(bttnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        bttnsave.setBackground(new java.awt.Color(255, 201, 121));
        bttnsave.setText("Download");
        bttnsave.setToolTipText("");
        bttnsave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(bttnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBorNameActionPerformed

    
    private DefaultTableModel  tableModell = new DefaultTableModel(new String[]{"Book Title", "ISBN", "Quantity"}, 0);
    
    private void bttngenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttngenerateActionPerformed
        try {
            if (REUSABLES.checkNotNull(jDateChooser1.getDate(), jDateChooser2.getDate(), jDateChooser3.getDate(), cmbQuant.getSelectedItem(), txtBorName.getText())) {
                java.util.Date date1 = jDateChooser1.getDate();
                java.util.Date date2 = jDateChooser2.getDate();
                java.util.Date date3 = jDateChooser3.getDate();

                lblRecBorName.setVisible(true);
                lblDayHand.setVisible(true);
                lblDayOver.setVisible(true);
                lblServFee.setVisible(true);
                lblBookFee.setVisible(true);
                lblOverFee.setVisible(true);
                lblTotalFee.setVisible(true);

                lblRecBorName.setText(txtBorName.getText());
                lblDayHand.setText(Long.toString(TimeUnit.DAYS.convert(date3.getTime() - date1.getTime(), TimeUnit.MILLISECONDS)));
                lblDayOver.setText(Long.toString(TimeUnit.DAYS.convert(date3.getTime() - date2.getTime(), TimeUnit.MILLISECONDS)));

                if (Integer.parseInt(lblDayOver.getText()) < 0) {
                    lblDayOver.setText("0");
                }

                ArrayList<Integer> arrQuant = new ArrayList<>(REUSABLES.arrBook.size());

                double bookFee = 0;
                for (int i = 0; i < REUSABLES.arrBook.size(); i++) {
                    bookFee += 40 * Integer.valueOf((String) tblRec.getValueAt(i, 2));
                }

                double servFee = 5;
                double overFee = bookFee * Integer.parseInt(lblDayOver.getText()) * 0.5;
                double totalFee = servFee + bookFee + overFee;

                lblServFee.setText("P" + Double.toString(servFee));
                lblBookFee.setText("P" + Double.toString(bookFee));
                lblOverFee.setText("P" + Double.toString(overFee));
                lblTotalFee.setText("P" + Double.toString(totalFee));

                bttnsave.setVisible(true);
            } else {
                Notification.show("Please Fill all Fields!");
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_bttngenerateActionPerformed

    private void cmbQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbQuantActionPerformed
        tblRec.setValueAt(cmbQuant.getSelectedItem(), listBook.getSelectedIndex(), 2);
    }//GEN-LAST:event_cmbQuantActionPerformed

    private void listBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listBookMouseClicked

    private void listBookMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBookMouseReleased
        
    }//GEN-LAST:event_listBookMouseReleased

    private void bttnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnclearActionPerformed
      this.setVisible(false);
      clear();
      
    }//GEN-LAST:event_bttnclearActionPerformed

    private void bttnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnsaveActionPerformed
        try {
            generateAndDownloadImage(pnlprint);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }//GEN-LAST:event_bttnsaveActionPerformed

    private static void generateAndDownloadImage(JPanel panel) throws IOException {
        BufferedImage image = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.getGraphics();
        panel.paint(g);
        g.dispose();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Image");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG Images", "png");
        fileChooser.setFileFilter(filter);

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            if (!fileToSave.getAbsolutePath().toLowerCase().endsWith(".png")) {
                fileToSave = new File(fileToSave.getAbsolutePath() + ".png");
            }

            ImageIO.write(image, "png", fileToSave);
            JOptionPane.showMessageDialog(null, "Image saved successfully!");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel(new FlatLightLaf());
        }catch(UnsupportedLookAndFeelException ex){
            System.err.println("Failed to initialize LaF");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmcheckout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnclear;
    private javax.swing.JButton bttngenerate;
    private javax.swing.JButton bttnsave;
    private javax.swing.JComboBox<String> cmbQuant;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBookFee;
    private javax.swing.JLabel lblDayHand;
    private javax.swing.JLabel lblDayOver;
    private javax.swing.JLabel lblOverFee;
    private javax.swing.JLabel lblRecBorName;
    private javax.swing.JLabel lblServFee;
    private javax.swing.JLabel lblTotalFee;
    private javax.swing.JList<String> listBook;
    private javax.swing.JPanel pnlprint;
    private javax.swing.JTable tblRec;
    private javax.swing.JTextField txtBorName;
    // End of variables declaration//GEN-END:variables
}
