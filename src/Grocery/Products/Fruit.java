package Grocery.Products;

public class Fruit extends Product{
    private boolean isOrganic;
    private int bruiseScale;


    public Fruit (String name, int price, String id, String description, int bruiseScale){
        super(name,price,id,description);

        isOrganic = false;
        this.bruiseScale = bruiseScale;
    }

    public Fruit (String name, int price, String id, String description, int bruiseScale, boolean isOrganic){
        super(name,price,id,description);

        this.isOrganic = isOrganic;
        this.bruiseScale = bruiseScale;
    }

    public int getBruiseScale(){
        return bruiseScale;
    }

    public String toString(){
        return super.toString() + "isOrganic: " + isOrganic + " | bruise scale: " + bruiseScale + " |";
    }


}
