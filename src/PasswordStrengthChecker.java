import java.util.regex.*;

public class PasswordStrengthChecker {

  public static int calculatePasswordStrength(String password) {
    int strength = 0;

    // Проверка длины пароля
    if (password.length() >= 8) {
      strength++;
    }

    // Проверка наличия заглавных букв
    if (containsUppercase(password)) {
      strength++;
    }


    // Проверка наличия цифр
    if (containsDigit(password)) {
      strength++;
    }

    // Проверка наличия специальных символов
    if (containsSpecialChar(password)) {
      strength++;
    }

    return strength;
  }

  private static boolean containsUppercase(String password) {
    return !password.equals(password.toLowerCase());
  }


  private static boolean containsDigit(String password) {
    return password.matches(".*\\d.*");
  }

  private static boolean containsSpecialChar(String password) {
    Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
    Matcher matcher = pattern.matcher(password);
    return matcher.find();
  }

  public static void main(String[] args) {
    String password = "Pass1#51251";
    int strength = calculatePasswordStrength(password);
    System.out.println("Сложность пароля: " + strength + " из 4");
  }
}