package ch.plebsapps.objectorientierung;

public class ProduktionDate {
    DayOfWeek day;

    public ProduktionDate setDay(DayOfWeek day) {
        this.day = day;
        return this;
    }

    public DayOfWeek getDay() {
        return day;
    }



    int year;
    int month;

    public int year() {
        return year;
    }

    public ProduktionDate year(int year) {
        this.year = year;
        return this;
    }

    public enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public int month() {
        return month;
    }

    public ProduktionDate month(int month) {
        this.month = month;
        return this;
    }

    public String toString(){
        return  "ProduktionDate{" +
                "year = \"" + this.year + "\"" +
                ", month = \"" + this.month + "\"" +
                "}";
    }
}