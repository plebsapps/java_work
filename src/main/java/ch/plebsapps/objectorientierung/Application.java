package ch.plebsapps.objectorientierung;

public class Application {

    public static void main(String[] args) {
        ProduktionDate pd = new ProduktionDate()
                .year(1988)
                .month(10);

        System.out.println(pd);
        System.out.println(Geschlecht.SACHLICH);

        Student studi = new Student();

    }
}
