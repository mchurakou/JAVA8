package stream.task8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by badbug on 21.12.2014.
 */
public class Run {

    public static void main(String[] args) {
        Integer[] ar1 = {1,2,3,4,5,6};
        Stream<Integer> str1 = Stream.of(ar1);

        Integer[] ar2 = {11,12,13,14};
        Stream<Integer> str2 = Stream.of(ar2);

        Stream res = zip(str1, str2);
        res.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){

        Iterator<T> it1 = first.iterator();
        Iterator<T> it2 = second.iterator();

        boolean f = true;

        List<T> list = new ArrayList<T>();

        while (it1.hasNext() ||it2.hasNext() ){
            if (f && it1.hasNext() ){
                list.add(it1.next());
            } else if (!f && it2.hasNext()){
                list.add(it2.next());
            }

            f = !f;
        }

       return list.stream();
    }
}
