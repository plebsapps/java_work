package ch.plebsapps.thread;

import java.util.concurrent.*;

public class ExecutorDemo {

    public static void main(String[] args) throws InterruptedException {
        //einfacherExecutor();
        //executorMitThreadPool();
        //executorServiceMitThreadPool();
        scheduledExecutorServiceDemo();
    }

    //ExecutorsServiceScheduled Service -> erweiterter Funktionsumfang, Scheduled -> wiederholtes abarbeiten
    private static void scheduledExecutorServiceDemo() throws InterruptedException {

        Runnable runnable = () -> {
            System.out.println("Hallo von " + Thread.currentThread());
        };

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(0);// corePoolSize gibt an wie viele Threads mindestens angelegt werden sollen
        // Diese Methode scheduleAtFixedRate(..) liefert ein Future objekt wieder
        ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
        Thread.sleep(2000);
        scheduledFuture.cancel(false);
    }

    // ExecutorsService erweiterter Funktionsumfang von Executors
    private static void executorServiceMitThreadPool() {
        // beachte = Executors.
        ExecutorService executor = Executors.newCachedThreadPool();
        Runnable runnable = () -> {
            System.out.println("Hallo von " + Thread.currentThread());
        };
        executor.execute(runnable);

        // Hallo von Thread[pool-1-thread-1,5,main]
    }

    private static void executorMitThreadPool() {
        // beachte = Executors.
        Executor executor = Executors.newCachedThreadPool();
        Runnable runnable = () -> {
            System.out.println("Hallo von " + Thread.currentThread());
        };
        executor.execute(runnable);

        // Hallo von Thread[pool-1-thread-1,5,main]
        //!!!! Der ThreadPool bleibt 1 weiter Minute aktiv dann baut er sich erst ab!!!!
    }

    private static void einfacherExecutor() {
        Executor exec = new MyExecuter();
        exec.execute(() -> {
            System.out.println("Hallo von " + Thread.currentThread());
        });

        // Hallo von Thread[Thread-0,5,main]
    }
}

class MyExecuter implements Executor {
    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
}
