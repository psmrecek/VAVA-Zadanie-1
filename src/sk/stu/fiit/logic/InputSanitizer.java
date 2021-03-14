/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.logic;

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
    
}
