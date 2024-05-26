package Inheritance.Multilevel;

public class Mammal extends Animal {
    private boolean hasFur;

    public Mammal(String name, boolean hasFur) {
        super(name); // Call the constructor of the superclass (Animal)
        this.hasFur = hasFur;
    }

    public void displayCharacteristics() {
        System.out.println(name + " is a mammal. Fur: " + hasFur);
    }
}
