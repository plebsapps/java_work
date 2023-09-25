package ch.plebsapps.thread;

//TODO Callable


import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args)  {
        //callableMitFututeGet();
        callableMitFutureGetTimeOut();
    }

    /**
     * Das wäre die variante mit future.get(Time, TimeUnit) diese wartet
     * bis ein ergebnis kommt und solange wie Zeit angegeben,
     * falls diese Zeit überschritten wird wirft die Methode *.get(T,T)
     * ein TimeoutException
     */
    private static void callableMitFutureGetTimeOut() {
        Callable<String> callable = new Caller("ReverseCaller");
        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> future = service.submit(callable);

        //TODO Future Objekt

        try {
            System.out.println(future.get(1, TimeUnit.SECONDS));
        } catch (InterruptedException | TimeoutException | ExecutionException e) {
            System.out.println("Maby TimeOut");
        } finally {
            service.shutdown();
        }
    }

    /**
     * Dieses Beispile ist mit Future.get() diese Methode des
     * Futures Objekt wartet/blockt solange bis ein ergebnis kommt.
     */
    private static void callableMitFutureGet() {
        Callable<String> callable = new Caller("ReverseCallString");
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<String> future = executor.submit(callable);

        try {
            System.out.println("VOR dem future.get()");
            //  Die Methode get() vom dem Future wartet solange bis das ergebnis kommt
            System.out.println(future.get());

            System.out.println("Nach dem future.get(Timen)");
        } catch (ExecutionException | InterruptedException  e) {
            System.out.println("TimeoutException");
        } finally {
            System.out.println("Nach dem future.get(Timen) im Finally");
            executor.shutdown();
        }
    }
}

class Caller implements Callable<String> {
    String reverse;

    public Caller(String reverse) {
        this.reverse = reverse;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return new StringBuilder(reverse).reverse().toString();
    }
}