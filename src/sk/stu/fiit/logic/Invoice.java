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
public class Invoice {
    
    private String date;
    private Customer customer;
    private ArrayList<Item> listOfItems;
    private ArrayList<Integer> listOfQty;
    private String my_name;
    private String my_street;
    private String my_town;
    private String my_postal_code;
    private double sum_items = 0.0;

    public Invoice(String date, Customer customer, ArrayList<Item> listOfItems, 
            ArrayList<Integer> listOfQty, String name, String street, 
            String town, String postal_code) {
        this.date = date;
        this.customer = customer;
        this.listOfItems = listOfItems;
        this.listOfQty = listOfQty;
        this.my_name = name;
        this.my_street = street;
        this.my_town = town;
        this.my_postal_code = postal_code;
        
        for (int i = 0; i < listOfItems.size(); i++) {
            this.sum_items += listOfItems.get(i).getPrice() * listOfQty.get(i);
        }
        
    }
    
    public String invFormatAuthor(){
        String lb = "\n";
        String text = my_name + lb + my_street + lb + my_town + lb + my_postal_code;
        
        return text;
    }
    
    public String invFormatItems(){
        String lb = "\n";
        String text = "";
        
        for (int i = 0; i < listOfItems.size(); i++) {
            text += listOfItems.get(i).invFormatItem() + 
                    "€\t" + Integer.toString(listOfQty.get(i)) + "ks\n";
        }
        
        return text;
    }
    
    public String getMy_postal_code() {
        return my_postal_code;
    }

    public void setMy_postal_code(String my_postal_code) {
        this.my_postal_code = my_postal_code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(ArrayList<Item> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public ArrayList<Integer> getListOfQty() {
        return listOfQty;
    }

    public void setListOfQty(ArrayList<Integer> listOfQty) {
        this.listOfQty = listOfQty;
    }

    public String getMy_name() {
        return my_name;
    }

    public void setMy_name(String my_name) {
        this.my_name = my_name;
    }

    public String getMy_street() {
        return my_street;
    }

    public void setMy_street(String my_street) {
        this.my_street = my_street;
    }

    public String getMy_town() {
        return my_town;
    }

    public void setMy_town(String my_town) {
        this.my_town = my_town;
    }

    public double getSum_items() {
        return sum_items;
    }

    public void setSum_items(double sum_items) {
        this.sum_items = sum_items;
    }
    
    
    
    
}
