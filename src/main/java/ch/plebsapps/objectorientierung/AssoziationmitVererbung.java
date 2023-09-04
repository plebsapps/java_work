package ch.plebsapps.objectorientierung;

public class AssoziationmitVererbung {
    public static void main(String[] args) {
        Studente student = new Studente("Alice", 12345);

        // Die Unterklasse "Student" hat eine Assoziation zur Oberklasse "Person",
        // da sie von "Person" erbt und die "name"-Eigenschaft von "Person" nutzt.
        System.out.println("Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
    }
}

// Oberklasse (Superklasse)
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Unterklasse (Subklasse) mit einer Assoziation zur Oberklasse
class Studente extends Person {
    private int studentId;

    public Studente(String name, int studentId) {
        super(name); // Aufruf des Konstruktors der Oberklasse
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }
}