package Abstraction.Interfece;

public class Main {
    public static void main(String[] args) {
        // Calculate the area of Circle
        Circle c1 = new Circle(10);
        System.out.println(c1.calculateArea());

        // Calculate the area of Rectangle
        Rectangle r1 = new Rectangle(15, 10);
        System.out.println(r1.calculateArea());
    }
}
