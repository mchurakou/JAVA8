package stream.task5;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by badbug on 21.12.2014.
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("xx");

        Stream.iterate(0l, x -> {
            return (25214903917l * x + 11l) % ((long)Math.pow(2l,48l));
    }).limit(10).forEach(System.out::println);




    }

}
