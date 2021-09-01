package Grocery;

import Grocery.Products.Drank;
import Grocery.Products.Fruit;
import Grocery.Products.Product;
import Grocery.console.UI;

public class Main {
    public static void main(String[] args){

        Store store = new Store("Barker I");
//
//        store.addToInventory(new Fruit("Banapple",299,"Bn231","banana apple",5,true));
//        store.addToInventory(new Fruit("CranBerry",19,"Cn812","cranberry berry",2));
//        store.addToInventory( new Product("Pear",666,"Th1c","thickums"));
//        store.addToInventory(new Drank("Actavis", 2000, "l-0212", "Lean", 1, "pt" ));
//
//        System.out.println(store.getInventory());

        UI.start(store);

    }
}
