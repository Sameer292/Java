import java.util.Scanner;
public class counter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i <= n; i++) {
            System.out.println(i );
        }
    }

}
