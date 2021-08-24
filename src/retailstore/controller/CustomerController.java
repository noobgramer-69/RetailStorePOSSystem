/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailstore.controller;

import retailstore.model.Customer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tsj09
 */
public class CustomerController {
    
    public static final String FILE_PATH = "data/Customer.txt";
    //1. Get Customer using customer getter emthos
    //2. Raad  Customer information and checking customer id already exists
    //3. If customer not exists rady to write customer infor to text file
    //4. if existws return error message with customer exists info
    //5. Write customer data to text file
    public String addCustomer(Customer customer){
        
        String customerID = customer.getCustomerID();
        if (!isCustomerExists(customerID)) {

            String line = "\n" + customerID+ "," + customer.getCustomerName() + "," + customer.getAddress()
                    + "," + customer.getContactNumber();

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
            return "CUSTOMER_EXIST";
        }

        return "ERROR";

    }
    
     public String updateCustomer(Customer customer) {

        String customerID = customer.getCustomerID();

        if (isCustomerExists(customerID)) {
            
            
             String updatedLine = customerID + "," + customer.getCustomerName() + "," + customer.getAddress()
                    + "," + customer.getContactNumber();

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

                        String existingCustomerID = data[0];

                      //  System.out.println(line);

                        if (customerID.equals(existingCustomerID)) {
                           
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
   
    public String deleteCustomer(String customerID) {

        if (isCustomerExists(customerID)) {

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

                        String existingCustomerID = data[0];

                      //  System.out.println(line);

                        if (!customerID.equals(existingCustomerID)) {
                           
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
            return "CUSTOMER_NOT_EXIST";
        }

        return "ERROR";

    }
    
    public Customer viewProduct(String customerID) {

        // Read Texxt File
        File file = new File(FILE_PATH);

        if (file.exists()) {

            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line = null;
                while ((line = bufferedReader.readLine()) != null) {

                    String data[] = line.split(",");

                    String existingCustomerID = data[0];

                    System.out.println(line);

                    if (customerID.equals(existingCustomerID)) {

                        String existingCustomerName = data[1];
                        String existingCustomerAddress = data[2];
                        String existingCustomerContactNumber = data[3];
                        System.out.println("existingCustomerName : " + existingCustomerName);
                        System.out.println("existingCustomerAddress : " + existingCustomerAddress);
                        System.out.println("existingCustomerContactNumber: " + existingCustomerContactNumber);

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

    public boolean isCustomerExists(String CustomerID) {

        // Read Texxt File
        File file = new File(FILE_PATH);

        if (file.exists()) {

            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line = null;
                while ((line = bufferedReader.readLine()) != null) {

                    String data[] = line.split(",");

                    String existingCustomerID = data[0];

                    System.out.println(line);

                    if (CustomerID.equals(existingCustomerID)) {

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
    
}