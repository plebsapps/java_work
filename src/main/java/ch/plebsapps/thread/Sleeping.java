package ch.plebsapps.thread;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class Sleeping {

    public static void main(String[] args) {

        sleepingWithThreeds();
        sleepingWithTimeUnit();
    }

    private static void sleepingWithTimeUnit() {

        System.out.println(LocalTime.now());
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            //Empty
            //throw new RuntimeException(e);
        }
        System.out.println(LocalTime.now());

    }

    private static void sleepingWithThreeds() {
        System.out.println(LocalTime.now());
        try {
            // Es wird der aktuelle (der im dem man Thread.sleep() aufruft)
            // Thread schlafen gelegt.
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            //Empty
            //throw new RuntimeException(e);
        }
        System.out.println(LocalTime.now());

    }
}
