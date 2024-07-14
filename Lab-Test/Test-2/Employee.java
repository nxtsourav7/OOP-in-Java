package Lab_Test.Test_2;

public class Employee extends Person {
    double salary;
    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    public void print() {
        super.print();
        System.out.println("Salary : " + salary);
    }
}
