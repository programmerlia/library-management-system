/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package lmsfinal;

import com.mysql.cj.jdbc.Blob;
import java.awt.Component;
import java.awt.Image;
import java.awt.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author testing101
 */
public class pnlrecords extends javax.swing.JPanel {

    public pnlrecords() {
        initComponents();
        jTable2.setModel(tableModel);
        jComboBox1.setSelectedIndex(0);
        jTextField1.setText(null);
        bttncheckout.setEnabled(false);
        setVisible(true);
        
        fetchDataAndDisplay();
    }
    private DefaultTableModel  tableModel = new DefaultTableModel(new String[]{"Cover", "ISBN", "Title", "Author", "Genre", "Genre List", "Publish Date"}, 0);;
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        flatMenuBarUI1 = new com.formdev.flatlaf.ui.FlatMenuBarUI();
        bttncheckout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        bttnsearh = new javax.swing.JButton();
        bttnrefresh = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        bttnclear = new javax.swing.JButton();

        setBackground(new java.awt.Color(55, 2, 2));
        setForeground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(790, 520));
        setPreferredSize(new java.awt.Dimension(790, 520));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttncheckout.setBackground(new java.awt.Color(165, 36, 34));
        bttncheckout.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        bttncheckout.setForeground(java.awt.Color.white);
        bttncheckout.setText("CHECKOUT");
        bttncheckout.setBorder(new com.formdev.flatlaf.ui.FlatEmptyBorder());
        bttncheckout.setVerifyInputWhenFocusTarget(false);
        bttncheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttncheckoutActionPerformed(evt);
            }
        });
        add(bttncheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 151, 40));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setRowMargin(4);
        jTable2.setSelectionBackground(new java.awt.Color(248, 135, 62));
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTable2.setShowHorizontalLines(true);
        jTable2.setVerifyInputWhenFocusTarget(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable2MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 750, -1));
        jScrollPane2.getAccessibleContext().setAccessibleDescription("");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 310, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel18.setForeground(java.awt.Color.white);
        jLabel18.setText("Genre");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 120, -1));

        bttnsearh.setBackground(new java.awt.Color(165, 36, 34));
        bttnsearh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/zoom.png"))); // NOI18N
        bttnsearh.setToolTipText("Search with Filter");
        bttnsearh.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        bttnsearh.setBorderPainted(false);
        bttnsearh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bttnsearh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnsearhActionPerformed(evt);
            }
        });
        add(bttnsearh, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 30, 30));

        bttnrefresh.setBackground(new java.awt.Color(165, 36, 34));
        bttnrefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/refresh-page-option (1).png"))); // NOI18N
        bttnrefresh.setToolTipText("Refresh Table");
        bttnrefresh.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        bttnrefresh.setBorderPainted(false);
        bttnrefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bttnrefresh.setMargin(new java.awt.Insets(3, 14, 3, 14));
        bttnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnrefreshActionPerformed(evt);
            }
        });
        add(bttnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 30, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Fiction", "Non-Fiction" }));
        jComboBox1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jComboBox1ComponentRemoved(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 130, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel19.setForeground(java.awt.Color.white);
        jLabel19.setText("Search Title");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, -1));

        bttnclear.setBackground(new java.awt.Color(165, 36, 34));
        bttnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/clear.png"))); // NOI18N
        bttnclear.setToolTipText("Clear Filters");
        bttnclear.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        bttnclear.setBorderPainted(false);
        bttnclear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bttnclear.setMargin(new java.awt.Insets(3, 14, 3, 14));
        bttnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnclearActionPerformed(evt);
            }
        });
        add(bttnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void bttncheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttncheckoutActionPerformed
        
        
        for (int i : jTable2.getSelectedRows()){
            REUSABLES.modelBook.addElement(jTable2.getValueAt(i, 2));
            REUSABLES.modelIsbn.addElement(jTable2.getValueAt(i, 1));
            REUSABLES.arrBook.add(jTable2.getValueAt(i, 2).toString());
            REUSABLES.arrIsbn.add(jTable2.getValueAt(i, 1).toString());
        }
        this.setVisible(false);
        new frmcheckout().setVisible(true);
    }//GEN-LAST:event_bttncheckoutActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
    }//GEN-LAST:event_formMouseEntered

    private void bttnsearhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnsearhActionPerformed
        String words = jTextField1.getText();
        clearTable();
        String selectedOption = (String) jComboBox1.getSelectedItem();

        if (selectedOption.equals(" ")) {
            fetchDataAndDisplay(words);
        } else if (selectedOption.equals("Fiction") || selectedOption.equals("Non-Fiction")) {
            String selectedText = (String) jComboBox1.getSelectedItem();
            fetchDataAndDisplay(words, selectedText);
        }

    }//GEN-LAST:event_bttnsearhActionPerformed

    private void bttnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnrefreshActionPerformed
        jTextField1.setText(null);
        clearTable();
        fetchDataAndDisplay();
    }//GEN-LAST:event_bttnrefreshActionPerformed

    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased

        
        if (!jTable2.getSelectionModel().isSelectionEmpty()){
            bttncheckout.setEnabled(true);
        }
        
        
        
        

    }//GEN-LAST:event_jTable2MouseReleased

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jComboBox1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jComboBox1ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ComponentRemoved

    private void bttnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnclearActionPerformed
       jTextField1.setText(null);
       jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_bttnclearActionPerformed

   
    private void clearTable() {
    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0);
} 
    
    
     public class ToggleListSelectionModel extends DefaultListSelectionModel{
        @Override
        public void setSelectionInterval(int index0, int index1){
            if (index0 != index1){
                super.addSelectionInterval(index0, index1);
                return;
            }

            if  (super.isSelectedIndex(index0)){
                super.removeSelectionInterval(index0, index0);
            } else{
                super.addSelectionInterval(index0, index0);
            }
        }
    }
    
    private void setTableModification(){
        jTable2.getColumnModel().getColumn(0).setCellRenderer(new ImageRenderer());
        jTable2.setRowHeight(120);
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(70);
        jTable2.setDefaultEditor(Object.class, null);
        jTable2.setCellSelectionEnabled(false);
        jTable2.setColumnSelectionAllowed(false);
        jTable2.setRowSelectionAllowed(true);
        //jTable2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jTable2.setSelectionModel(new ToggleListSelectionModel());
        for (int i = 1; i < jTable2.getColumnCount(); i++) {
            jTable2.getColumnModel().getColumn(i).setCellRenderer(new WrapTextRenderer());
        }
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 1; i < jTable2.getColumnCount(); i++) {
            jTable2.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
     private void fetchDataAndDisplay() {
        String sql = "SELECT isbn, title, author, genre, genrelist, publishdate, cover FROM tbl_books";
        ResultSet resultSet = null;
        

        try {PreparedStatement preparedStatement = DB.open().prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String isbn = resultSet.getString("isbn");
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String genre = resultSet.getString("genre");
                String genreList = resultSet.getString("genrelist");
                String publishDate = resultSet.getString("publishdate");
                java.sql.Blob blob = resultSet.getBlob("cover");
                byte[] imageData = blob.getBytes(1, (int) blob.length());
                ImageIcon imageIcon = new ImageIcon(imageData);
                tableModel.addRow(new Object[]{imageIcon, isbn, title, author, genre, genreList, publishDate});
            }
              jTable2.setModel(tableModel);
              setTableModification();
              
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    private void fetchDataAndDisplay(String words) {
        String sql = "SELECT isbn, title, author, genre, genrelist, publishdate, cover FROM tbl_books WHERE title LIKE ?";
        ResultSet resultSet = null;
        try {
            PreparedStatement preparedStatement = DB.open().prepareStatement(sql);
            preparedStatement.setString(1, "%" + words + "%");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String isbn = resultSet.getString("isbn");
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                String genre = resultSet.getString("genre");
                String genreList = resultSet.getString("genrelist");
                String publishDate = resultSet.getString("publishdate");

                java.sql.Blob blob = resultSet.getBlob("cover");
                byte[] imageData = blob.getBytes(1, (int) blob.length());
                ImageIcon imageIcon = new ImageIcon(imageData);
                
                tableModel.addRow(new Object[]{imageIcon, isbn, title, author, genre, genreList, publishDate});
            }
              jTable2.setModel(tableModel);
              setTableModification();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
 private void fetchDataAndDisplay(String words, String genreop) {
    String sql = "SELECT isbn, title, author, genre, genrelist, publishdate, cover FROM tbl_books WHERE title LIKE ? AND genre = ?";
    ResultSet resultSet = null;
    try {
        PreparedStatement preparedStatement = DB.open().prepareStatement(sql);
        preparedStatement.setString(1, "%" + words + "%");
        preparedStatement.setString(2, genreop);
        resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String isbn = resultSet.getString("isbn");
            String title = resultSet.getString("title");
            String author = resultSet.getString("author");
            String genre = resultSet.getString("genre");
            String genreList = resultSet.getString("genrelist");
            String publishDate = resultSet.getString("publishdate");

            java.sql.Blob blob = resultSet.getBlob("cover");
            byte[] imageData = blob.getBytes(1, (int) blob.length());
            ImageIcon imageIcon = new ImageIcon(imageData);

            tableModel.addRow(new Object[]{imageIcon, isbn, title, author, genre, genreList, publishDate});
        }
        jTable2.setModel(tableModel);
        setTableModification();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
public class WrapTextRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (isSelected==true){
            this.setBackground(new java.awt.Color(248, 135, 62));
        }
        
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setVerticalAlignment(SwingConstants.TOP);
        label.setText("<html><body style='width: 130px; padding: 7px;'>"+value+"</body></html>");
        return label;
    }
}

 private class ImageRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        if (value instanceof ImageIcon) {
            ImageIcon originalIcon = (ImageIcon) value;

            Image originalImage = originalIcon.getImage();
            Image scaledImage = originalImage.getScaledInstance(70, 120, Image.SCALE_SMOOTH);

            ImageIcon scaledIcon = new ImageIcon(scaledImage);

            setIcon(scaledIcon);
        } else {
            setIcon(null);
        }
        return this;
    }
}

    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttncheckout;
    private javax.swing.JButton bttnclear;
    private javax.swing.JButton bttnrefresh;
    private javax.swing.JButton bttnsearh;
    private com.formdev.flatlaf.ui.FlatMenuBarUI flatMenuBarUI1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
