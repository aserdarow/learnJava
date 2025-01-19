package examples;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void getCurrentDateTime() {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");

        int secondPerDay = 86400;
        short weekdaysCount = 7;

        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();


        System.out.println(date.format(currentDate) + " " + time.format(currentTime));
        System.out.println(date.format(currentDate) + " " + time.format(currentTime));

    }

    public static void main(String[] args) {
        getCurrentDateTime();

    }

}
