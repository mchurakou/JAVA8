package stream.task3;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by badbug on 21.12.2014.
 */
public class Run {

    public static void main(String[] args) {
        int[] values = {1,2,3,4,5};
        IntStream str = IntStream.of(values);
        System.out.println(str.toArray().length);
    }
}
