import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Date {

    public static void main(String[] args) {


        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd:MM:YYYY hh:mm:ss");
        LocalDateTime now =  LocalDateTime.now();
        System.out.println(date.format(now));


        Calendar cal = Calendar.getInstance();

        System.out.println(cal.getTime().toString());
        System.out.println("Year = " + cal.get(Calendar.YEAR));
        System.out.println("Month = " + cal.get(Calendar.MONTH)+1);
        System.out.println("Week of Month = " + cal.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Days of Month = " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Weeks of Year = " + cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Hours = " + cal.get(Calendar.HOUR));
        System.out.println("Hours of Day = " + cal.get(Calendar.HOUR_OF_DAY));

      
    }
}
