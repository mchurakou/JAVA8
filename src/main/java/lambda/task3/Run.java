package lambda.task3;

import java.io.File;

/**
 * Created by badbug on 05.11.2014.
 */

public class Run {

    public static void main(String[] args) {

        File f =  new File("D:\\JAVA8");
        String end = "2.txt";
        File[] files = f.listFiles(

            (dir, name) -> {
                return name.endsWith(end);
            }

        );


        for (File file : files){
            System.out.println(file);
        }
    }

}
