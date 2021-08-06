/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retailstore.controller;

import com.retailstore.model.Product;
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
      boolean exist =   obj.isProductExits("P101");
        
//        assertTrue(obj.isProductExits("P101"));
         assertFalse(obj.isProductExits("P101"));
    }
    
    
    @Test
    public void testAddProduct(){
        
        Product p = new Product();
        
        p.setProductID("P400");
        p.setProductName("Monitor");
        p.setProductPrice(1000.0);
        p.setProductType("Computer");
        p.setFragile(true);
        
        ProductController controller = new ProductController();
        String status =controller.addProduct(p);
        
        assertEquals(status, "SUCCESS");
        
    }
}
