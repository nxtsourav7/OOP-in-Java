package Inheritance.Multilevel;

public class Dog extends Mammal {
    private String breed;

    public Dog(String name, boolean hasFur, String breed) {
        super(name, hasFur); // Call the constructor of the superclass (Mammal)
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }

    @Override
    public void eat() {
        System.out.println(name + " the " + breed + " is eating.");
    }
}
