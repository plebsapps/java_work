package ch.plebsapps.reflection;

/**
 * Lernziel: Annotationen auslesen
 * TODO - Zusammenhang der Typen
 *
 * TODO VIDEO 152
 *
 * TODO https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/reflect/package-summary.html
 */
public class ReadAnnotations {
    public static void main( String[] args ) {
        Deprecated annotation = Tree.class.getAnnotation( Deprecated.class );
        System.out.println( annotation.forRemoval() );
        System.out.println( annotation.since() );
    }

    public @Override String toString() {
        return super.toString();
    }
}

@Deprecated//( since = "version 2.9", forRemoval = true )
class Tree {

}