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
public class Customer {
    
    private String name;
    private String street;
    private String town;
    private String postal_code;

    public Customer(String name, String street, String town, String postal_code) {
        this.name = name;
        this.street = street;
        this.town = town;
        this.postal_code = postal_code;
    }
    
    public String invFormatCustomer(){
        String lb = "\n";
        String text = name + lb + street + lb + town + lb + postal_code;
        
        return text;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }
    
}
