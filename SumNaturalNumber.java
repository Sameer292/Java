import java.util.Scanner;
public class SumNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        int sumviaformula = (n*(n+1))/2;
        int sumvialoop = 0;
        for (int i = 1; i <= n; i++) {
            sumvialoop += i;
        }
        System.out.println("Sum of "+n+" natural numbers is "+sumviaformula);
        System.out.println("Sum of "+n+" natural numbers is "+sumvialoop);
    }
}