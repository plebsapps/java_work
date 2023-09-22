package ch.plebsapps.thread;

public class RunnableAndThread {
    public static void main(String[] args) {

        //threadNewThread();
        //threadWithLamdaThread();
        //threadWithMethodenReference();
        threadWithNameThread();
    }

    private static void threadWithNameThread() {

        System.out.println(Thread.currentThread());

        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
                System.out.println(Thread.currentThread());
            }
        };

        Thread thread = new Thread(runnable);
        //Thread thread = new Thread(runnable, "Thread Nr1");
        thread.setName("Thread Nr1");
        thread.start();
    }

    private static void threadWithMethodenReference() {

        //Dieser Runnable mit der Methodenreferenz "printNumbers" kann noch kürzer geschrieben werden.
        MyTask myTask = new MyTask();
        Runnable runnable = myTask::printNumbers;
        Thread thread = new Thread(runnable);
        thread.start();

        new Thread(new MyTask()::printNumbers).start();
    }

    private static void threadWithLamdaThread() {

        System.out.println(Thread.currentThread());

        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
                System.out.println(Thread.currentThread());
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    private static void threadNewThread() {

        System.out.println(Thread.currentThread());

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i);
                    System.out.println(Thread.currentThread());
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
class MyTask {
    public void printNumbers() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            System.out.println(Thread.currentThread());
        }
    }
}