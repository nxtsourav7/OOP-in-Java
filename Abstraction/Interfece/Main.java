public class Main {
    public static void main(String[] args) {
        // Calculate the area of Circle
        Shape c1 = new Circle(10);
        System.out.println("Area of Circle : " + c1.calculateArea());

        // Calculate the area of Rectangle
        Shape r1 = new Rectangle(15, 10);
        System.out.println("Area of Rectangle : " + r1.calculateArea());
    }
}
