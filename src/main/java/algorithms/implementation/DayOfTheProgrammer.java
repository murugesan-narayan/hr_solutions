package algorithms.implementation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.util.Calendar.*;

public class DayOfTheProgrammer {

    static String dayOfProgrammer(int year) {
        if (year%4 == 0 &&
                (year < 1918 || year%400 == 0 || year%100 != 0))
            return "12.09."+year;
        else if(year==1918)
            return "26.09.1918";
        return "13.09."+year;
    }

}
