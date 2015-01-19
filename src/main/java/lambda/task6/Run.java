package lambda.task6;

/**
 * Created by badbug on 05.11.2014.
 */
public class Run {

    public static void main(String[] args) {
        Thread t;
        t = new Thread(uncheck(() ->
            {
                System.out.println("start");
                Thread.sleep(1000);
                System.out.println("finish");
            }
        ));

        t.start();
    }

    public static Runnable uncheck(RunnableEx r){
        return new Runnable(){
            public void run(){
                try {
                    r.run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }






}
