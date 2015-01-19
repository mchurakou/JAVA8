package lambda.task9;

/**
 * Created by badbug on 09.11.2014.
 */
public class Run {

    public static void main(String[] args) {
        andThen(() -> System.out.println("1"), () -> System.out.println("2")).run();
    }

    public static Runnable andThen(Runnable r1, Runnable r2){
        return () -> {          r1.run();
            r2.run();
        };
    }
}
