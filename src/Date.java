import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Date {

    public static void main(String[] args) {

        int Day;
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd:MM:YYYY hh:mm:ss");
        LocalDateTime now =  LocalDateTime.now();
        System.out.println(date.format(now));

        int dayOfWeek = Calendar.DAY_OF_WEEK;
        System.out.println(Calendar.DAY_OF_WEEK);

    }
}
