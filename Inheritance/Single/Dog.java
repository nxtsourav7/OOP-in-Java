package Inheritance.Single;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name); // Call the constructor of the superclass (Animal)
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
