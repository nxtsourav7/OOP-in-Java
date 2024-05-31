package Polymorphism.Method_Overloading;

public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        System.out.println(c1.add(8, 10));
        System.out.println(c1.add(5, 10, 15));
    }
}
