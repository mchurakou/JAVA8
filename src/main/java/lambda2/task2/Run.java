package lambda2.task2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by badbug on 19.01.2015.
 */
public class Run {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        withLock(lock, new Runnable() {
            @Override
            public void run() {
                System.out.println("xxx");
            }
        });


    }

    public static void  withLock(ReentrantLock lock, Runnable r){
        lock.lock();
        try {
            r.run();
        } finally {
            lock.unlock();
        }
    }
}
