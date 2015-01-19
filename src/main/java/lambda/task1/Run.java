package lambda.task1;

import java.util.Arrays;

/**
 * Created by badbug on 05.11.2014.
 */
public class Run {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        String[] strs = new String[]{"one","tw", "tree", "a"};
        Arrays.sort(strs, (String str1, String str2) ->{
                    System.out.println(Thread.currentThread().getName());
                    return Integer.compare(str1.length(),str2.length());}


        );

        for(String str : strs){
            System.out.println(str);
        }

    }
}
