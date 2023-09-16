package ch.plebsapps.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamBeispiel {

    public static void main(String[] args) {
        //beispielLamdaVerkuerzung();
        beispielFilterKunde();



    }

    private static void beispielFilterKunde() {

        List<Kunde> kundenList = Arrays.asList(
           new Kunde(1,22,"Maria","Uchana"),
           new Kunde(2,24,"Herbert","Miller"),
           new Kunde(3,26,"Stefan","Heinzel"),
           new Kunde(4,32,"Frank","Kleinmann")
        );

        //Alter größer 25 und Name = Stefan
        kundenList.stream().filter(p->p.getAlter()>25 && "Stefan".equals(p.getVorname())).forEach(System.out::println);

        //Kunde mid der Id = 1
        kundenList.stream().filter(p->p.getId()==1).forEach(System.out::println);

        //Filter + Filter  - Kunde Alter >= 23 und id < 6
        kundenList.stream().filter(p->p.getAlter()>=23).filter(p->p.getId()<6).forEach(System.out::println);

        //Anzahl Kunden (Könnte man auch einfacher machen)
        System.out.println(kundenList.stream().count());

        //KundenListe ist Leer
        System.out.println(kundenList.isEmpty());
    }

    private static void beispielLamdaVerkuerzung() {
        List<String> list = Arrays.asList("Peter", "Hans", "Rudolf", "Werner");

        list.stream().filter(
                new Predicate<String>() {
                    @Override public boolean test(String s) {
                        return !"Hans".equals(s);
                    }
                }).forEach(System.out::println);

        // Dieses ist die verkürzte schreibweise des Ausdrucks.
        list.stream().filter((s) -> !"Hans".equals(s)).forEach(System.out::println);
    }
}

class Kunde {
    private Integer id;
    private Integer alter;
    private String vorname;
    private String nachname;



    public Kunde(Integer id, Integer alter, String vorname, String nachname) {
        this.id = id;
        this.alter = alter;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Integer getId() {
        return id;
    }

    public Kunde setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getAlter() {
        return alter;
    }

    public Kunde setAlter(Integer alter) {
        this.alter = alter;
        return this;
    }

    public String getVorname() {
        return vorname;
    }

    public Kunde setVorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    public String getNachname() {
        return nachname;
    }

    public Kunde setNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "id=" + id +
                ", alter=" + alter +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }
}
