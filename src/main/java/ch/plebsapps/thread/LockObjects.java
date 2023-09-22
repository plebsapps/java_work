package ch.plebsapps.thread;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockObjects {

    public static void main(String[] args) {
        //ohneLockObjekt();
        mitLockObjekt();
    }

    private static void mitLockObjekt() {
        StringBuilder sb = new StringBuilder();
        Lock lock = new ReentrantLock();

        Runnable runnable = () -> {
            String now = LocalTime.now().toString();
            try {
                lock.lock();
                for (int i = 0; i < now.length(); i++) {
                    sb.append(now.charAt(i));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {}
                    System.out.println(sb);
                }
            } finally {
                // ************************
                // WICHTIG das man das unlock auf jeden fall ausführt, deshalb muss es auch in ein finnaly
                // ***************************
                lock.unlock();
            }
        };

        ExecutorService executor = Executors.newCachedThreadPool();
        // Hier wird es jetzt das Problem geben das ich zwar viele
        // Runnable starten kann dieses aber sich gegenseitig ins gehege kommen
        executor.submit(runnable);
        executor.submit(runnable);
        executor.submit(runnable);
        executor.submit(runnable);
        executor.shutdown();
    }

    private static void ohneLockObjekt() {

        StringBuilder sb = new StringBuilder();

        Runnable runnable = () -> {
            String now = LocalTime.now().toString();

            for (int i = 0; i < now.length(); i++) {
                sb.append(now.charAt(i));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {}
                System.out.println(sb);
            }
        };

        ExecutorService executor = Executors.newCachedThreadPool();
        // Hier wird es jetzt das Problem geben das ich zwar viele
        // Runnable starten kann dieses aber sich gegenseitig ins gehege kommen
        executor.submit(runnable);
        executor.submit(runnable);
        executor.submit(runnable);
        executor.submit(runnable);
        executor.shutdown();
    }

}
