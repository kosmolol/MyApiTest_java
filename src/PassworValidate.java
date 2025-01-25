public class PassworValidate {
private static final int CRITICAL_LENGTH = 8;
   public static boolean containsSpecialCharacters(String password) {
    // Регулярное выражение для проверки специальных символов
     String specialCharacters = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";

    // Проверяем, содержит ли пароль хотя бы один специальный символ
    return password.matches(".*" + specialCharacters + ".*");
  }

  public static boolean isLengthValid(String password){
     return password.length()> CRITICAL_LENGTH;
  }

  public static void main(String[] args) {
    String password = "MyP@ssw0rd!";

    if (containsSpecialCharacters(password)) {
      System.out.println("Пароль содержит специальные символы.");
    } else {
      System.out.println("Пароль не содержит специальных символов.");
    }

    if (isLengthValid(password)) {
      System.out.println("Пароль  соотвествует минимальной длинне");
    } else {
      System.out.println("Пароль не соотвествует минимальной длинне");
    }
   }

}
