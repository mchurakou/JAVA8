package stream.task9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by badbug on 22.12.2014.
 */
public class Run {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");

        List<String> list2 = new ArrayList<String>();
        list2.add("4");
        list2.add("5");
        list2.add("6");

        Stream<List> stream1 = Stream.of(list1,list2);
        stream1.forEach(System.out::println);

        Stream<List> stream2 = Stream.of(list1,list2);
        Optional<List> opt = stream2.reduce((x, y) -> {
                    List res = new ArrayList(x);
                    res.addAll(y);
                    return res;
                }
        );

        System.out.println(opt.get());

        Stream<List> stream3 = Stream.of(list1,list2);
        List res3 = stream3.reduce(Collections.emptyList(),(x, y) -> {
                    List res = new ArrayList(x);
                    res.addAll(y);
                    return res;
                }
        );

        System.out.println(res3);

        Stream<List<String>> stream4 = Stream.of(list1,list2);
        List<String> res4 = stream4.reduce(new ArrayList<String>(),(total, list) -> {
                    total.addAll(list);
                    return total;
                },
                ( total1,  total2) -> {
                    total1.addAll(total2);

                    return total1;}
        );

        System.out.println(res4);
    }
}
