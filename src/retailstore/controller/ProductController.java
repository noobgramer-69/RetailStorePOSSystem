/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore.controller;

import retailstore.model.Fragile;
import retailstore.model.NonFragile;
import retailstore.model.Product;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tsj09
 */
public class ProductController {

    public static final String FILE_PATH = "data/Product.txt";

    //1. Get Product Info using Product getter emthos
    //2. Raad  Product information and check product id already exists
    //3. If proudct not exists rwady to write product infor to text file
    //4. if existws return error message with product exists info
    //5. if okay okay to write then product data save to text file
    public String addProduct(Product product) {

        String productId = product.getProductID();

        if (!isProductExits(productId)) {
            String line = null;
            if(isFirstLine()){
             line = productId + "," + product.getProductName() + "," + product.getProductType()
                    + "," + product.getProductPrice() + "," + product.getquantity() + "," + product.isFragile();
            }else{
               line = "\n" + productId + "," + product.getProductName() + "," + product.getProductType()
                    + "," + product.getProductPrice() + "," + product.getquantity() + "," + product.isFragile();   
            }
            File file = new File(FILE_PATH);

            if (file.exists()) {

                try {
                    FileWriter fileWriter = new FileWriter(file, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                    bufferedWriter.write(line);
                    bufferedWriter.flush();

                    return "SUCCESS";

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } else {
            return "PRODUCT_EXIST";
        }

        return "ERROR";

    }
    
    
    public String updateProduct(Product product) {

        String productId = product.getProductID();

        if (isProductExits(productId)) {
            
            
             String updatedLine = productId + "," + product.getProductName() + "," + product.getProductType()
                    + "," + product.getProductPrice() + "," + product.getquantity() + "," + product.isFragile();


            File file = new File(FILE_PATH);

            if (file.exists()) {

                try {

                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);

                    String line = null;
                    
                    // StringBuffer Object use here because it can easily append data when compared with String
                    StringBuffer sb = new StringBuffer();

                    while ((line = bufferedReader.readLine()) != null) {

                        String data[] = line.split(",");

                        String existingProductId = data[0];

                      //  System.out.println(line);

                        if (productId.equals(existingProductId)) {
                           
                             sb.append(updatedLine + "\n");
                        }else{
                              sb.append(line + "\n");
                        }
                    }
                    
                    System.out.println("sb : " + sb);
                    FileWriter fileWriter = new FileWriter(file, false);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(sb.toString());
                    bufferedWriter.flush();

                   

                    return "SUCCESS";

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } else {
            return "PRODUCT_NOT_EXIST";
        }

        return "ERROR";

    }

    public String deleteProduct(String productId) {

        if (isProductExits(productId)) {

            File file = new File(FILE_PATH);

            if (file.exists()) {

                try {

                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);

                    String line = null;
                    
                    // StringBuffer Object use here because it can easily append data when compared with String
                    StringBuffer sb = new StringBuffer();

                    while ((line = bufferedReader.readLine()) != null) {

                        String data[] = line.split(",");

                        String existingProductId = data[0];

                      //  System.out.println(line);

                        if (!productId.equals(existingProductId)) {
                           
                             sb.append(line + "\n");
                        }
                    }
                    
                    System.out.println("sb : " + sb);
                    FileWriter fileWriter = new FileWriter(file, false);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(sb.toString());
                    bufferedWriter.flush();

                   

                    return "SUCCESS";

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } else {
            return "PRODUCT_NOT_EXIST";
        }

        return "ERROR";

    }

    
     public boolean isFirstLine() {

        // Read Texxt File
        File file = new File(FILE_PATH);

        if (file.exists()) {

            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line = null;
                while ((line = bufferedReader.readLine()) == null) {

                   return true;
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }
     
    public boolean isProductExits(String productId) {

        // Read Texxt File
        File file = new File(FILE_PATH);

        if (file.exists()) {

            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line = null;
                while ((line = bufferedReader.readLine()) != null) {

                    String data[] = line.split(",");

                    String existingProductId = data[0];

                    System.out.println(line);

                    if (productId.equals(existingProductId)) {

                        return true;
                    }
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return false;
    }

    public Product findProduct(String productId) {

        // Read Texxt File
        File file = new File(FILE_PATH);

        if (file.exists()) {

            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line = null;
                while ((line = bufferedReader.readLine()) != null) {

                    String data[] = line.split(",");

                    String existingProductId = data[0];

                    System.out.println(line);

                    if (productId.equals(existingProductId)) {

                        String existingProductName = data[1];
                        String existingProductType = data[2];
                        String existingProductPrice = data[3];
                        String existingProductQuantity = data[4];
                        String existingProductFragile = data[5];
                        System.out.println("existingProductName : " + existingProductName);
                        System.out.println("existingProductType : " + existingProductType);
                        System.out.println("existingProductPrice: " + existingProductPrice);
                        System.out.println("existingProductQuantity : " + existingProductQuantity);
                        System.out.println("existingProductFragile : " + existingProductFragile);
                        //P300,Monitor,Computer,1000.0,true

                        if (existingProductFragile.equals("true")) {
                            Fragile f = new Fragile();
                            f.setProductID(productId);
                            f.setProductName(existingProductName);
                            f.setProductPrice(Double.parseDouble(existingProductPrice));
                            f.setProductType(existingProductType);
                            f.setquantity(Integer.parseInt(existingProductQuantity));
                            f.setFragile(true);
                            return f;
                        } else {
                            NonFragile nf = new NonFragile();
                            nf.setProductID(productId);
                            nf.setProductName(existingProductName);
                            nf.setProductPrice(Double.parseDouble(existingProductPrice));
                            nf.setProductType(existingProductType);
                            nf.setquantity(Integer.parseInt(existingProductQuantity));
                            nf.setFragile(false);
                            return nf;
                        }

                    }
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }

        public List<Product> findProductsByName(String productName) {

        // Read Texxt File
        File file = new File(FILE_PATH);
        List<Product> productList = new ArrayList<Product>();

        if (file.exists()) {

            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line = null;
                while ((line = bufferedReader.readLine()) != null) {

                    String data[] = line.split(",");

                     String existingProductName = data[1];

                    System.out.println(line);

                    if (existingProductName.startsWith(productName)) {
                        
                        String existingProductId = data[0];
                       
                        String existingProductType = data[2];
                        String existingProductPrice = data[3];
                        String existingProductQuantity = data[4];
                        String existingProductFragile = data[5];
                        System.out.println("existingProductName : " + existingProductName);
                        System.out.println("existingProductType : " + existingProductType);
                        System.out.println("existingProductPrice: " + existingProductPrice);
                        System.out.println("existingProductQuantity : " + existingProductQuantity);
                        System.out.println("existingProductFragile : " + existingProductFragile);
                        //P300,Monitor,Computer,1000.0,true

                        if (existingProductFragile.equals("true")) {
                            Fragile f = new Fragile();
                            f.setProductID(existingProductId);
                            f.setProductName(existingProductName);
                            f.setProductPrice(Double.parseDouble(existingProductPrice));
                            f.setProductType(existingProductType);
                            f.setquantity(Integer.parseInt(existingProductQuantity));
                            f.setFragile(true);
                            productList.add(f);
                         
                        } else {
                            NonFragile nf = new NonFragile();
                            nf.setProductID(existingProductId);
                            nf.setProductName(existingProductName);
                            nf.setProductPrice(Double.parseDouble(existingProductPrice));
                            nf.setProductType(existingProductType);
                            nf.setquantity(Integer.parseInt(existingProductQuantity));
                            nf.setFragile(false);
                            productList.add(nf);
                        }

                    }
                }
                
                return productList;

            } catch (FileNotFoundException ex) {
                Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return null;
    }

    public static void main(String[] args) {

        ProductController obj = new ProductController();
        String result = obj.deleteProduct("P005");

        System.out.println("result : " + result);
    }

}
