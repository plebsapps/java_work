package ch.plebsapps.io;

import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

//TODO siehe Video 132

public class JavaNioFileSystemPathPaths {
    public static void main(String[] args) {

        //TODO Path
        getFileSystemDemo();
        getPathDemo();
       // getPathAbJava11();
    }

    private static void getPathAbJava11() {
        //    Path.of(  ) Java 11

        // Zip File System Provider
        Path path = Paths.get("zip-file.zip");
        //Das Zip-File wird als jar in Java gesehen!!!
        URI uri = URI.create("jar:file:" + path.toUri().getPath());
        Map<String, String> env = new HashMap<>();
        FileSystem fs = null;
        try {
            fs = FileSystems.newFileSystem(uri, env);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        fs.getPath("");
    }

    private static void getPathDemo() {
        Path user = Paths.get( "c:", "dev" );
        System.out.println( user );

        System.out.println( user.resolve( "java" ) );

        System.out.println( user.resolve( "java_aufgaben/java_work/Lizenz.txt" ).getFileName() );

        System.out.println( Paths.get( ".", ".." ).toAbsolutePath() );
        System.out.println( Paths.get( ".", ".." ).normalize() );
        System.out.println( Paths.get( ".", ".." ).toAbsolutePath().normalize() );
    }

    private static void getFileSystemDemo() {
        // Beachte, in dieser Zeile wird eine Instanz des Referenztyps
        // 'FileSystem' mit dem Namen 'fileSystem' erstellt.
        // Die aufrufende Klasse 'FileSystems' (mit einem 's' am Ende) wird verwendet,
        // um die Standard-Dateisysteminstanz zu erhalten.
        FileSystem fileSystem = FileSystems.getDefault();
        Path path = fileSystem.getPath("C:", "dev", "java");
        System.out.println(path);
    }
}