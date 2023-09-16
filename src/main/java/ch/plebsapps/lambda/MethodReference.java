package ch.plebsapps.lambda;

public class MethodReference {

    // Supplier = jemand der etwas LIEFERT
    interface LongSupplier {
        long get();
    }

    // Consumer = jemand der etwas ANNIMMT!
    interface LongConsumer {
        void apply (long value);
    }

    interface  EqualsPredicate {
        boolean test(Object o1,Object o2);
    }

    static void foo(LongSupplier longSupplier) {
        // Greifen Sie auf den Wert zu, den LongSupplier liefert, und verwenden Sie ihn hier
        long value = longSupplier.get();
        System.out.println("Value: " + value);
    }
    static void bar(LongConsumer longConsumer) {}
    static void baz(EqualsPredicate equalsPredicate) {}

    public static void main(String[] args) {
        //Option 1
        foo(() -> System.currentTimeMillis());
        foo(System::currentTimeMillis);

        //Option 2
        bar(value -> System.out.println(value));
        bar(System.out::println);
        bar(System.err::println);

        //Option3
        baz( ( o1, o2) -> o1.equals(o2) );
        baz(Object::equals);

        verwendungDesSupplier1();
        verwendungDesSupplier2();
    }

    private static void verwendungDesSupplier1() {
        //Verwendung ????
        LongSupplier longSupplier = () -> 42l;
        foo(longSupplier);
    }

    private static void verwendungDesSupplier2() {
        // Definieren Sie eine Implementierung von LongSupplier, die die Summe von zwei Zahlen liefert
        LongSupplier longSupplier2 = () -> {
            long a = 10L;
            long b = 20L;
            return a + b;
        };

        long value = longSupplier2.get();
        System.out.println("Value: " + value);
    }

    //TODO die verwendung von dieser MethodReference ist mir noch nicht ganz klar
}
