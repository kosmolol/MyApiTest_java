public class Animal {
    private String type;
   private  String name;
    private int age;
    private double weight;
    private boolean isFly;
    private boolean isWalk;
    private boolean isSwim;


  public   Animal(String type,String name){
      this.type = type;
      this.name = name;

  }
    public   Animal(String type,String name, int age,double weight,boolean isFly,boolean isWalk,boolean isSwim){

        this.type = type;
        this.name = name;
        this.age=age;
        this.weight = weight;
        this.isFly=isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }
    public   Animal(String type, int age){
      this.name = "No Name";
      this.type = type;
      this.age = age;

    }
    public   Animal(){};

   public String getType(){
      return type;
   }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isFly() {
        return isFly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    public void setType(String type){
        this.type = type;
    }

    
   public void display(){
      System.out.println("*********************************************");
       System.out.println("Тип:" + type);
       System.out.println("Имя: " + name);
       System.out.println("Возраст: " + age);
       System.out.println("Вес: " + weight);
       System.out.println("Умеет летать: " + ( (isFly?"Да":"Нет")));
       System.out.println("Умеет ходить: " + ( (isWalk?"Да":"Нет")));
       System.out.println("Умеет плавать: " +( (isSwim?"Да":"Нет")));
       System.out.println("*********************************************");
   }

   public void rename (String new_name){
       name = new_name;

   }


   public void holiday (){
       weight = weight + 0.1;
       weight = Math.ceil(weight*100)/100;
   }

    public void holiday(double m) {
      weight+=m;
        weight = Math.ceil(weight*100)/100;
    }

    public void holiday(double m, int n) {
        weight = weight + (n * m);
        weight = Math.ceil(weight*100)/100;
    }
}





