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
        lists.createCustomer("Alojz Baťalík", "Citrónová 4", "Dunajská Streda", "01234");
        lists.createCustomer("Emília Fabušová", "Gregorova 22", "Hlohovec", "56789");
        lists.createCustomer("Ivan Jalový", "Klimentova 7", "Levoča", "10111");
        lists.createCustomer("Martin Novák", "Onálepkovaná 127", "Prešov", "21314");
    }
    
    public static void items(Lists lists){
        lists.createItem("Robotický vysávač", "Robotický vysávač na podlahy ovládateľný cez mobilnú aplikáciu", "245.99");
        lists.createItem("Stôl", "Stôl bukový 90x120cm", "75,04");
        lists.createItem("Torta", "Torta punčová s ovocím", "23.99");
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
