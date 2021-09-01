package Grocery.console;

import Grocery.Store;

import java.util.Scanner;

public class UI {
    private static Scanner scanner = new Scanner(System.in);

    private final static String[] MENU = new String[]{
            "1. add product to inventory",
            "2. throw away a product",
            "3. list products available",
            "4. sell a product",
            "5. quit"
    };

    private final static String[] PRODUCT_TYPES = new String[]{
            "1. Drink",
            "2. Fruit",
    };

    public static void welcome(String name) {
        System.out.println("Welcome to " + name + "!");
    }

    public static void displayOptions(String prompt, String[] options) {
        System.out.println(prompt);
        for(String option: options){
            System.out.println(option);
        }

    }

    public static void start(Store store) {
        welcome(store.getName());
//        displayOptions(MENU[], );
        int choice = getInt(1, 5, "Enter selection between 1 and 5:");
    }

    public static int getInt(int min, int max, String prompt) {
        int option = 3;
        do {
            System.out.println(prompt);
            String input = scanner.next();
            // TODO: catch the below in case of error and prevent application from crashing
            try{
                option = Integer.parseInt(input);

            }
            catch(NumberFormatException nfe){
                System.out.println("Invalid Number");
            }
            catch (Exception e){
                System.out.println(e);
                System.out.println("Incorrect entry");
                option = max + 1;
            }   //finally always runs regardless of exceptions
            finally{
                System.out.println("I II III IV V");
            }
        } while (option < min || option > max);
        return option;
    }

    public static void handleSelection(int choice){
        switch(choice){
            case 1 -> addProduct();
            case 2 -> throwAway();
            case 3 -> displayProducts();
            case 4 -> sellProduct();
            case 5 -> System.exit(0);
            default -> System.out.println("invalid number received");
        }
    }

    private static void addProduct(){

    }
}
