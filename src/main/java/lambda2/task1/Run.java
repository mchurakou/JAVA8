package lambda2.task1;



import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by badbug on 19.01.2015.
 */
public class Run {

    private static final Logger log = Logger.getGlobal();


    public static void main(String[] args) {
        log.info("log");
        log.info(() -> "x" + "2");

         logIf(Level.WARNING, () -> 10 == 10, () -> "1" + "2");


    }


    public static void logIf(Level l, Supplier<Boolean> p, Supplier<String> s){

        if (log.isLoggable(l) && p.get()){
            log.log(l, s.get());
        }

    }
}
