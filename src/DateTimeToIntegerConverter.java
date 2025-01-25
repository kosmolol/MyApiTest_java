import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeToIntegerConverter {
  public static void main(String[] args) {
    String dateTimeString = "2023-09-12T12:34:56";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
    LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
    System.out.println("DateTime:" + dateTime );
    int convertedInteger = convertDateTimeToInteger(dateTime);
    System.out.println("Converted integer: " + convertedInteger);
  }

  public static int convertDateTimeToInteger(LocalDateTime dateTime) {
    int year = dateTime.getYear();
    int month = dateTime.getMonthValue();
    int day = dateTime.getDayOfMonth();
    int hour = dateTime.getHour();
    int minute = dateTime.getMinute();
    int second = dateTime.getSecond();

    int convertedInteger = year * 100000000 + month * 1000000 + day * 10000 + hour * 100 + minute;
    return convertedInteger;
  }
}
