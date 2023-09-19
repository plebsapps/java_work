package ch.plebsapps.javaselib;

import java.util.Map;
import java.util.Properties;

public class SystemRuntimeSystemProperties {

    public static void main(String[] args) {

        Map<String, String> getenv = System.getenv();
        System.out.println(getenv);

        Properties prob = System.getProperties();
        System.out.println(prob);

        System.out.println( );
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("java.io.tmpdir"));

        System.out.println();
        System.out.println(Runtime.getRuntime().maxMemory());
        System.out.println(Runtime.getRuntime().freeMemory());
        System.out.println(Runtime.getRuntime().availableProcessors());

        //Hier könnte man etwas mitgeben was ausgeführt wird wenn die Laufzeitumgebung heruntergefahren wird.
        //Runtime.getRuntime().addShutdownHook();

        //Um die Property SLOW in der Java Laufzeitumgebung zu setzen muss man das Programm follgendermassen starten
        //PS C:\Dev\Java\java_aufgaben\java_work\build\classes\java\main> java -DSLOW=23 ch.plebsapps.javaselib.SystemRuntimeSystemProperties
        System.out.println(System.getProperty("SLOW"));


    }
}
