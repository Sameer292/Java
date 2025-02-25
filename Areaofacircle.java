import java.util.Scanner;
public class Areaofacircle{
public static void main(String[] args){
float PI = 3.1415926f;
Scanner input = new Scanner(System.in);
System.out.println("Enter the radius of the circle: ");
float radius = input.nextFloat();
input.close();
float area = PI * radius * radius;
System.out.println("The area is : "+area);
}
}
