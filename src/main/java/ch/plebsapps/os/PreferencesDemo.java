package ch.plebsapps.os;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 * Lernziel: Benutzerdaten mit `Preferences` speichern
 * TODO - Klasse `Preferences` und Methoden
 * TODO Schreiben in der Registrie
 *
 * TODO 148
 * TODO https://docs.oracle.com/en/java/javase/21/docs/api/java.prefs/java/util/prefs/Preferences.html
 */
public class PreferencesDemo {
    public static void main( String[] args ) throws BackingStoreException {
        Preferences preferences = Preferences.userRoot().node( "ch.plebsapps.os" );
        System.out.println( preferences.get( "username", "" ) );
        System.out.println( preferences.getInt( "age", 0 ) );
        preferences.put( "username", "Bob" );
        preferences.putInt( "age", 99 );
        System.out.println( preferences.get( "username", "" ) );
        System.out.println( preferences.getInt( "age", 0 ) );
        preferences.remove( "age" );
        System.out.println( preferences.getInt( "age", 0 ) );
        // preferences.removeNode();
    }
}