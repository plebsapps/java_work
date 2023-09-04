package ch.plebsapps.objectorientierung;

public class AbstrakteKlasse {
    public static void main(String[] args) {
        Fahrzeug fahrzeug = Math.random() > 0.5 ? new Auto() : new Fahrrad();
        System.out.println(fahrzeug.getTyp());
    }
}

abstract class Fahrzeug {
    enum Typ {MOTOR, KRAFT}

    abstract Typ getTyp();
}

class Auto extends Fahrzeug {
    @Override
    Typ getTyp() {
        return Typ.MOTOR;
    }
}
class Fahrrad extends Fahrzeug {
    @Override
    Typ getTyp() {
        return Typ.KRAFT;
    }
}