public class PassworValidate {
    private static final int CRITICAL_LENGTH = 8;

    public static boolean containsSpecialCharacters(String password) {
        // Регулярное выражение для проверки специальных символов
        String specialCharacters = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";

        // Проверяем, содержит ли пароль хотя бы один специальный символ
        return password.matches(".*" + specialCharacters + ".*");
    }

    public static boolean isLengthValid(String password) {

        return password.length() > CRITICAL_LENGTH;
    }

    public static boolean hasDigels(String password) {
        return password.matches(".*[0-9].*");
    }

    public static boolean hasDiffrentCases(String password) {
        String lowerCasePassword = password.toLowerCase();
        return !lowerCasePassword.equals(password);
    }

    public static byte passwordStrength(String password){
        byte passStrength = 0;
        if (hasDiffrentCases(password)) {
            passStrength++;
        }
        if (hasDigels(password)){
            passStrength++;
        }
        if (isLengthValid(password)){
            passStrength++;
        }
        if (containsSpecialCharacters(password)){
            passStrength++;
        }
        return passStrength;
    }


    public static void main(String[] args) {
        String password = "pswr";

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
        if (hasDigels(password)) {
            System.out.println("Пароль содержит цифры");
        } else {
            System.out.println("Пароль не содержит цирфры");
        }
        if (hasDiffrentCases(password)) {
            System.out.println("Пароль содержит символы в разном регистре");
        } else {
            System.out.println("Пароль не содержит символов в разном регистре");
        }
        System.out.println(passwordStrength(password));
    }
}
