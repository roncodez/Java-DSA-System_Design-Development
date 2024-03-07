/*
    Some disadvantages/ constraints of Arrays before we see what is ArrayList or why did its use come up?
    1. fixed size
    2. mention size in the start (no dynamicness)
    3. all elements of the same type only

    ArrayList allows us to create dynamic arrays, resizable arrays
    Syntax: ArrayList<DataType> arraylistname = new ArrayList<>();

    add, get, set(replacement), size, remove - functions
 */
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        ArrayList<String> languages = new ArrayList<>();

        // Note. While creating an arraylist we cannot use the primitive datatype, instead we have to use the corresponding wrapper class

        //add elements
        languages.add("Java"); // just add - adds to the end
        languages.add("JavaScript");
        languages.add("Swift");

        // to view
        System.out.println(languages);

        // to access a particular element we use the indexing concept within the get function
        String str = languages.get(1);
        System.out.println(str);

        // to modify - we use the set method
        languages.set(1, "C++"); // index with the value to be replaced
        System.out.println(languages);

        // to check the size
        // to remove an element
        System.out.println(languages.size());
        languages.remove(2); // this will remove swift
        System.out.println(languages.size());

        // for iterating we can use the for-each/ enhanced-for loop
        languages.add(2, "New language"); // overloaded function
        System.out.println(languages); // adds at a particular index and shifts the rest as required

        // How does this internally happen in an array - multiplication factor on every addition, some times 1.5 or 2
        // doubles the size and so on...
    }
}
