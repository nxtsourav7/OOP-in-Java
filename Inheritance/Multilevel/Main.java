package Inheritance.Multilevel;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", true, "Golden Retriever");
        dog.eat();                  // Buddy the Golden Retriever is eating.
        dog.sleep();                // Buddy is sleeping.
        dog.bark();                 // Buddy is barking.
        dog.displayCharacteristics(); // Buddy is a mammal. Fur: true
    }
}
