package ch.plebsapps.besonderetypen;

import java.util.Objects;

public class JavaUtilObjects {

    public static void main(String[] args) {
        String name = null;

        System.out.println("null? = " + Objects.requireNonNullElse(name, "lala"));

        //Klasse Objekts in Java
        //TODO ausprobieren der Objects Methoden Video 79
    }

}
