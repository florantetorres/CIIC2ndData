package Tasksheet1_2_2;
import java.text.SimpleDateFormat;  
import java.util.*;
public class MyDate {
    public static void main(String[] args) {
        int day = 12;
        int month = 11;
        int year = 2012;
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        Date date = calendar.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate = dateFormat.format(date);
        System.out.println(formattedDate);
    }
}
