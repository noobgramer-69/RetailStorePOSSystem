/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore.view;

import java.util.List;
import java.util.Vector;
import retailstore.controller.ProductController;
import retailstore.controller.util.ShowMessage;
import retailstore.controller.util.Validation;
import retailstore.model.Product;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tsj09
 */
public class AdminManageProduct extends javax.swing.JFrame {

    /**
     * Creates new form Customer_Product
     */
    ProductController productController;

    Vector productColumn;

    public AdminManageProduct() {
        initComponents();
        buttonGroup1.add(radFragile);
        buttonGroup1.add(radNonFragile);

        productController = new ProductController();

        productColumn = new Vector();

        productColumn.add("Product ID");
        productColumn.add("Product Name");
        productColumn.add("Product Type");
        productColumn.add("Quantity");
        productColumn.add("Fragile");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        editProductBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        addProductBtn = new javax.swing.JButton();
        deleteProductBtn = new javax.swing.JButton();
        searchProductBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        viewProductBtn = new javax.swing.JButton();
        txtproductName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtproductID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboproductType = new javax.swing.JComboBox<>();
        txtquantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        radFragile = new javax.swing.JRadioButton();
        radNonFragile = new javax.swing.JRadioButton();
        searchProductTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editProductBtn.setText("Edit");
        editProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProductBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Manage Product");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Products List");

