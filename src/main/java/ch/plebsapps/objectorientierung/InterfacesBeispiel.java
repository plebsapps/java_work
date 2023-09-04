package ch.plebsapps.objectorientierung;

public class InterfacesBeispiel {
    public static void main(String[] args) {
        Circle2 circle2 = new Circle2();
        circle2.isBig();
    }
}

interface HasArea{
    double area();
    default boolean isBig(){
        return area() > 1000;
    }

}

interface HasPerimeter {
    double perimeter();
}

interface HasPerimeterArea extends HasArea, HasPerimeter{

}

class BaseCoordinates {
    double x,y;
}

class Circle2 extends BaseCoordinates implements HasArea, HasPerimeter {
    private double radius;

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}


class Circel3 extends BaseCoordinates implements HasPerimeterArea{
    private double radius;

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}