package Java.JavaTrack;

import java.util.Calendar;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class DateAndTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        System.out.println(getDay(day, month, year));
    }

    private static String getDay(String day, String month, String year){
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, parseInt(year));
        date.set(Calendar.MONTH, parseInt(month) -1);
        date.set(Calendar.DAY_OF_MONTH, parseInt(day));
        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
        String[] weekdays = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        return weekdays[dayOfWeek - 1];
    }


}

