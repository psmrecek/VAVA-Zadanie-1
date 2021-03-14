/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.logic;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PeterSmrecek
 */
public class InputSanitizer {
    

    public static boolean isInt(Object x){
        try {
            return x.getClass() == Integer.class;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean isPositiveInt(Object x){
        if(isInt(x)){
            int a = (int) x;
            return a >= 0;
        }  
        return false;
    }
    
    public static boolean isNull(Object x){
        return x == null;
    }
    
    public static int validQuantity(Object x) throws Exception{
        
        if(isPositiveInt(x)){
            return (int) x;
        }
        
        if(isNull(x)){
            return 0;
        }
        
        throw new Exception("Wrong quantity");
    }
    
    public static boolean validPriceFromString(String priceString){
        double price;
        
        try {
            priceString = priceString.replace(",", ".");
            price = Double.parseDouble(priceString);
        } catch (Exception e) {
            return false;
        }
        
        if(price < 0.0){
            return false;
        }
        
        return true;
        
    }
    
    public static boolean emptyString(String string){
        return string.length() == 0;
    } 
    
    public static boolean validDate(String string){
        try {
            Date date = new SimpleDateFormat("dd.mm.yyyy").parse(string);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
