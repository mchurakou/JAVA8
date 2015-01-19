package stream.task13;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by badbug on 23.12.2014.
 */
public class Run {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("x","xxx","s");
        Map<Integer,Long> map = stream.collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map);
    }
}
