public class Insect extends Animal {
    private int wingCount;
    private boolean likeJesus;

    public int getWingCount() {
        return wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    Insect(){
        this.setWalk(true);
    }

    public void ggggg(){
        System.out.println("Ggggg");
    }
}
