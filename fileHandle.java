import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to write in the file: ");
        String toWrite = sc.nextLine();
        String filePath = "/home/iamsameer/Programming/Java/text.txt";
        try {
            FileWriter writer = new FileWriter(filePath, false);
            writer.write(toWrite);
            writer.close();
            System.out.println("String successfully written in: " + filePath);
        } catch (Exception e) {
            System.out.println("Error occured while writing this file!!!" + e.getMessage());
        }
        sc.close();
    }
}