import java.util.*;
public class arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

//        double[] arr; // declaring an array
//        arr = new double[10]; // allocating memory to the array

        String array[] = new String[100]; // done in a single step 

        //int age[] = {10,23,12,56}; // declaring and initializing in the same step - size as many elements

        int[] age = new int[5];
        age[0] = 20;                    // accessing elements using array indexes which start from 0 
        age[1] = 23;
        age[2] = 43;
        age[3] = 10;
        age[4] = 78;

        // arrays are fixed in size 

        // ArrayLists are somewhat like dynamic arrays but internally uses array only

        int[] arr = new int[5];
        System.out.println(arr); // prints the address of the array 
        System.out.println(arr.length); // number of elements in the array 

        // values by default, before being assigned are 0 in an array 
        // trying to access an array at an element position outside the bounds - array index out of bounds exception 

        // Enhanced for loop 
        for(int val: arr) { // here val is the element itself not index 
            System.out.println(val);
        }
        /*
        Two things that make enhanced for loop different from normal for loops 
        1. forward only (not backward)
        2. read only (no updation allowed)
        */

        int[] arr1 = arr;
        arr1[3] = 100;
        System.out.println(arr[3]); // gives 100 change happens - they both point to the same reference 
        // In java in general it is pass by value, but in case of arrays the reference is passed 

        // There is no concept of pointers, allocators in Java 
    }
}