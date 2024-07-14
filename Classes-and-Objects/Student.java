public class Student {
    String name;
    int id;
    String section;
    // default constructor !!
    Student() {
        System.out.println("Default Constructor !!");
    }
    // parameterized constructor
    Student(String name, int id, String section) {
        System.out.println("Parameterized Constructor !!");
        this.name = name;
        this.id = id;
        this.section = section;
    }
    void print() {
        System.out.println("----------------------");
        System.out.println("Name: "+name+ "\nID: "+id+"\nSection: "+section );
        System.out.println("----------------------");
    }
}