        addProductBtn.setText("Add");
        addProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductBtnActionPerformed(evt);
            }
        });

        deleteProductBtn.setText("Delete");
        deleteProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductBtnActionPerformed(evt);
            }
        });

        searchProductBtn.setText("Search");
        searchProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductBtnActionPerformed(evt);
            }
        });

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Name", "Type", "Price", "Quantity", "Fragile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        viewProductBtn.setText("View");
        viewProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jLabel4.setText("Product ID");

        jLabel5.setText("Quantity");

        jLabel6.setText("Type");

        cboproductType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "Desktop", "Display", "Accessories" }));
        cboproductType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboproductTypeActionPerformed(evt);
            }
        });

        jLabel7.setText("Price");

        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });

        jLabel8.setText("Fragile");

        radFragile.setText("Yes");
        radFragile.setName("Fragile"); // NOI18N

        radNonFragile.setText("No");
        radNonFragile.setName("Fragile"); // NOI18N
        radNonFragile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radNonFragileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtproductName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(addProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)
                                        .addComponent(deleteProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(txtproductID, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(searchProductTF, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(editProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(viewProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(170, 170, 170))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8))
                                                .addGap(31, 31, 31)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cboproductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(radFragile)
                                                        .addGap(26, 26, 26)
                                                        .addComponent(radNonFragile))))
                                            .addComponent(searchProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtproductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cboproductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtproductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(radFragile, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radNonFragile, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchProductTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchProductBtn))
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void radNonFragileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radNonFragileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radNonFragileActionPerformed

    private void cboproductTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboproductTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboproductTypeActionPerformed

    private void viewProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductBtnActionPerformed

        String productId = txtproductID.getText();
        if (productId != null && productId.length() > 0) {

            Product product = productController.findProduct(productId);

            if (product != null) {

                txtproductName.setText(product.getProductName());
                cboproductType.setSelectedItem(product.getProductType());
                txtquantity.setText(Integer.toString(product.getquantity()));
                txtprice.setText(Double.toString(product.getProductPrice()));
                if (product.isFragile()) {
                    radFragile.setSelected(true);
                } else if (!product.isFragile()) {
                    radNonFragile.setSelected(true);
                }

            } else {
                ShowMessage.showWarnMessage(this, "Invalid Product ID");

                txtproductID.setText("");
                txtproductName.setText("");
                txtquantity.setText("");
                txtprice.setText("");
                cboproductType.setSelectedItem(0);
                radFragile.setSelected(false);
                radNonFragile.setSelected(false);

                txtproductID.requestFocus();
            }

        } else {
            ShowMessage.showWarnMessage(this, "Please Enter Product ID");
            txtproductID.requestFocus();
        }


    }//GEN-LAST:event_viewProductBtnActionPerformed

    private void searchProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductBtnActionPerformed
      
        
        String productName = searchProductTF.getText();
        
        loadProductInfoToTable(productName);
        
    }//GEN-LAST:event_searchProductBtnActionPerformed

    private void deleteProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductBtnActionPerformed

        System.out.println("Button Clicked");

        String productId = txtproductID.getText();
        String productName = txtproductName.getText();
        String quantity = txtquantity.getText();
        if (productId != null && productId.length() > 0) {
            String productID = productController.deleteProduct(productId);
        }


    }//GEN-LAST:event_deleteProductBtnActionPerformed

    private void addProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductBtnActionPerformed

        System.out.println("Button Clicked");

        String productId = txtproductID.getText();

        if (productId != null && productId.length() > 0) {

            String productName = txtproductName.getText();

            if (productName != null && productName.length() > 0) {

                String quantity = txtquantity.getText();

                if (quantity != null && quantity.length() > 0) {

                    if (Validation.isIntegerNumber(quantity)) {

                        String price = txtprice.getText();

                        if (price != null && price.length() > 0) {

                            if (Validation.isFloatingNumber(price)) {

                                String type = (String) cboproductType.getSelectedItem();
                                Boolean fragile = radFragile.isSelected();
                                Boolean nonFragile = radNonFragile.isSelected();

                                Product p = new Product();

                                p.setProductID(productId);
                                p.setProductPrice(Double.parseDouble(price));

                                if (fragile) {
                                    p.setFragile(true);
                                } else {
                                    p.setFragile(false);
                                }

                                p.setProductName(productName);
                                p.setquantity(Integer.parseInt(quantity));
                                p.setProductType(type);

                                ProductController controller = new ProductController();
                                String status = controller.addProduct(p);

                                if (status.equals("SUCCESS")) {
                                    ShowMessage.showInfoMessage(this, productId + " Added succesfully");
                                } else if (status.equals("PRODUCT_EXIST")) {

                                    ShowMessage.showWarnMessage(this, productId + " Already Exist");
                                } else {
                                    ShowMessage.showErrorMessage(this, productId + " not added. Error !!!");
                                }

                            }

                        } else {
                            ShowMessage.showWarnMessage(this, "Please Enter Product Price");
                            txtprice.requestFocus();
                        }

                    } else {
                        ShowMessage.showWarnMessage(this, "Invalid Number format for Product Quantity. Enter Integer Number");
                        txtquantity.requestFocus();
                    }

                } else {
                    ShowMessage.showWarnMessage(this, "Please Enter Product Quantity");
                    txtquantity.requestFocus();
                }

            } else {
                ShowMessage.showWarnMessage(this, "Please Enter Product Name");
                txtproductName.requestFocus();
            }

        } else {
            ShowMessage.showWarnMessage(this, "Please Enter Product ID");
            txtproductID.requestFocus();
        }


    }//GEN-LAST:event_addProductBtnActionPerformed

    private void editProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProductBtnActionPerformed
        System.out.println("Button Clicked");

        String productId = txtproductID.getText();
        String productName = txtproductName.getText();
        String quantity = txtquantity.getText();
        String price = txtprice.getText();
        String productType = (String) cboproductType.getSelectedItem();
        Boolean fragile = radFragile.isSelected();
        Boolean notfragile = radNonFragile.isSelected();

        if (productId != null && productId.length() > 0) {

            Product product = new Product();
            product.setProductID(productId);
            product.setProductName(productName);
            product.setProductPrice(Double.parseDouble(price));
            product.setquantity(Integer.parseInt(quantity));
            product.setProductType((String) cboproductType.getSelectedItem());
            product.setFragile(radFragile.isSelected());
            product.setFragile(radNonFragile.isSelected());

            if (fragile) {
                product.setFragile(true);
            } else {
                product.setFragile(false);
            }

            String status = productController.updateProduct(product);

            if (status.equals("SUCCESS")) {
                ShowMessage.showInfoMessage(this, productId + " Product updated successfully !!");
            } else if (status.equals("PRODUCT_NOT_EXIST")) {
                ShowMessage.showWarnMessage(this, productId + " Product Not Exist");
            } else {
                ShowMessage.showErrorMessage(this, productId + " Product ID Update Error !!. ");
            }

        } else {
            ShowMessage.showWarnMessage(this, "Please Enter Product ID");
            txtproductID.requestFocus();
        }


    }//GEN-LAST:event_editProductBtnActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

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
            java.util.logging.Logger.getLogger(AdminManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminManageProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboproductType;
    private javax.swing.JButton deleteProductBtn;
    private javax.swing.JButton editProductBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productTable;
    private javax.swing.JRadioButton radFragile;
    private javax.swing.JRadioButton radNonFragile;
    private javax.swing.JButton searchProductBtn;
    private javax.swing.JTextField searchProductTF;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtproductID;
    private javax.swing.JTextField txtproductName;
    private javax.swing.JTextField txtquantity;
    private javax.swing.JButton viewProductBtn;
    // End of variables declaration//GEN-END:variables

    private void loadProductInfoToTable(String productName) {

        List<Product> productList = productController.findProductsByName(productName);

        Vector productRows = new Vector();

        for (Product p : productList) {
            System.out.println(">>>> " + p.getProductName());
            Vector row = new Vector();

            row.add(p.getProductID());
            row.add(p.getProductName());
            row.add(p.getProductType());
            row.add(p.getProductPrice());
            row.add(p.getquantity());
            row.add(p.isFragile());

            productRows.add(row);

            productTable.setModel(new DefaultTableModel(productRows, productColumn) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            });

        }
    }
}