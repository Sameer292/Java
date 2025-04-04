
public class Overloading2 {

    void display(int a) {

        System.out.println("A: " + a);

    }

    void display(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void display(double c) {
        System.out.println("C: " + c);
    }

    public static void main(String[] args) {
        Overloading2 Obj2 = new Overloading2();
        Obj2.display(12);
        Obj2.display(12, 13);
        Obj2.display(12.11);
    }

}
