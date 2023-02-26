import java.util.Scanner;

class Programm{

    public static int second_count(int d, int h, int m, int s){
        int allsec = s + m * 60 + h * 60*60 + d * 24 * 60 * 60;
        return allsec;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        System.out.println("Секунд прошло: " + second_count(d, h, m, s));
    }

}
