public class Bird extends Animal {
  private  String Area;
   private boolean winterFly;

    Bird(String type, String name, int age, double weight, boolean isWalk, boolean isSwim, String Area,boolean winterFly ) {
        this.setType(type);
        this.setAge(age);
        this.setName(name);
        this.setWeight(weight);
        this.setFly(true);
        this.setWalk(isWalk);
        this.setSwim(isSwim);
        this.Area=Area;
        this.winterFly=winterFly;
    }

    Bird(){
        this.setFly(true);
    }

    public String getArea() {
        return Area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setArea(String area) {
        Area = area;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    public void chikChirik(){
        System.out.println("Chirik-Chirik");
    }

}
