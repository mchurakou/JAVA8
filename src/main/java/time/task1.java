package time;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by badbug on 01.02.2015.
 */
public class task1 {
    public static void main(String[] args) {
        System.out.println("time");
        LocalDate ld = LocalDate.of(2015,1,1);
        LocalDate res = ld.plus(Period.ofDays(255));
        System.out.println(res);
    }
}

