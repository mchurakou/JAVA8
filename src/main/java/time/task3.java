package time;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.util.function.Predicate;

/**
 * Created by badbug on 01.02.2015.
 */
public class task3 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.with(next(w -> w.getDayOfWeek().getValue() < 6)));
    }


    static TemporalAdjuster next(Predicate<LocalDate> pre){
        return temporal -> {
            LocalDate res = (LocalDate) temporal;

            do{
                res = res.plusDays(1);
            } while (!pre.test(res));

            return res;
        };
    }

}
