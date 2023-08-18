package ch.plebsapps.operatoren;

public class KonkatenationOp {

    public static void main(String[] args) {

        //Unproblematisch
        System.out.println(1 + "2" + 3);   // Ausgabe  123

        //PROBLEM bei Ausgabe es wird erst eine Addition ausgeführt dan erst wird der String Zusammengefügt
        System.out.println(1 + 2 + "3");   // Ausgabe  33

        //Falls das 2 und 3 Element als String aus gegeben werde, soll unproblematisch
        System.out.println("1" + 2 + 3);   // Ausgabe  123

        //Falls das 2 und 3 Element addiert werden soll müssen das 2 und 3 Element geklammert werden
        System.out.println("1" + (2 + 3)); // Ausgabe  15
    }
}
