/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import javax.swing.JOptionPane;
import java.io.File;

/**
 *
 * @author arab-soft
 */
public class OpenPdf {
    public static void openById(String id){
        try{
            if((new File("C:\\Users\\lenovo 520\\Documents\\NetBeansProjects\\Cafe Management System\\src "+id+".pdf")).exists()){
                Process p =Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHadler C:\\Users\\lenovo 520\\Documents\\NetBeansProjects\\Cafe Management System\\src "+id+".pdf");
            
        }
        else
            JOptionPane.showMessageDialog(null, "File doesn't Exists");
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
