package Flowers;

public class Flowers {

    private String manufactyredCountry;
    private int shelfLife;
    private double price;
    private static int soldCount;

    public String getManufactyredCountry() {
        return manufactyredCountry;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public double getPrice() {
        return price;
    }

    public void setManufactyredCountry(String manufactyredCountry) {
        this.manufactyredCountry = manufactyredCountry;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Flowers (String manufactyredCountry, int shelfLife, double price ){
        this.manufactyredCountry=manufactyredCountry;
        this.price=price;
        this.shelfLife=shelfLife;

    }

    public Flowers(){}




}
