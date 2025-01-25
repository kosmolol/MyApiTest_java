package Flowers;

public abstract class Flowers {

    private String manufactyredCountry;
    private int shelfLife;
    private final String name;


    public String getManufactyredCountry() {
        return manufactyredCountry;
    }

    public int getShelfLife() {
        return shelfLife;
    }



    public void setManufactyredCountry(String manufactyredCountry) {
        this.manufactyredCountry = manufactyredCountry;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }



    public Flowers (String manufactyredCountry, int shelfLife, String name){
        this.manufactyredCountry=manufactyredCountry;

        this.shelfLife=shelfLife;

        this.name = name;
    }

    public Flowers(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
