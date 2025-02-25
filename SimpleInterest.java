import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        float p = sc.nextFloat();
        System.out.println("Enter the rate of interest: ");
        float r = sc.nextFloat();
        System.out.println("Enter the time: ");
        int t = sc.nextInt();
        float SI = (p*t*r)/100;
        System.out.println("The Simple Interest is: "+SI);
    }   
}