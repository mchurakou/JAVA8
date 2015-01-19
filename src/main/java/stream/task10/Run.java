package stream.task10;

import java.util.stream.Stream;

/**
 * Created by badbug on 22.12.2014.
 */
public class Run {

    public static void main(String[] args) {
        Stream<Double> stream1 = Stream.of(1.1, 2.2, 3.3, 4.4);


        System.out.println(stream1.mapToDouble((x) -> x).average());



    }
}

