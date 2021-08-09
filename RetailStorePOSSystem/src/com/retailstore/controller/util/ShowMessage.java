/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retailstore.controller.util;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tsj09
 */
public class ShowMessage {
    
    
    public static void showInfoMessage(JFrame jFrame, String message){
          JOptionPane.showMessageDialog(jFrame, message, "Info", JOptionPane.INFORMATION_MESSAGE);
    }
    
     public static void showWarnMessage(JFrame jFrame, String message){
          JOptionPane.showMessageDialog(jFrame, message, "Warn", JOptionPane.WARNING_MESSAGE);
    }
    
      public static void showErrorMessage(JFrame jFrame, String message){
          JOptionPane.showMessageDialog(jFrame, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
}
