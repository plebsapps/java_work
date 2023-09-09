package ch.plebsapps.ausnahmen;

public class ThrowNewException {
    public static void main(String[] args) {
        //printSqrt(-1223.8);

        /*
        try {
            printFileSize("");
        } catch (IllegalArgumentException e){
            System.out.println("Fehler!");
        }
        */
        printSqrtWith(-1);
    }

    private static void printSqrtWith(double d) {
        if (d < 0){
            throw new IllegalArgumentException("Die Zahl war Negativ muss aber 0 oder Positiv sein!");
        }
        System.out.println(Math.sqrt(d));
    }


    private static void printFileSize(String fileName) throws  IllegalArgumentException{
        if (fileName.isEmpty()){
            throw new IllegalArgumentException();
        }
        //Mache hier etwas
    }

    private static void printSqrt(double d) {
        if (d < 0){
            throw new IllegalArgumentException();
        }
        System.out.println(Math.sqrt(d));
    }

    //TODO VIDEO 75 ab Minute 21:xx

}