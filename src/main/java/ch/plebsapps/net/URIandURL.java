package ch.plebsapps.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Lernziel: URI und URL
 * TODO - Verbindung zur URL aufbauen
 *
 * TODO Video 144
 */
public class URIandURL {
    public static void main( String[] args ) throws URISyntaxException, MalformedURLException {
        // URI = Uniform Resource Identifier
        // isbn:478747474:ullenboom
        // URL = Uniform Resource Locator
        // http://tutego.de
        URI uri = new URI( "urn:isbn:096139210x" );
        System.out.println( uri.getScheme() ); // urn
        System.out.println( uri.getPath() );   // null


        //TODO URL Auslesen und ausgeben
        URL url = new URL( "https://en.wikipedia.org/wiki/Portal:Current_events" );
        try ( InputStream inputStream = url.openStream() ) {
            Scanner scanner = new Scanner( inputStream, StandardCharsets.UTF_8 );
            while ( scanner.hasNextLine() ) {
                System.out.println( scanner.nextLine() );
            }
        }
        catch ( IOException e ) {
            e.printStackTrace();
        }
    }
}