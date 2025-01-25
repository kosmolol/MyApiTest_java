import java.util.Scanner;

public class test2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // System.out.System.out.println("Введите сумму:");
    System.out.println("Введите сумму:");
    double sum = scanner.nextDouble();

    System.out.println("Введите количество дней:");
    int days = scanner.nextInt();

    for (int i = 1; i <= days; i++) {
      sum += sum * 0.1;
    }

    System.out.println("Сумма через " + days + " дней: " + sum);
  }
}
