/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retailstore.controller;

import retailstore.controller.ProductController;
import retailstore.model.Product;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tsj09
 */
public class ProductControllerTestCase {
    
    public ProductControllerTestCase() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testProdcutExist(){
        
          
      ProductController obj =new ProductController();
      boolean exist =   obj.isProductExists("P101");
        
//        assertTrue(obj.isProductExits("P101"));
         assertFalse(obj.isProductExists("P101"));
    }
    
    
    @Test
    public void testAddProduct(){
        
        Product p = new Product();
        
        p.setProductID("P503");
        p.setProductName("Monitor");
        p.setProductPrice(1000.0);
        p.setProductType("Computer");
        p.setFragile(true);
        
        ProductController controller = new ProductController();
        String status =controller.addProduct(p);
        
        assertEquals("SUCCESS",status);
        
    }
    
    
     @Test
    public void testUpdateProduct(){
        
        Product p = new Product();
        
        p.setProductID("P004");
        p.setProductName("Dell");
        p.setProductPrice(6000.0);
        p.setProductType("Laptop");
        p.setFragile(true);
        
        ProductController controller = new ProductController();
        String status =controller.updateProduct(p);
        
        assertEquals("SUCCESS",status);
        
    }
}
