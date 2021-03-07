/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.logic;

import java.util.ArrayList;

/**
 *
 * @author PeterSmrecek
 */
public class Test {
    
    public static void customers(Lists lists){
        lists.createCustomer("a", "a", "a", "a");
        lists.createCustomer("b", "b", "b", "b");
        lists.createCustomer("c", "c", "c", "c");
        lists.createCustomer("d", "d", "d", "d");
    }
    
    public static void items(Lists lists){
        lists.createItem("z", "z", "1.00");
        lists.createItem("y", "y", "2,00");
        lists.createItem("x", "x", "3.00");
    }
    
    public static void invoices(Lists lists){
        
        ArrayList<Item> items1 = new ArrayList<Item>();
        ArrayList<Integer> qty1 = new ArrayList<Integer>();
        items1.add(lists.getItem(0));
        qty1.add(1);
        items1.add(lists.getItem(1));
        qty1.add(2);
        
        ArrayList<Item> items2 = new ArrayList<Item>();
        ArrayList<Integer> qty2 = new ArrayList<Integer>();
        items2.add(lists.getItem(0));
        qty2.add(3);
        items2.add(lists.getItem(2));
        qty2.add(4);
        
        ArrayList<Item> items3 = new ArrayList<Item>();
        ArrayList<Integer> qty3 = new ArrayList<Integer>();
        items3.add(lists.getItem(1));
        qty3.add(5);
        items3.add(lists.getItem(2));
        qty3.add(6);
        
        String name = "Peter Smreček";
        String street = "Trenčianska 128/56";
        String town = "Trenčín";
        String postal_code = "01234";
        
        lists.creaiteInvoice("1.2.2021", lists.getCustomer(0), 
                items1, qty1, name, street, town, postal_code);
        
        lists.creaiteInvoice("3.4.2021", lists.getCustomer(1), 
                items2, qty2, name, street, town, postal_code);
        
        lists.creaiteInvoice("5.6.2021", lists.getCustomer(2), 
                items3, qty3, name, street, town, postal_code);
    }
}
