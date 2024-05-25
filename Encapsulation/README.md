## What is Encapsulation?

Encapsulation is the process of packaging variables and methods into a single unit.

## How can we perform Encapsulation?

- Encapsulation can be achieved by declaring all the variables
in the class as private and writing public methods in the
class to set/modify and get the values of variables.

- It is more defined with the setter and getter methods.

## Advantages of Encapsulation

### Protect Your Data
With encapsulation, you can keep your data and code safe from external inheritance. For example, if any program runner tries to change the program, they can only interact with the getter and setter methods of the program. They will not have any idea to change any specific variable or data, which hinders the running of the program, resulting in high security.

### Easy to Test Code
The code which is encapsulated is simple to debug and easy to test for unit testing.

### Flexible
The encapsulated code is cleaner, flexible, and easy to change as per our needs. It means we can make the code read-only or write-only by using getter and setter methods. For example, if you don’t define the setter method in the class, the fields can be made read-only, whereas if you don’t define the getter method in the class, the fields can be made write-only.

### Easy to Reuse
Encapsulation enables you to easily change the methods, reuse the code, and implement new requirements in your program.
