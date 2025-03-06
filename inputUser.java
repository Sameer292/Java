import java.util.Scanner;

class Student{

int age;
String name;

void inputInfo(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    name = sc.nextLine();
    System.out.println("Enter your age: ");
    age = sc.nextInt();
    sc.close();
}
void displayInfo(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
}
}

public class inputUser{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.inputInfo();
        s1.displayInfo();
    }
}