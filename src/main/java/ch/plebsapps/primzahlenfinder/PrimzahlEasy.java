package ch.plebsapps.primzahlenfinder;

public class PrimzahlEasy {

    public static void main(String[] args) {

        int b1 = 0b10101010;
        int b2 = 0b11010100;

        System.out.println(b1);

        System.out.println(Integer.toBinaryString(b1));
        System.out.println(Integer.toBinaryString(b2));

        System.out.println(Integer.toBinaryString(~b1));

        System.out.println(Integer.toBinaryString(b1 & b2));
        System.out.println(Integer.toBinaryString(b1 | b2));
        System.out.println(" " + Integer.toBinaryString(b1 ^ b2));




    }


}
