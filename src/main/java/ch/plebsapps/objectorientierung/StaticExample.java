package ch.plebsapps.objectorientierung;

public class StaticExample {
    // Statische Variable
    static int count;

    public static void main(String[] args) {
        System.out.println("Die main-Methode wurde aufgerufen.");
        System.out.println("Anzahl: " + count);
    }

    // Statischer Initialisierungsblock
    static {
        count = 1;
        System.out.println("Statischer Initialisierungsblock wurde aufgerufen.");
    }
}


