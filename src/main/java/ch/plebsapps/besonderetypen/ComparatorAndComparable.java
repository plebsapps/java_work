package ch.plebsapps.besonderetypen;

import java.util.Comparator;

public class ComparatorAndComparable {
    public static void main(String[] args) {
        Freezer f1 = new Freezer();
        f1.capacity = 100;
        f1.watt = 120;

        Freezer f2 = new Freezer();
        f2.capacity = 100;
        f2.watt = 120;

        System.out.println(f1.equals(f2) + " " + (f1.hashCode() == f2.hashCode()));


        Comparator<Freezer2> wattComparator = new FWC();
        Comparator<Freezer2> capacityComparator = new FCC();
        Comparator<Freezer2> freezer =  wattComparator.thenComparing(capacityComparator);


    }
}
class Freezer implements Comparable<Freezer> {
    double watt;
    int capacity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Freezer freezer = (Freezer) o;

        if (Double.compare(freezer.watt, watt) != 0) return false;
        return capacity == freezer.capacity;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(watt);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + capacity;
        return result;
    }

    @Override
    public int compareTo(Freezer o) {
        return Double.compare(watt, o.watt);
    }
}
class Freezer2 implements Comparable<Freezer2> {
    double watt;
    int capacity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Freezer freezer = (Freezer) o;

        if (Double.compare(freezer.watt, watt) != 0) return false;
        return capacity == freezer.capacity;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(watt);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + capacity;
        return result;
    }

    @Override
    public int compareTo(Freezer2 o) {
        Comparator<Freezer2> freezer =  (new FWC()).thenComparing(new FCC());
        return freezer.compare(this, o);
    }
}
class FWC implements Comparator<Freezer2>{
    @Override
    public int compare(Freezer2 o1, Freezer2 o2) {
        return Double.compare(o1.watt, o2.watt);
    }
}

class FCC implements Comparator<Freezer2>{
    @Override
    public int compare(Freezer2 o1, Freezer2 o2) {
        return Integer.compare(o1.capacity, o2.capacity);
    }
}