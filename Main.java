// hello world, basic input output, if-else conditionals, loops, functions
import java.util.*;

class Main {
    public static int multiply(int n1, int n2) {
        return n1*n2;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("Enter your age: ");
        int age;
        age = sc.nextInt();
        if(age >= 18)
            System.out.println("Major");
        else
            System.out.println("Minor");

        for(int i = 0; i < 10 ; i++) {
            System.out.print(i+" ");
        }

        System.out.println(multiply(5,6));
    }
}