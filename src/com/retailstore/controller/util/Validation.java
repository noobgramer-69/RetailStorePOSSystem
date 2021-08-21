/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retailstore.controller.util;

/**
 *
 * @author tsj09
 */
public class Validation {

    public static boolean isIntegerNumber(String value) {

        try {

            Integer.parseInt(value);

            return true;
        } catch (NumberFormatException ex) {
            return false;
        }

    }
    
    
    public static boolean isFloatingNumber(String value) {

        try {

            Double.parseDouble(value);

            return true;
        } catch (NumberFormatException ex) {
            return false;
        }

    }
    


}
