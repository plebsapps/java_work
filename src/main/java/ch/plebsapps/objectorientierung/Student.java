package ch.plebsapps.objectorientierung;

public class Student {
    private String name;
    private int age;
    private String address;

    public Geschlecht getGeschlecht() {
        return geschlecht;
    }

    public Student setGeschlecht(Geschlecht geschlecht) {
        this.geschlecht = geschlecht;
        return this;
    }


    private Geschlecht geschlecht;

    public Student name(String name) {
        this.name = name;
        return this;
    }

    public Student age(int age) {
        this.age = age;
        return this;
    }

    public Student address(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", geschlecht=" + geschlecht +
                '}';
    }
}