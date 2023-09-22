package ch.plebsapps.thread;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Interrupt {

    public static void main(String[] args) {

        //threadStartWhileTrue();
        //threadStartWhileWitheFunktionalMethode();
        //threadVeryShort();
        //threadWithInterrupt();
        threadsWithJoin();
    }

    public static void threadsWithJoin()  {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1 - Count: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2 - Count: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        // Warte auf das Ende von thread1
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread 1 beendet. Fortsetzung im Hauptthread.");
    }

    private static void threadWithInterrupt() {

        Runnable runnable = () -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println(LocalTime.now());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //Der Interrupt muss wiederholt werden weil durch die Ausnahme das Flag Interrupt wieder auf false gesetzt wird.
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread.interrupt();
    }

    private static void threadVeryShort() {
        new Thread(new NewTasK()::print).start();
    }

    private static void threadStartWhileWitheFunktionalMethode() {
        NewTasK task = new NewTasK();
        Runnable runnable = task::print;
        Thread thread = new Thread(runnable);
        thread.start();
    }

    private static void threadStartWhileTrue() {
        Runnable runnable = () -> {
            while (true) {
                try {
                    System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("h:m:s")));
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    //throw new RuntimeException(e);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}

class NewTasK {
    public void print() {
        while (true) {
            try {
                System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("h:m:s")));
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                //throw new RuntimeException(e);
            }
        }
    };
}