package lambda.task10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by badbug on 10.11.2014.
 */
public class Run {
    public static void main(String[] args) {
        String[] names = {"Peter", "Paul", "Mary"};
        List<Runnable> runners = new ArrayList<>();


        for (String name : names){
            runners.add(()-> System.out.println(name));
        }

        for (Runnable r : runners){
            r.run();
        }

    }
}
