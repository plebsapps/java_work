package ch.plebsapps.objectorientierung;

public class TestClass {
    public static void main(String[] args) {
        //castOperator
        //getClassTest();
        //getInstanOf();
        beispielGetWatt();
    }

    private static void beispielGetWatt() {
        Toaster t1 = new Toaster();
        t1.setWatt(100.);
        Geraete t2 = new Feuermelder();
        t2.setWatt(20.);

        System.out.println(Geraete.watt(t1,t2));
    }

    private static void getInstanOf() {
        Toaster t1 = new Toaster();
        Geraete t2 = new Toaster();
        Object t3 = new Geraete("Geraet");
        Geraete t4 = new Feuermelder();

        System.out.println(t1 instanceof Toaster);
        System.out.println(t2 instanceof Toaster);
        System.out.println(t2 instanceof Geraete);
        System.out.println(t3 instanceof Toaster);
        System.out.println(t3 instanceof Object);
        System.out.println(t4 instanceof Geraete);
    }

    public static void getClassTest() {
        Toaster t1 = new Toaster();
        Geraete t2 = new Toaster();
        Object t3 = new Geraete("Geraet");

        System.out.println(t1.getClass() == Toaster.class);
        System.out.println(t2.getClass() == Toaster.class);
        System.out.println(t3.getClass() == Toaster.class);
    }

    public static void castOperator() {
        Toaster t1 = new Toaster();
        Geraete t2 = new Toaster();
        Object t3 = new Toaster();

        System.out.println(t1.getToastscheiben());
        System.out.println(((Toaster) t2).getToastscheiben());
    }
}

class Geraete {
    private String name;
    private Double watt;

    public Double getWatt() {
        return watt;
    }

    public Geraete setWatt(Double watt) {
        this.watt = watt;
        return this;
    }

    public Geraete(String name) {
        this.name = name;
    }

    static double watt(Geraete... geraete) {
        double sum = 0;
        for (Geraete geraete1 : geraete) {
            sum += geraete1.watt;
        }
        return sum;
    }
}

class Feuermelder extends Geraete {
    public Feuermelder() {
        super("Feuermelder");
    }
}

class Toaster extends Geraete {
    private int toastscheiben = 2;

    public Toaster() {
        super("Toaster");
    }

    public int getToastscheiben() {
        return toastscheiben;
    }

    public Toaster setToastscheiben(int toastscheiben) {
        this.toastscheiben = toastscheiben;
        return this;
    }
}