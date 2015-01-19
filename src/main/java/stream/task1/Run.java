package stream.task1;

import java.util.stream.Stream;

/**
 * Created by badbug on 17.12.2014.
 */
public class Run {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String[] arr = new String[]{"x","xx","xxx","xxx", "xxxx", "asfasdf","xx","xxx","xxx", "xxxx", "asfasdf","xx","xxx","xxx", "xxxx", "asfasdf"};
        long count = Stream.of(arr)/*.parallel().*/.filter((x) -> x.length() > 2).count();
        System.out.println("res:" + count);
        long finish = System.currentTimeMillis();

        System.out.println("TIME:" + (finish-start));
    };
    }
