import java.util.Scanner;
public class NameConcat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first name");
        String name1=sc.next();
        System.out.println("Enter your last name");
        String name2=sc.next();
        sc.close();
        System.out.println(name1+" "+name2);
    }
}