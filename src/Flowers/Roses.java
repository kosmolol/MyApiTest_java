package Flowers;

public class Roses extends Flowers{
    private String colour;
    private int height;
    private static int soldCount;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Roses(String manufactyredCountry, int shelfLife, double price, String colour, int height) {
        super(manufactyredCountry, shelfLife, price);
        this.colour = colour;
        this.height = height;
    }


}
