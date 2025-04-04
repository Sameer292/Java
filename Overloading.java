
public class Overloading {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        obj.add(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
    }
}
