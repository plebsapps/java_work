package ch.plebsapps.zeichenundzeichenfolgen;

public class KlasseStringBuilder {

    public static void main(String[] args) {

        //sbAppend();
        //sbDelete();
        //sbInsert();
        //sbReplace();
        //sbAppendAppend();
        sbKapazität();
        //sbKapazitätAtStart();
        //sbKapazitätTrim();
    }

    private static void sbKapazitätTrim() {
        StringBuilder sb = new StringBuilder(1024);

        sb.append("1234567890");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }

    private static void sbKapazitätAtStart() {
        StringBuilder sb = new StringBuilder(1024);

        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("1234567890");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append(123456789012345L);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }

    private static void sbKapazität() {
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("1234567890");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append(123456789012345L);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append(123456789012345L);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }

    private static void sbAppendAppend() {
        StringBuilder sb = new StringBuilder("Hallo");

        System.out.println(sb.append(123).append("welt"));
    }

    private static void sbReplace() {
        StringBuilder sb = new StringBuilder("Hallo");
        System.out.println(sb.replace(2,4, "oo"));
    }

    private static void sbInsert() {
        StringBuilder sb = new StringBuilder("Hallo");
        System.out.println(sb.insert(2,2));
    }

    private static void sbDelete() {
        StringBuilder sb = new StringBuilder("Hallo");

        System.out.println(sb.delete(2,4));
        System.out.println(sb.deleteCharAt(2));
    }

    private static void sbAppend() {
        StringBuilder sb = new StringBuilder("Hallo");

        System.out.println(sb.append(1.45));
        System.out.println(sb.append(true));

        char[] c = {'1','2','3','4','5'};
        System.out.println(sb.append(c, 1,2));
    }
}