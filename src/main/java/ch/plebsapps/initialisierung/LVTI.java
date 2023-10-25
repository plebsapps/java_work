package ch.plebsapps.initialisierung;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LVTI {
    public static void main(String[] args) {
        stringBeispiel();
        classBeispiel();
        methodenBeispiel();
        forBeispiel();
    }

    private static void forBeispiel() {
        List<SomeClassWithVeryLongName> myList = new ArrayList<>();

        //Old way
        for (SomeClassWithVeryLongName elem : myList){
           //do something
        }

        //New way
        for(var elem : myList){
            //do something
        }
    }

    private static void methodenBeispiel() {
        //Old way
        LinkedList<String> cList = SomeClassWithVeryLongName.getNewList();

        //New way
        //Wenn man mit dem Mauszeiger über eine Variable in IntelliJ fährt, wird der Typ der Variable angezeigt.
        var cList1 = SomeClassWithVeryLongName.getNewList();

    }

    private static void classBeispiel() {
        //Old way
        SomeClassWithVeryLongName myInstand = new SomeClassWithVeryLongName();

        //New way
        var myInst = new SomeClassWithVeryLongName();
    }

    private static void stringBeispiel() {

        //Old way
        String name = "Max Müller";

        //New way
        var name2 = "Maxi Müller";
    }
}

class SomeClassWithVeryLongName {
    public static LinkedList<String> getNewList(){
        return new LinkedList<String>();
    }
}