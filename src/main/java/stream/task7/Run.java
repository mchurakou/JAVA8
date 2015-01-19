package stream.task7;

import java.util.stream.Stream;

/**
 * Created by badbug on 22.12.2014.
 */
public class Run {

    public static void main(String[] args) {
        System.out.println();

        Stream s1 =Stream.generate(() -> 1);

        Stream s2 = Stream.of(1,2,3);
        System.out.println(isFinite(s1));
        System.out.println(isFinite(s2));
    }

    public static <T> boolean isFinite(Stream<T> stream){
        Stream<T> limited = stream.limit(100);
        return !(limited.count() == 100);
    }
}
