package ch.plebsapps.objectorientierung;

public class Liskovsche {
        public static void main(String[] args) {
            Shape shape1 = new Circle();
            Shape shape2 = new Square();
            Shape shape3 = new Shape();

            shape1.draw(); // Zeichne einen Kreis
            shape2.draw(); // Zeichne ein Quadrat
            shape3.draw();
        }
}

class Shape {
    public void draw() {
        System.out.println("Zeichne eine Form");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Zeichne einen Kreis");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Zeichne ein Quadrat");
    }
}
