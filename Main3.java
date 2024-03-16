public class Main3 {
    int var;

    Main3(int var) {
        this.var = var;
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        Main3 obj = new Main3(8);
        System.out.println("object reference = " + obj);
    }
}
/*
Use cases of this keyword
- wherever there are ambiguity variable names - distinguishing class fields and parameters with same names
- Constructor overloading: can also be used to pass the current instance as a parameter to
    another method or constructor. - see class Complex
- passing this as an argument - see class ThisExample - this keyword passes the reference of that
    particular object
 */