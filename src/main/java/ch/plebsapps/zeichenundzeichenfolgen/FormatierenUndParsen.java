package ch.plebsapps.zeichenundzeichenfolgen;

import java.util.Formatter;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class FormatierenUndParsen {

    public static void main(String[] args) {
        //integerRadix();
        //integerTo();
        //stringFormatter();
        //stringJoiner();
        //stringTokenizer();
        scanner();
    }

    private static void scanner() {

        Scanner scanner = new Scanner("12 23 432 32");
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }

        Scanner scanner1 = new Scanner("12 23 s32 32");
        while (scanner1.hasNextInt()) {
            System.out.println(scanner1.nextInt());
        }
    }

    private static void stringTokenizer() {

        StringTokenizer stringTok = new StringTokenizer("<TAG></TAG>", "<>");
        while (stringTok.hasMoreTokens()){
            System.out.println(stringTok.nextToken());
        }

        int sum = 0;
        StringTokenizer stringTok2 = new StringTokenizer("10 1101 11");
        while (stringTok2.hasMoreTokens()){
            String number = stringTok2.nextToken();
            sum += Integer.parseInt(number, 2);
        }
        System.out.println(sum);
    }

    private static void stringJoiner() {

        StringJoiner joiner = new StringJoiner(".", "[", "]");
    }

    private static void stringFormatter() {

        Formatter format = new Formatter();
        System.out.println(format.format("|%-10.5S|", "Inhalt"));
    }

    private static void integerTo() {

        System.out.println(Integer.toBinaryString(17));
        System.out.println(Integer.toHexString(17));
        System.out.println(Integer.toOctalString(17));
    }

    private static void IntegerRadix() {

        System.out.println(Integer.toString(106));
        System.out.println(Integer.toString(106, 2));
        System.out.println(Integer.toString(106, 16));
    }
}