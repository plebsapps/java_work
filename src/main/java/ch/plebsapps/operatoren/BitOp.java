package ch.plebsapps.operatoren;

import java.sql.SQLOutput;

public class BitOp {

    public static void main(String[] args) {

        int i = 7;
        String strI = Integer.toBinaryString(i);
        System.out.printf(String.format("%032d",Integer.valueOf(strI))+ "\n");
        System.out.println(Integer.toBinaryString(~i));

        //TODO

        /*
~	~a	Komplement
&	a & b	Und
|	a | b	Oder
^	a ^b	exklusives Oder
        */


        /*
a	7	0 0000000 00000000 00000000 00000111
b	6	0 0000000 00000000 00000000 00000110
result = a & b	6	0 0000000 00000000 00000000 00000110
         */

        /*
a	7	0 0000000 00000000 00000000 00000111
b	6	0 0000000 00000000 00000000 00000110
result = a | b	7	0 0000000 00000000 00000000 00000111
         */


        /*
<<	a << b	Wert des Ausdrucks sind die Bits von a die um b Positionen nach links verschoben wurden. Es wird mit 0 Bits aufgefüllt.
>>	a >> b	Wert des Ausdrucks sind die Bits von a  die um b Positionen nach rechts verschoben wurden. Es wird mit dem höchsten Bit aufgefüllt.
>>>	a >>> b	Wert des Ausdrucks sind die Bits von a die um b Positionen nach rechts verschoben wurden. Es wird mit dem "0" Bits aufgefüllt.
         */


    }
}
