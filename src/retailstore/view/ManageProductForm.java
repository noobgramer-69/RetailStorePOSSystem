/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore.view;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import retailstore.controller.ProductController;
import static retailstore.controller.ProductController.FILE_PATH;

/**
 *
 * @author tsj09
 */
public class ManageProductForm extends javax.swing.JFrame {
    
    ProductController productController;
    /**
     * Creates new form ManageProductForm
     */
    public ManageProductForm() {
        initComponents();
        
        try {
            populateJtable("");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManageProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        productTable.setShowGrid(true);
        
        productTable.setGridColor(Color.YELLOW);
        
        productTable.setSelectionBackground(Color.gray);
        
        JTableHeader th = productTable.getTableHeader();

        th.setFont(new Font("Tahoma", Font.PLAIN, 16));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jButton_INSERT_PRODUCT_ = new javax.swing.JButton();
        jButton_UPDATE_PRODUCT_ = new javax.swing.JButton();
        jButton_DELETE_PRODUCT_ = new javax.swing.JButton();
        jButton_REFRESH_ = new javax.swing.JButton();
        jButton_SEARCH_ = new javax.swing.JButton();
        jTextField_VALUE_TO_SEARCH = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Manage Product");

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(productTable);

        jButton_INSERT_PRODUCT_.setBackground(new java.awt.Color(30, 130, 76));
        jButton_INSERT_PRODUCT_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_INSERT_PRODUCT_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_INSERT_PRODUCT_.setText("Add New Product");
        jButton_INSERT_PRODUCT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_INSERT_PRODUCT_ActionPerformed(evt);
            }
        });

        jButton_UPDATE_PRODUCT_.setBackground(new java.awt.Color(65, 131, 215));
        jButton_UPDATE_PRODUCT_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_UPDATE_PRODUCT_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_UPDATE_PRODUCT_.setText("Edit Product");
        jButton_UPDATE_PRODUCT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATE_PRODUCT_ActionPerformed(evt);
            }
        });

        jButton_DELETE_PRODUCT_.setBackground(new java.awt.Color(246, 36, 89));
        jButton_DELETE_PRODUCT_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_DELETE_PRODUCT_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DELETE_PRODUCT_.setText("Remove Selected Product");
        jButton_DELETE_PRODUCT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DELETE_PRODUCT_ActionPerformed(evt);
            }
        });

        jButton_REFRESH_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_REFRESH_.setText("Refresh");
        jButton_REFRESH_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_REFRESH_ActionPerformed(evt);
            }
        });

        jButton_SEARCH_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_SEARCH_.setText("Search");
        jButton_SEARCH_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SEARCH_ActionPerformed(evt);
            }
        });

        jTextField_VALUE_TO_SEARCH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_VALUE_TO_SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_VALUE_TO_SEARCHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_UPDATE_PRODUCT_, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_INSERT_PRODUCT_, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_DELETE_PRODUCT_, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jTextField_VALUE_TO_SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_SEARCH_, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_REFRESH_, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1)))
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_REFRESH_, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SEARCH_, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_VALUE_TO_SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_INSERT_PRODUCT_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jButton_UPDATE_PRODUCT_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jButton_DELETE_PRODUCT_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_INSERT_PRODUCT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_INSERT_PRODUCT_ActionPerformed

        AddProductForm addProductForm = new AddProductForm();
        addProductForm.pack();
        addProductForm.setVisible(true);
        addProductForm.setLocationRelativeTo(null);
        addProductForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButton_INSERT_PRODUCT_ActionPerformed

    private void jButton_UPDATE_PRODUCT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATE_PRODUCT_ActionPerformed

//        try{
//
//            // open the edit product form and display data into the fields
//            EditProductForm editProductForm = new EditProductForm();
//
//            Integer rowIndex = productTable.getSelectedRow();
//
//            editProductForm.txtproductID = Integer.valueOf(productTable.getValueAt(rowIndex, 0).toString());
//            editProductForm.txtproductName.setText(productTable.getValueAt(rowIndex, 1).toString());
//            editProductForm.txtproductPrice.setText(productTable.getValueAt(rowIndex, 2).toString());
//            editProductForm.txtQuantity.setText(productTable.getValueAt(rowIndex, 3).toString());
//
//            editProductForm.jComboBox1.setSelectedItem(jTable_Products.getValueAt(rowIndex, 6));
//
//            editProductForm.setVisible(true);
//            editProductForm.pack();
//            editProductForm.setLocationRelativeTo(null);
//            editProductForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        }catch(Exception Ex){
//            JOptionPane.showMessageDialog(null, "You Must Select A Product From The Table", "No Product Selected", 2);
//        }
    }//GEN-LAST:event_jButton_UPDATE_PRODUCT_ActionPerformed

    private void jButton_DELETE_PRODUCT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DELETE_PRODUCT_ActionPerformed
        System.out.println("Button Clicked");
        
        try{
            Integer rowIndex = productTable.getSelectedRow();
            String productId = String.valueOf(productTable.getValueAt(rowIndex, 0).toString());
            productController.deleteProduct(productId);

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "You Must Select A Product From The Table", "No Product Selected", 2);
        }

    }//GEN-LAST:event_jButton_DELETE_PRODUCT_ActionPerformed

    private void jButton_REFRESH_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_REFRESH_ActionPerformed

        
        try {
            DefaultTableModel model = (DefaultTableModel) productTable.getModel();          
            model.setRowCount(0);
            populateJtable("");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManageProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_REFRESH_ActionPerformed

    private void jButton_SEARCH_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SEARCH_ActionPerformed

        try {
            populateJtable(jTextField_VALUE_TO_SEARCH.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManageProductForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_SEARCH_ActionPerformed

    private void jTextField_VALUE_TO_SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_VALUE_TO_SEARCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_VALUE_TO_SEARCHActionPerformed

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
            java.util.logging.Logger.getLogger(ManageProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageProductForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DELETE_PRODUCT_;
    private javax.swing.JButton jButton_INSERT_PRODUCT_;
    private javax.swing.JButton jButton_REFRESH_;
    private javax.swing.JButton jButton_SEARCH_;
    private javax.swing.JButton jButton_UPDATE_PRODUCT_;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_VALUE_TO_SEARCH;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables

    private void populateJtable(String val) throws FileNotFoundException {
        
            File file = new File(FILE_PATH);
            
            String[] columnNames = {"Product Id","Name","Category","Price","Quantity","Fragile"};

            if (file.exists()) {

                try {

                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    DefaultTableModel model = (DefaultTableModel) productTable.getModel();
                    productTable.setDefaultEditor(Object.class, null);
                    model.setRowCount(0);
                    model.setColumnIdentifiers(columnNames);
                    
                    Object[] tableLines = bufferedReader.lines().toArray();
                    
                    for(int i = 0; i < tableLines.length; i++)
                    {
                        
                        String line = tableLines[i].toString().trim();
                        String[] dataRow = line.split(",");
                        model.addRow(dataRow);
                    }
                    
                   
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                    
    } 
}



