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
public class Lists {
    
    private ArrayList<Customer> listOfCustomers = new ArrayList<Customer>();
    
    private ArrayList<Item> listOfItems = new ArrayList<Item>();
    
    private ArrayList<Invoice> listOfInvoices = new ArrayList<Invoice>();

    public Lists() {
    }
    
    public boolean createCustomer(String name, String street, String town, String postal_code){
        System.out.println("Vytvaram zakaznika");
        System.out.println("name = " + name);
        System.out.println("street = " + street);
        System.out.println("town = " + town);
        System.out.println("postal_code = " + postal_code);

        try {
            Customer customer = new Customer(name, street, town, postal_code);
            listOfCustomers.add(customer);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public void printCustomers(){
        System.out.println("Vypisujem vsetkych zakaznikov");
        for (Customer listOfCustomer : listOfCustomers) {
            System.out.println(listOfCustomer.getName());
        }
    }
    
    public Customer getCustomer(int index){
        Customer customer = listOfCustomers.get(index);
        return customer;
    }
    
    public void removeCustomer(int index){
        listOfCustomers.remove(index);
    }

    public ArrayList<Customer> getListOfCustomers() {
        return listOfCustomers;
    }
    
    
    
    public boolean createItem(String name, String description, String price){
        System.out.println("Vytvaram tovar");
        System.out.println("name = " + name);
        System.out.println("description = " + description);
        System.out.println("price = " + price);
        
        double price_double = 0.0;
        
        try {
            price = price.replace(",", ".");
            price_double = Double.parseDouble(price);
        } catch (Exception e) {
            return false;
        }
        
        try {
            Item item = new Item(name, description, price_double);
            listOfItems.add(item);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public void printItems(){
        System.out.println("Vypisujem vsetky tovary");
        for (Item listOfItem : listOfItems) {
            System.out.println(listOfItem.getName());
        }
    }
    
    public Item getItem(int index){
        Item item = listOfItems.get(index);
        return item;
    }
    
    public void removeItem(int index){
        listOfItems.remove(index);
    }
    
    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }
    
    
    
    public boolean creaiteInvoice(String dateCreation, String dueDate, Customer customer, 
            ArrayList<Item> subListOfItems, ArrayList<Integer> listOfQty, 
            String name, String street, String town, String postal_code){
        
        try {
            Invoice invoice = new Invoice(dateCreation, dueDate, customer, subListOfItems, 
                    listOfQty, name, street, town, postal_code);
            listOfInvoices.add(invoice);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Invoice getInvoice(int index){
        Invoice invoice = listOfInvoices.get(index);
        return invoice;
    }
    
    public ArrayList<Invoice> getListOfInvoices() {
        return listOfInvoices;
    }
}
