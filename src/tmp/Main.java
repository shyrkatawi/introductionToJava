package tmp;

public class Main {
    public static void main(String[] args) {
        First f = new First();

        Second s = new Second();
        s.show();
        s.show(1);
        System.out.println(Second.da++);
        System.out.println(Second.da++);
    }
}
