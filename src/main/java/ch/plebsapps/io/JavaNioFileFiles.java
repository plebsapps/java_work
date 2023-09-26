package ch.plebsapps.io;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

//TODO siehe Video 133

public class JavaNioFileFiles {

    public static void main(String[] args) {
        try {
            //writeAndRead();
            //userPath();
            //userPathTyp();
            //walkPath();
            walkFileTreeDemo();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void walkFileTreeDemo() {
        Path path = Paths.get( System.getProperty( "user.home" ) );

        SimpleFileVisitor<Path> visitor = new SimpleFileVisitor<>() {
            @Override public FileVisitResult visitFile(Path file, BasicFileAttributes attrs ) throws IOException {
                System.out.println( file );
                return FileVisitResult.CONTINUE;
            }

            @Override public FileVisitResult postVisitDirectory( Path dir, IOException exc ) throws IOException {
                if ( exc == null )
                    return FileVisitResult.CONTINUE;
                else
                    return FileVisitResult.SKIP_SUBTREE;
            }

            @Override public FileVisitResult visitFileFailed( Path file, IOException exc ) throws IOException {
                return FileVisitResult.SKIP_SUBTREE;
            }
        };

        try {
            Files.walkFileTree( path, visitor );
        }
        catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    private static void walkPath() {
            Path path = Paths.get( System.getProperty( "user.home" ) );

            //Aber Achtung, sobald die walk() Methode auf etwas trift
            // was einen Fehler macht, bricht die Methode walk() ab.
            try ( Stream<Path> walk = Files.walk( path ) ) {
              walk.forEach( System.out::println );
            }
            catch ( IOException e ) {
              e.printStackTrace();
            }
    }

    private static void userPathTyp() throws IOException {
        //Home Verzeichnis des Users
        Path path = Paths.get( System.getProperty( "user.home" ) );

        System.out.println( path );
        try ( Stream<Path> list = Files.list( path ) ) {
            list.forEach( p -> {
                if ( Files.isDirectory( p ) )
                    System.out.print( "<D> " );
                else if ( Files.isRegularFile( p ) ) {
                    try {
                        BasicFileAttributes basicFileAttributes = Files.readAttributes( path, BasicFileAttributes.class );
                        System.out.printf( "<F> %d %s ", Files.size( p ), basicFileAttributes.lastModifiedTime() );
                    }
                    catch ( IOException e ) {
                        e.printStackTrace();
                    }
                }
                System.out.println( p );
            } );
        }
    }

    private static void userPath() {
        Path path = Paths.get( System.getProperty( "user.home" ) );
        System.out.println( path );
    }

    private static void writeAndRead() throws IOException {
        String html = "<html>Hallo Welt</html>";
        Files.writeString(Paths.get("out.html"), html);

        String s = Files.readString(Paths.get("out.html"));
        System.out.println(s);
    }

}
