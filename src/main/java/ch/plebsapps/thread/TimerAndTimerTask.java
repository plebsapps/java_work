package ch.plebsapps.thread;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class TimerAndTimerTask {

    public static void main(String[] args) {
        class MyTimerTask extends TimerTask {
            @Override
            public void run() {
                System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    //throw new RuntimeException(e);
                }
            }
        }

        class MyTimerTaskFix extends TimerTask {
            @Override
            public void run() {
                System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + " FIX");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    //throw new RuntimeException(e);
                }
            }
        }

        Timer timer = new Timer();
        timer.schedule(new MyTimerTask(), 0, 1000);

        Timer timer1 = new Timer();
        timer1.scheduleAtFixedRate(new MyTimerTaskFix(), 0, 1000);
    }
}
