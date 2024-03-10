package ClsObjs;
/*
Object Oriented Programming Paradigm OOPs
goal - break complex problems into smaller objects
class - blueprint/ prototype
identical copies/ instances of a class - objects
 */
public class Lamp {
    boolean isOn;

    /*
    Constructor is a function that is invoked when an object of a class is created
    it has the same name as that of the class and no return type
    There are 3 types of constructors:-
    1. No- argument constructor - has no arguments/ parameters
    2. Parameterized constructor - has an argument/ parameter
    3. Default constructor - In the absence of a manual creation of a constructor, Java compiler
    automatically creates a constructor - called as a default constructor.
    Constructor overloading - is having multiple constructors with the same name but difference in parameters

     */
    Lamp() {
        System.out.println("Welcome to class Lamp");
    }
    void turnOn() {
        System.out.println("Light is turned On!");
    }

    void turnOff() {
        System.out.println("Light is turned Off!");
    }
}
