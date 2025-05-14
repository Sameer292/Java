import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        sc.close();
        String[] wordcount = str.split("");
        System.out.println("Your current String: "+str);
        System.out.println("The length of the given string is: " + wordcount.length);
        System.out.println("The reversed string is: ");
        for (int i = wordcount.length; i > 0; i--) {
            System.out.print(wordcount[i - 1]);
        }
        System.out.println("");
    }
}