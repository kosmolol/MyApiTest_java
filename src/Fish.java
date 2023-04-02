public class Fish extends Animal {

  private   String squama;
  private  boolean upStreamSwim;

    public String getSquama() {
        return squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public void bul_bul(){
        System.out.println("Bul-bul");
    }
    Fish(){
        this.setSwim(true);

    }

    public void display(){
        System.out.println("I am Fish");

    }
}
