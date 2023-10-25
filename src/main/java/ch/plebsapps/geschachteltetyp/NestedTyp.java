package ch.plebsapps.geschachteltetyp;

public class NestedTyp {
    public static void main(String[] args) {

        // Statisch geschachtelter Type
        class Out {
            static class In{}
        }

        // Innere Mitgliedsklasse
        class Out1 {
            class In1{}
        }

        // Lokaler (innere) Klasse
        class Out2 {
            // im Konstruktor der Klasse Out2
            Out2(){
                class In2 {}
            }
        }

        //Anonyme inner Klassen
        class Out4 {
            Out4() {
                Runnable r = new Runnable() {
                    @Override
                    public void run() {}
                };
            }
        }
    }

    enum Color {
        // Diese wäre ein geschachtelter Typ
        ROT, GELB, BLAU
    }
}

class A {
    //Diese Klasse ist Parketsichtbar. Also kann jede klasse in Parket ch.plebsapps.geschachteltetyp diese klasse verwenden.

    //In diesen Parked geht nicht interface A
}