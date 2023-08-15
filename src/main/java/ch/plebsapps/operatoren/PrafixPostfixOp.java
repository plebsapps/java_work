package ch.plebsapps.operatoren;

public class PrafixPostfixOp {

    public static void main(String[] args) {


        //TODO
        int i = 3;
        i++;                      //Postfix

        System.out.println(i);    // "4"

        ++i;                      //Prefix
        System.out.println(i);
        System.out.println(++i);  //Prefix      -> i=i+1; System.out.println(i);
        System.out.println(i++);  //Postfix     -> System.out.println; i=i+1;
        System.out.println(i);
    }
}
