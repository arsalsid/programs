import java.time.LocalDateTime;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Date {

    public static void main(String[] args) {

        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd:MM:YYYY hh:mm:ss");
        LocalDateTime now =  LocalDateTime.now();
        System.out.println(date.format(now));

        int Weekofmonth = Calendar.DAY_OF_WEEK_IN_MONTH;
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);

    }
}
