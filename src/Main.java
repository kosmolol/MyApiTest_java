class Main{
        public static void main(String[] args) {
                Animal tiger = new Animal("тигр", "Артём");
                tiger.setAge(15);
                tiger.setWeight(300.6);
                tiger.setSwim(true);
                tiger.setWalk(true);
                tiger.setFly(false);
                tiger.display();

                Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
                duck.display();

                Bird b = new Bird();
                b.setName("Bob");
                b.display();
                b.setArea("На югах");
                b.setWinterFly(false);
                System.out.println(b.getArea());
                System.out.println(b.isWinterFly());
                b.chikChirik();

                Fish f = new Fish();
                f.setName("Сельд");
                f.display();
                f.setSquama("Крупная");
                f.setUpStreamSwim(true);
                System.out.println(f.getSquama());
                System.out.println(f.isUpStreamSwim());
                f.bul_bul();

                Insect i = new Insect();
                i.setName("Жук Жукыч");
                i.display();
                i.setWingCount(4);
                i.setLikeJesus(true);
                System.out.println(i.getWingCount());
                System.out.println(i.isLikeJesus());
                i.ggggg();

        }


}