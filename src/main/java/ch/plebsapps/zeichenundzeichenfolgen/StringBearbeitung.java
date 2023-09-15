package ch.plebsapps.zeichenundzeichenfolgen;

public class StringBearbeitung {
    public static void main(String[] args) {
        // tringLaenge();
        // stringZeichenBei();
        // stringSplit();
        // subString();
        // stringSearch();
        // strContainsAndOther();
        // strRepeat();

    }

    private static void strRepeat() {
        String strRepeat = "-*- ";
        System.out.println(strRepeat.repeat(10));
    }

    private static void strContainsAndOther() {
        String strSearchInside = "Hier ist ein . und noch ein . in dem String .";
        System.out.println(strSearchInside.contains("."));

        int count =  strSearchInside.replaceAll("\\.", "").length();

        System.out.println(strSearchInside.replaceAll("\\.", ""));
        System.out.println("Es sind " + count + " \".\" vorhanden");

        // Hiermit entfernt man Doppelte Leerzeichen in einen String
        System.out.println(strSearchInside.replaceAll("\\.", "").replaceAll(" {2}", " ") );

        System.out.println(strSearchInside.replaceAll("\\.", "").replaceAll(" {2}", " ").replace(" ", "*") );
    }

    private static void stringSearch() {
        String strSearchInside = "Hier ist ein . und noch ein . in dem String .";

        System.out.println(strSearchInside.lastIndexOf("."));
        System.out.println(strSearchInside.lastIndexOf(".",28));


        System.out.println(strSearchInside.indexOf("."));
        System.out.println(strSearchInside.indexOf(".",14));

    }

    private static void subString() {
        String subString = "hallo Sub du String";
        System.out.println(subString.substring(6,9));
        System.out.println(subString.substring(5));
    }

    private static void stringSplit() {
        String strSplit = "Hallo Welt das ist aber schön ";
        String[] parts = strSplit.split(" ");

        for (String part : parts) {
            System.out.println("-" + part + "-");
        }


    }

    private static void stringZeichenBei() {

        String strCharAt = "Hallo . Juah";
        System.out.println(strCharAt.charAt(1));

        char[] charArray = new char[6];
        strCharAt.getChars(1, 5, charArray, 1 );
        System.out.println(charArray);
    }

    private static void stringLaenge() {

        String strLaengeNull = null;
        String strLaenge0  = "";
        String strLaenge10 = "Hallo welt";
        String strLines = "Hallo\ndas";

        //System.out.println(strLaengeNull.length()); //NullPointException
        System.out.println(strLaenge0.length());
        System.out.println(strLaenge10.length());
        System.out.println(strLines.length());
    }

}
