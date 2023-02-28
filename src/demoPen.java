public class demoPen {

    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.setName("ручка");
        pen.setColor("Красный");
        pen.setLength(15.6);
        pen.setPrice(145);
        pen.setDraw(true);
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("Синий");
        pen.draw();

        WritingMaterials ruler = new WritingMaterials();
        ruler.setName("линейка");
        ruler.setLength(30.0);
        ruler.setPrice(25);
        ruler.setDraw(false);
        ruler.display();
        ruler.draw();
        ruler.priceUp(13);
        ruler.display();


        WritingMaterials ruler2 = new WritingMaterials("линека", 34);
        ruler.display();
        ruler.draw();

        WritingMaterials wm1 = new WritingMaterials(23, 67.8, false);
        wm1.display();
        wm1.draw();

        WritingMaterials wm2 = new WritingMaterials("Циркуль", "Зелёный");
        wm2.setDraw(true);
        wm2.display();
        wm2.draw();

        WritingMaterials pen2 = new WritingMaterials();
        pen2.setName("ручка");
        pen2.setColor("Красный");
        pen2.setLength(11.6);
        pen2.setPrice(167);
        pen2.setDraw(true);
        pen2.display();
        pen2.draw();
        pen2.priceDown(10);
        pen2.display();
        pen2.priceUp(23);
        pen2.display();
        pen2.replace_rod("Синий");
        pen2.draw();
        System.out.println(pen2.getName());
        System.out.println(pen2.getColor());
        System.out.println(pen2.getLength());
        System.out.println(pen2.getPrice());
        System.out.println(pen2.isDraw());
    }
    }

