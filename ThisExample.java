public class ThisExample {
    int x;

    int y;

    ThisExample(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.println(this.x + " " + this.y);
        add(this);
        System.out.println(this.x + " " + this.y);
    }

    void add(ThisExample o) {
        o.x += 2;
        o.y += 2;
    }

    public static void main(String[] args) {
        ThisExample obj = new ThisExample(1, 4);
    }
}
