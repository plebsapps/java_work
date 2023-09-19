package ch.plebsapps.javaselib;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
    public static void main(String[] args) {
//TODO Video 109
        loggingClass();
        Lines line = new Lines();
        line.printLines();
    }

    private static void loggingClass() {

        System.out.println(Lines.class.getName());
    }
}

// TestMetrhode für Logging
class Lines{
    private final static Logger log = Logger.getLogger(Lines.class.getName());

    static void printLines(){

        log.log(Level.SEVERE, "Message");
        System.out.println("------");
    }
}
