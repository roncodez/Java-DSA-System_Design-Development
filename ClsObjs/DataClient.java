package ClsObjs;

public class DataClient {
    public static void main(String[] args) {
        Data d = new Data();

//        d.name = "Ronit";
//        System.out.println(d.name);           WRONG
        d.setName("Ronit");
        System.out.println(d.getName());
    }
}
