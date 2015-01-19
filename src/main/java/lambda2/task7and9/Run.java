package lambda2.task7and9;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by badbug on 19.01.2015.
 */
public class Run {
    public static void main(String[] args) {
        String[] str = new String[]{"x","c","d","a"};

        Arrays.sort(str, generate());

        Stream.of(str).forEach((x) -> System.out.println(x));


        /******9*****/

        Person p1 = new Person ("f1", "f2","f37");
        Person p2 = new Person ("f1", "f2","f35");
        Person p3 = new Person ("f1", "f0","f35");

        Person[] ps = new Person[]{p1,p2,p3};

        Arrays.sort(ps, generateLex("city","firstName","lastName"));

        Stream.of(ps).forEach((x) -> System.out.println(x));

    }

   static Comparator<String> generate(){

        return (String s1, String s2) ->
        {
            return s1.compareToIgnoreCase(s2);
        };
    }


    static Comparator<Person> generateLex(String... fields ){

        return (Person s1, Person s2) ->
        {
            Class c = Person.class;
           for (String f : fields){

               Field field = null;
               try {
                 field = c.getField(f);
                 String val1 = (String) field.get(s1);
                 String val2 = (String) field.get(s2);


                 int res = val1.compareTo(val2);
                 if (res != 0){
                     return res;
                 }
               } catch (Exception e) {
                   e.printStackTrace();
               }


           }

            return 0;

        };
    }
}
