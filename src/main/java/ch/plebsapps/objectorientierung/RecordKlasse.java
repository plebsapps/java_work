package ch.plebsapps.objectorientierung;



public class RecordKlasse {
    public static void main(String[] args) {

        City city = new City("Marburg", 12256., 1000, new Location(1,2));
        System.out.println("1" + 2 + 3);



    }

}


record City(
        String name,
        double population,
        int area,
        Location location
) {

}

record Location(
        int x,
        int y
) {}



