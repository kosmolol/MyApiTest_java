public class demo_animal_1 {
        public static void main(String[] args) {
            Animal tiger = new Animal("тигр", "Артём");
            tiger.setAge(15);
            tiger.setWeight(300.6);
            tiger.setSwim(true);
            tiger.setWalk(true);
            tiger.setFly(false);
            tiger.display();

            Animal sparrow = new Animal("воробей", 5);
            sparrow.setWeight(2);
            sparrow.setSwim(false);
            sparrow.setWalk(true);
            sparrow.setFly(true);
            sparrow.display();

            Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
            duck.holiday(5);
            duck.rename("Утя-Утя");
            duck.display();

        }
    }

