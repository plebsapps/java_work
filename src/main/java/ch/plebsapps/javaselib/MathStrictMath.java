package ch.plebsapps.javaselib;


public class MathStrictMath {
    public static void main(String[] args) {
        //operationExact();
        //ceilFunktion();
        //expMath();
        //floorMath();
        //exponentMath();
        //hypotMath();
        //aHochb();
        //signumMath();
        winkelBerechnung();

    }

    private static void winkelBerechnung() {
        //WinkelBerechnung Grad
        System.out.println(Math.toDegrees(Math.PI *2));
        System.out.println(Math.toRadians(180));
    }

    private static void signumMath() {
        System.out.println(Math.signum(-15));
        System.out.println(Math.signum(13));
        System.out.println(Math.signum(0));
    }

    private static void aHochb() {
        System.out.println(Math.pow(2, 4));
    }

    private static void hypotMath() {

        //  sqrt(x2 + x2)
        System.out.println(Math.hypot(2, 2));

    }

    private static void exponentMath() {

        // In binärer Form ist 12.5 als 1100.1 dargestellt.
        // In der binären wissenschaftlichen Notation wäre das 1.1001 * 2^3. Der Exponent hier ist 3.
        // Daher ergibt Math.getExponent(12.5) den Wert 3.
        System.out.println(Math.getExponent(12.5));
    }

    private static void floorMath() {
        //  x / y
        System.out.println(Math.floorDiv(10, 3));
        // x % y
        System.out.println(Math.floorMod(10, 3));
    }

    private static void expMath() {
        //Euler´s number
        System.out.println(Math.exp(2));
        //Returns e°x -1
        System.out.println(Math.expm1(2));
    }

    private static void ceilFunktion() {
        System.out.println(Math.ceil(2.1455));
        System.out.println(Math.round(2.1455));
        System.out.println(Math.rint(2.1455));

    }

    private static void operationExact() {
        //Math.*Exact macht exception beim Überlauf von operationen
        Math.addExact(2_000_000_00,2_00_000_000);
        int a = 2_000_000_00 + 2_00_000_000;
        System.out.println(a);

        int b = Integer.MAX_VALUE;
        System.out.println(b);
    }
}
