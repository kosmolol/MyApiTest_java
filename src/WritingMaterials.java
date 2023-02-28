public class WritingMaterials {
    private String name;
    private String color;
    private int price;
    private double length;
    private boolean draw;

    public WritingMaterials(String name, double length, int price, boolean draw){
        this.name = name;
        this.length =length;
        this.price = price;
        this.draw=draw;

    }
    public WritingMaterials(String name, String color){
        this.name = name;
        this.color = color;
    }

    public WritingMaterials( String name, int price){
        this.name = name;
        this.price = price;
        this.color = "No Color";
    }

    public WritingMaterials(int price, double length, boolean draw){
        this.name = "No Name";
        this.price = price;
        this.length = length;
        this.draw = draw;
        this.color = "No Color";
    }

    public WritingMaterials(){}


    public String getName(){
        return  name;
    }

    public String getColor(){
        return color;
    }

    public int getPrice(){
        return price;
    }

    public double getLength(){
        return length;
    }

    public boolean isDraw(){
        return draw;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color=color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setDraw (boolean draw) {
        this.draw = draw;
    }

    public void display(){
        System.out.println("Название: " + name + " Цвет: " + color + " Длина: " + length + " Цена: " + price +  " Умеет рисовать: " +  ( (draw?"Да":"Нет")));
    }

    public void replace_rod(String color2) {
        color = color2;
    }

    public void priceUp(int upper_price){
        this.price += upper_price;
    }

    public void priceDown(int discount_sum){
        this.price-=discount_sum;
    }

    public void draw(){
        if  (draw == true ) {System.out.println(name + " провел линию. Ее цвет " + color + ".");}
        else   System.out.println(name + " не может ничего нарисовать.");

    }

}
