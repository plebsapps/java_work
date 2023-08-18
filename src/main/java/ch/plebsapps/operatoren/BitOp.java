package ch.plebsapps.operatoren;


public class BitOp {

    public static void main(String[] args) {

        int a = 0b101010;
        int b = 0b110101;

        //Anzeigen Binär von Logisch Komplementär
        System.out.println("\n\n~a Komplementär ");
        System.out.println("    a = " + format(a));
        System.out.println("   ~a = "+ format(~a));

        //Anzeigen Binär von Logisch UND &
        System.out.println("\na  UND  b");
        System.out.println("    a = " + format(a) );
        System.out.println("    b = " + format(b) );
        System.out.println("a & b = " + format(a & b) );

        //Anzeigen Binär von Logisch ODER |
        System.out.println("\na  ODER  b");
        System.out.println("    a = " + format(a) );
        System.out.println("    b = " + format(b) );
        System.out.println("a | b = " + format(a | b) );

        //Anzeigen Binär von Logisch XOR |
        System.out.println("\na  XOR  b");
        System.out.println("    a = " + format(a) );
        System.out.println("    b = " + format(b) );
        System.out.println("a ^ b = " + format(a ^ b) );


        a  = -8;
        b = 1;

        //Linksverschiebung mit Vorzeichen  <<
        System.out.println("\na  <<  b");
        System.out.println("     a = " + format(a) + " " + a  );
        System.out.println("     b = " + b );
        System.out.println("a << b = " + format(a << b) + " " + (a << b)  );

        b = 29;

        //Linksverschiebung mit Vorzeichen  <<
        System.out.println("\na  <<  b");
        System.out.println("     a = " + format(a) + " " + a  );
        System.out.println("     b = " + b );
        System.out.println("a << b = " + format(a << b) + " " + (a << b) + " <- ACHTUNG es wird aus dem Binär herausgeschoben" );

        a = -8;
        b = 2;

        //Rechtsverschiebung mit Vorzeichen  >>
        System.out.println("\na  >>  b  links shift");
        System.out.println("     a = " + format(a) + " " + a );
        System.out.println("     b = " + b );
        System.out.println("a >> b = " + format(a >> b) + " " + (a >> b));

        a = 8;
        b = 2;

        //Rechtsverschiebung mit Vorzeichen  >>
        System.out.println("\na  >>  b  links shift");
        System.out.println("     a = " + format(a) + " " + a );
        System.out.println("     b = " + b );
        System.out.println("a >> b = " + format(a >> b) + " " + (a >> b));

        b = 10;

        //Rechtsverschiebung mit Vorzeichen  >>
        System.out.println("\na  >>  b  rechts shift");
        System.out.println("     a = " + format(a) + " " + a);
        System.out.println("     b = " + b );
        System.out.println("a >> b = " + format(a >> b) + " " + (a >> b) + " <- ACHTUNG es wird aus dem Binär herausgeschoben" );

        a = -1;
        b = 1;

        //Logische Rechtsverschiebung  >>>
        System.out.println("\na  >>>  b  Logische Rechtsverschiebung ");
        System.out.println("     a = " + format(a) + " " + a );
        System.out.println("     b = " + b );
        System.out.println("a >>> b = " + format(a >>> b) + " " + (a >>> b) + " <- ACHTUNG es ändert sich das Vorzeichen LOGISCH");

        a = -8;
        b = 2;

        //Logische Rechtsverschiebung  >>>
        System.out.println("\na  >>>  b  Logische Rechtsverschiebung ");
        System.out.println("     a = " + format(a) + " " + a );
        System.out.println("     b = " + b );
        System.out.println("a >>> b = " + format(a >>> b) + " " + (a >>> b) + " <- ACHTUNG es wird aus dem Binär herausgeschoben" );

    }

    //Zeigt Integer als Binäre zahl mit führenden Nullen
    public static String format(int a){
        return String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0' );
    }
}