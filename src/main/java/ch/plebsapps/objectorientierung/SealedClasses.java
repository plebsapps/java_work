package ch.plebsapps.objectorientierung;

public class SealedClasses {
    public static void main(String[] args) {


        Class<? extends Shape1> shapeClass = Circle1.class;

    }
}


sealed class Shape1 permits Circle1, Rectangle1 {
    // Klasseninhalt
}

final class Circle1 extends Shape1 {
    // Klasseninhalt
}

non-sealed class Rectangle1 extends Shape1 {
    // Klasseninhalt
}


