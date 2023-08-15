package ch.plebsapps.operatoren;

public class KonkatenationOp {

    public static void main(String[] args) {

        System.out.println(1 + "2" + 3);   // Ausgabe  123
        System.out.println(1 + 2 + "3");   // Ausgabe  33
        System.out.println("1" + 2 + 3);   // Ausgabe  123
        System.out.println("1" + (2 + 3)); // Ausgabe  15
    }
}
