import java.util.Scanner;

public class Calculator {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter first number: ");
int a = input.nextInt();
System.out.println("Enter second number: ");
int b = input.nextInt();
input.close();
int sum = a + b;
int diff = a - b;
int product = a * b;
int quotient = a / b;
System.out.println("Sum of "+a+" and "+b+" is "+sum);
System.out.println("Difference of "+a+" and "+b+" is "+diff);
System.out.println("Product of "+a+" and "+b+" is "+product);
System.out.println("Quotient of "+a+" and "+b+" is "+quotient);

}


}