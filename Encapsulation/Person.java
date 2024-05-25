package Encapsulation;

public class Person {
    private String name;
    private int weight;
    private double height;

    // Constractor
    Person (String n, int w, double h) {
        name = n;
        weight = w;
        height = h;
    }

    // Getter Method
    public String getName() {return name;}
    public int getWeight() {return weight;}
    public double getHeight() {return height;}

    // Setter Method
    public void setName(String n) {name = n;}
    public void setWeight(int w) {weight = w;}
    public void setHeight(double h) {height = h;}

    void BMI(int w, double h) {
        double bmi = w / (h*h);
        System.out.println("Name : " + name);
        System.out.println(String.format("BMI = %.4f", bmi));
        
        if(bmi < 18.5) System.out.println("You are Underweight !");
        else if(bmi < 25) System.out.println("You are Normal weight !");
        else if(bmi < 30) System.out.println("You are Overweight !");
        else System.out.println("You are Obesity !");
    }
}
