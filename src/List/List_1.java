package List;

import java.util.ArrayList;
import java.util.Scanner;
public class List_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i=1; i<=n ; i++){
            list.add(0);
        }
        list.add(1);
        for (int r: list){
            System.out.print(r);
            System.out.print(' ');
        }

    }

    }
