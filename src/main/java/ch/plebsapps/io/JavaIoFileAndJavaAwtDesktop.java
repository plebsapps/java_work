package ch.plebsapps.io;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.Collections;

/**
 * Lernziel: Klassen `File` und `Desktop`
 * TODO - `java.io.File`-Klasse und Nutzer
 * TODO - Mit Dateiendungen assoziierte Programme öffnen
 *
 *  TODO siehe Video 140
 */
public class JavaIoFileAndJavaAwtDesktop {
    public static void main( String[] args ) throws IOException {

        String html = "<body><strong>" + LocalDateTime.now() + "</strong></body>";
        Path path = Files.createTempFile( "", ".html" );
        System.out.println( path );
        Files.write( path, Collections.singletonList( html ) );

        //TODO browser öffnen
        //Öffnet HTML Datei über den Brouser

        Desktop desktop = Desktop.getDesktop();
        if ( desktop != null ) {
            desktop.open( path.toFile() );
        }
    }
}