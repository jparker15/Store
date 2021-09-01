package Grocery;

import Grocery.Products.Drank;
import Grocery.Products.Fruit;
import Grocery.Products.Product;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> inventory = new ArrayList<>();
    private int balance = 500_00;
    private String name;


    public Store (String name){
        this.name = name;
    }

    public void addToInventory(Product product){
        if(product.getPrice() > balance){
            System.out.println("No funds");
            return;
        }
        balance -= product.getPrice();

        inventory.add(product);
    }


    public void addToInventory(String name,int price, String id, String description,int volume, String volUnit ){
        Drank drink = new Drank(name,price,id,description,volume,volUnit);
        addToInventory(drink);
    }


    public void addToInventory(String name, int price, String id, String description, int bruiseScale, boolean isOrganic){
        Fruit fruit = new Fruit(name,price,id,description,bruiseScale,isOrganic);
        addToInventory(fruit);
    }

    public void throwAway(Product product){
        inventory.remove(product);
    }

    public String getInventory(){
        String output = "";

       for (Product p: inventory){
           output += p + " | \n";
        }

       return output;
    }

    public String getName(){
        return name;
    }

}
