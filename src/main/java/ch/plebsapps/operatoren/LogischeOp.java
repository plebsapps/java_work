package ch.plebsapps.operatoren;


public class LogischeOp {
    public static void main(String[] args) {

        boolean a = true, b = false;

        System.out.println("Negation !");
        // Logische Operatoren Negation
        //!  !a	Negation
        System.out.println("a = true  -> !a = " + !a);
        System.out.println("b = false -> !b = " + !b);

        //Logische Operatoren UND
        //&	a & b	Und
        System.out.println("\nUND &");

        a = true;
        b = true;
        System.out.println("true & true = " + (a & b) );

        a = true;
        b = false;
        System.out.println("true & false = " + (a & b) );

        a = false;
        b = true;
        System.out.println("false & true = " + (a & b) );

        a = false;
        b = false;
        System.out.println("false & false = " + (a & b) );

        //Logische Operatoren Oder
        //|	a | b	Oder (inklusiv)
        System.out.println("\nODER |");

        a = true;
        b = true;
        System.out.println("true | true = " + (a | b) );

        a = true;
        b = false;
        System.out.println("true | false = " + (a | b) );

        a = false;
        b = true;
        System.out.println("false | true = " + (a | b) );

        a = false;
        b = false;
        System.out.println("false | false = " + (a | b) );

        //Logische Operatoren Entweder-Oder (XOR)
        //^	a ^ b	Entweder-Oder)
        System.out.println("\nXOR ^");

        a = true;
        b = true;
        System.out.println("true ^ true = " + (a ^ b) );

        a = true;
        b = false;
        System.out.println("true ^ false = " + (a ^ b) );

        a = false;
        b = true;
        System.out.println("false ^ true = " + (a ^ b) );

        a = false;
        b = false;
        System.out.println("false ^ false = " + (a ^ b) );


        //Logische Operatoren UND bedingt
        //&&	a && b	bedingt auswertendes Und
        System.out.println("\na && b bedingt auswertendes UND");

        a = true;
        b = true;
        System.out.println("true && true = " + (bed(a, 'a') && bed(b, 'b')) );

        a = true;
        b = false;
        System.out.println("true && false = " + (bed(a, 'a') && bed(b, 'b')) );

        a = false;
        b = true;
        System.out.println("false && true = " + (bed(a, 'a') && bed(b, 'b')) );

        a = false;
        b = false;
        System.out.println("false && false = " + (bed(a, 'a') && bed(b, 'b')) );


        //Logische Operatoren ODER bedingt
        //||	a || b	bedingt auswertendes ODER
        System.out.println("\na || b bedingt auswertendes ODER");

        a = true;
        b = true;
        System.out.println("true || true = " + (bed(a, 'a') || bed(b, 'b')) );

        a = true;
        b = false;
        System.out.println("true || false = " + (bed(a, 'a') || bed(b, 'b')) );

        a = false;
        b = true;
        System.out.println("false || true = " + (bed(a, 'a') || bed(b, 'b')) );

        a = false;
        b = false;
        System.out.println("false || false = " + (bed(a, 'a') || bed(b, 'b')) );
    }

    public static boolean bed(boolean ret, char va){
        System.out.println(va + "=" + ret);
        return ret;
    }
}