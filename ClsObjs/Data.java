package ClsObjs;
/*
Access Modifiers/ Visibility Modifiers - public, private, protected
Used to set the accessibility and visibility of the classes, interfaces, variables, methods,
constructors, data members etc.
public method - can be accessed by other classes - visible everywhere
private method - cannot be accessed by other classes - within the class only
                   a property you want to put restriction on
protected - visible within the package or all sub-classes
                    Pillars of OOPs (Inheritance)

Note. by default the modifier on a class/ variable is public
 */
public class Data {
    private String name;

    /*
    this keyword
    used to refer to the current object inside a method or a constructor
     */
    //getter
    public String getName() {
        return this.name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    /*
    getter-setter methods give you the accessibility to change the values inside the private variables
     */
}
