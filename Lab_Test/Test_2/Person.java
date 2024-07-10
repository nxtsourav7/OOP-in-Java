package Lab_Test.Test_2;

public class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void print() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
