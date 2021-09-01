package Grocery.Products;

public class Drank extends Product{
    private final static String[] UNITS = new String[] {"Gal", "oz", "litre", "ml", "pint", "qt"};
    private int volume;
    private String volumeUnit;

    public Drank(String name,int price, String id, String description, int volume, String volumeUnit){
        super(name,price,id, description);
        this.volume = volume;
        this.volumeUnit = volumeUnit;
    }

    public Drank(String name,int price, String id, String description, int volume, int volumeUnit){
        super(name,price,id, description);
        this.volume = volume;
        this.volumeUnit = UNITS[volumeUnit];
    }

    public String toString(){
        return super.toString() + "Volume: " + volume + " | Volume Unit: " + volumeUnit;
    }
}
