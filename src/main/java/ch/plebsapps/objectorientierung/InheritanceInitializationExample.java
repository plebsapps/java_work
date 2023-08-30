package ch.plebsapps.objectorientierung;


public class InheritanceInitializationExample {
    public static void main(String[] args) {
        Derived derivedObj = new Derived();

        Base base = new Base();
    }
}

class Base {
    Base() {
        System.out.println("Base Konstruktor");
    }

    {
        System.out.println("Base Initialisierungsblock");
    }
}

class Derived extends Base {
    Derived() {
        System.out.println("Derived Konstruktor");
    }

    {
        System.out.println("Derived Initialisierungsblock");
    }
}