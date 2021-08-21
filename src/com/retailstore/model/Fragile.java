/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retailstore.model;

/**
 *
 * @author tsj09
 */
public class Fragile extends Product {
    
   private boolean specialPackage;

    /**
     * @return the specialPackage
     */
    public boolean isSpecialPackage() {
        return specialPackage;
    }

    /**
     * @param specialPackage the specialPackage to set
     */
    public void setSpecialPackage(boolean specialPackage) {
        this.specialPackage = specialPackage;
    }
}
