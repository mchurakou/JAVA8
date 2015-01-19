package lambda.task2;

import java.io.File;

/**
 * Created by badbug on 05.11.2014.
 */
public class Run {
    public static void main(String[] args) {

        File f =  new File("D:\\JAVA8");

        File[] files = f.listFiles(

                Run::m1
            /*(dir, name) -> {
                return name.contains("file2.txt");
            }*/

       /* new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.contains("file1.txt");
            }

        }*/);

        for (File file : files){
            System.out.println(file.getName());
        }
    }

    public static boolean m1(File dir, String name) {
        return name.endsWith("file3.txt");
    }
}
