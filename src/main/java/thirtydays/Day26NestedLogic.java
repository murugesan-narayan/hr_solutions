package thirtydays;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.MONTHS;
import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.time.temporal.TemporalAdjusters.lastDayOfYear;

public class Day26NestedLogic {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String actualDate = sc.nextLine();
        String expectedDate = sc.nextLine();
        sc.close();
        int fine = 0;
        String[] dateDetail = actualDate.split(" ");
        String[] eDetail = expectedDate.split(" ");

        int aDate = Integer.parseInt(dateDetail[0]);
        int aMonth = Integer.parseInt(dateDetail[1]);
        int ayear = Integer.parseInt(dateDetail[2]);

        int eDate = Integer.parseInt(eDetail[0]);
        int eMonth = Integer.parseInt(eDetail[1]);
        int eYear = Integer.parseInt(eDetail[2]);

        if (ayear > eYear) {
            fine = 10000;
        } else if (ayear == eYear && aMonth > eMonth) {
            fine = 500 * (aMonth - eMonth);
        } else if (ayear == eYear && aMonth == eMonth && aDate > eDate) {
            fine = 15 * (aDate - eDate);
        }
        System.out.println(fine);*/
        Scanner sc = new Scanner(System.in);
        String returnDateLine = sc.nextLine();
        String expectedDateLine = sc.nextLine();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("d M y");
        LocalDate returnDate = LocalDate.parse(returnDateLine, df);
        LocalDate expectedDate = LocalDate.parse(expectedDateLine, df);
        long fine = 0;
        if(returnDate.isAfter(expectedDate.with(lastDayOfYear()))) {
            fine = 10000;
        } else if(returnDate.isAfter(expectedDate.with(lastDayOfMonth()))) {
            fine = 500 * MONTHS.between(expectedDate, returnDate);
        } else if (returnDate.isAfter(expectedDate)) {
            fine = 15 * DAYS.between(expectedDate, returnDate);
        }
        System.out.println(fine);
    }

}
