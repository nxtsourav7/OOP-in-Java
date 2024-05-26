package Abstraction.Interfece;

class Rectangle implements Shape {
    private double length, width;

    // Constructor 
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}
