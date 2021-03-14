/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.stu.fiit.logic;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author PeterSmrecek
 */
public class Invoice {
    
    private String dateCreation;
    private String dueDate;
    private Customer customer;
    private ArrayList<Item> listOfItems;
    private ArrayList<Integer> listOfQty;
    private String my_name;
    private String my_street;
    private String my_town;
    private String my_postal_code;
    private double sum_items = 0.0;
    private static DecimalFormat df = new DecimalFormat("0.00");
    
    public Invoice(String dateCreation, String dueDate, Customer customer, ArrayList<Item> listOfItems, 
            ArrayList<Integer> listOfQty, String name, String street, 
            String town, String postal_code) {
        this.dateCreation = dateCreation;
        this.dueDate = dueDate;
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
        String text = getMy_name() + lb + getMy_street() + lb + getMy_town() + lb + getMy_postal_code();
        
        return text;
    }
    
    public String invFormatItems(){
        String lb = "\n";
        String text = "";
        
        for (int i = 0; i < getListOfItems().size(); i++) {
            text += getListOfItems().get(i).invFormatItem() + 
                    "€\t" + Integer.toString(getListOfQty().get(i)) + "ks\n";
        }
        
        return text;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public String getDueDate() {
        return dueDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }

    public ArrayList<Integer> getListOfQty() {
        return listOfQty;
    }

    public String getMy_name() {
        return my_name;
    }

    public String getMy_street() {
        return my_street;
    }

    public String getMy_town() {
        return my_town;
    }

    public String getMy_postal_code() {
        return my_postal_code;
    }

    public double getSum_items() {
        return sum_items;
    }
    
    public String getSum_items_string(){
        return df.format(sum_items);
    }
}
