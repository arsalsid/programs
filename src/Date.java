import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void main(String[] args) {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd:MM:YYYY hh:mm:ss");
        LocalDateTime now =  LocalDateTime.now();
        System.out.println(date.format(now));

    }
}
