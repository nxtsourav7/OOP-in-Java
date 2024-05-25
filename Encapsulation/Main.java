package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Sourav", 48, 1.68);
        Person p2 = new Person("Arko", 50, 1.60);
        p1.BMI(p1.getWeight(), p1.getHeight());
        p2.BMI(p2.getWeight(), p2.getHeight());
    }
}
