## Rules of Method Overriding in Java

1. Method name, signature type, and parameter must be the same:

2. If a method can’t be inherited, then it can’t be overridden:

3. Final/static methods can’t be overridden:


4. Constructor can’t be overridden:

## Method Overloading vs Method Overriding

| **Feature**                         | **Method Overloading**            | **Method Overriding**             |
|-------------------------------------|-----------------------------------|-----------------------------------|
| **Parameter**                       | Must be different                 | Must be the same                  |
| **Occurrence**                      | Within the same class             | Between two classes (subclass and superclass) |
| **Inheritance**                     | Not involved                      | Must be involved                  |
| **Return Type**                     | May or may not be the same        | Must be the same                  |
| **Method Hiding**                   | One method doesn’t hide another   | Child methods hide parent method  |
| **Polymorphism**                    | Compile-time Polymorphism         | Runtime Polymorphism              |
