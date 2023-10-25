package ch.plebsapps.objectorientierung;

public class RecordKlasse {
    public static void main(String[] args) {
        City city = new City("Marburg", 12256., 1000, new Location(1, 2));
        System.out.println("1" + 2 + 3);
    }
}

record City(
        String name,
        double population,
        int area,
        Location location
) {
    // Nothing
}

record Location(
        int x,
        int y
) {
}

record Person1(String name, int age) {
    //Dieser explizit hingeschriebene Konstruktor wird normalerweise implizit von Compiler erstellt
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}