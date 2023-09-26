package ch.plebsapps.io;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.GZIPOutputStream;

/**
 * Lernziel: `PrinterWriter` und `PrintStream`
 * - Typen von `System.out` und `System.err`
 * - TODO`PrinterWriter`
 * - TODO`PrintStream`
 * - TODO Auto-Flush
 * - TODO Exceptions beim Schreiben
 *
 *  TODO siehe Video 137
 */
public class PrinterWriterPrintStream {
    public static void main( String[] args ) {
        //    PrintStream out = System.out;
        //    out.println( "Hallo Welt" );
        //    StringWriter sw = new StringWriter();
        //    PrintWriter printWriter = new PrintWriter( sw );
        //    printWriter.printf( "%d %s%n", 1, "Zeile 1" );
        //    printWriter.close();
        //    System.out.println( sw.toString() );

        try (OutputStream fos = Files.newOutputStream( Paths.get( "ausgabe.txt.Z" ) );
             OutputStream bos = new BufferedOutputStream( fos );
             OutputStream gzos = new GZIPOutputStream( bos );
             PrintWriter out = new PrintWriter( gzos, false, StandardCharsets.UTF_8 ) ) {
            for ( int i = 0; i < 1000; i++ ) {
                out.println( "Zeile:" );
                out.print( ' ' );
                out.println( i );
            }
        }
        catch ( IOException e ) {
            e.printStackTrace();
        }
    }
}