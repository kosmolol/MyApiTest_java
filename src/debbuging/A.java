package debbuging;
import java.util.Scanner;

class A{
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        boolean pin_code_coincided = true;
        while (true){
            String correct = sc.nextLine();
            String vasya = sc.nextLine();
            counter++;
            if(correct.equals(vasya)){
                System.out.println("СORRECT");
                break;
            }
            System.out.println("INCORRECT" + counter);
        }
        if (!pin_code_coincided){
            System.out.println("Error");
        }else{
            System.out.println("CORRECT");
        }
    }
}
