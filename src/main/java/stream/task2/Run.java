package stream.task2;

import java.util.stream.Stream;

/**
 * Created by badbug on 17.12.2014.
 */
public class Run {

    public static void main(String[] args) {
        String[] arr = new String[]{"x1s","xx2","xxx3","xxx4", "xxxx5", "asfasdf6"};
        long count = Stream.of(arr)
                .peek(e -> System.out.println("fetch: " + e))
                .filter((x) -> {
                    System.out.println("check " + x);
                    return x.length() > 2;
                })
                .limit(2).count();
        System.out.println("res:" + count);
    };
    }
