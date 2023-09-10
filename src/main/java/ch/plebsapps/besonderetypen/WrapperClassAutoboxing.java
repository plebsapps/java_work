package ch.plebsapps.besonderetypen;


public class WrapperClassAutoboxing {
    public static void main(String[] args) {

        //Um eine Wrapper-Klasse in Java zu instanziieren, wird empfohlen,
        // die sogenannten "valueOf"-Methoden zu verwenden,
        // die von den Wrapper-Klassen bereitgestellt werden.
        Integer myInt = Integer.valueOf(42);
        Double myDouble = Double.valueOf(3.14);
        Boolean myBoolean = Boolean.valueOf(true);

        //Boxing
        Character c1 = 'a';
        Integer i1 = 12;
        Long l1 = 12l;
        //Unboxing
        char c2 = c1;
        int i2 = i1;
        long l2 = l1;

        //Autoboxing in Java ist der automatische Prozess,
        // bei dem primitive Datentypen automatisch
        // in ihre entsprechenden Wrapper-Klassen umgewandelt werden, und umgekehrt, wenn notwendig.


        Integer in1 = 1;
        Integer in2 = 1;
        Integer in3 = 1000;
        Integer in4 = 1000;

        System.out.println(in1 == in2);
        System.out.println(in3 == in4);
        //In Java werden die beiden Integer-Objekte in1 und in2 aufgrund der
        // sogenannten "Integer-Caching"-Optimierung auf denselben
        // Wert zwischen -128 und 127 referenziert. Daher wird in1 == in2 true zurückgeben.
        //Die beiden Integer-Objekte in3 und in4 liegen jedoch außerhalb dieses Bereichs,
        // und sie werden unterschiedliche Objekte im Speicher sein.
        // Daher wird in3 == in4 false zurückgeben.


        // Um die Zahlen wirklich zu vergleichen muss man folgendes machen
        System.out.println(in1.intValue() == in2.intValue());
        System.out.println(in3.intValue() == in4.intValue());
    }
}
