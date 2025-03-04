import java.util.Scanner;

public class fibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        long a = 0;
        long b = 1;
        // System.out.println(a);
        // System.out.println(b);
        for (int i = 2; i <= n; i++) {
            long c = a + b;
            double ratio = (double)c / b;
            a = b;
            b = c;
            System.out.println(ratio);
        }
    }
}