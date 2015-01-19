package stream.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by badbug on 21.12.2014.
 */
public class run {

    public static void main(String[] args) {
        /*Stream<Character> stream = characterStream("hello mikalai");
        stream.forEach(System.out::println);*/



        Stream<Character> stream2 = characterStream("hello mikalai");
        stream2.forEach(System.out::println);


    }

    public static Stream<Character> characterStream(String str){
        List<Character> result = new ArrayList<Character>();
        for (Character character : str.toCharArray()) {
            result.add(character);

        }

        return result.stream();

    }

    public static Stream<Character> characterStream2(String str){

        return Stream.iterate(0, x -> x+10).limit(str.length()).map(str::charAt);

    }
}
