import java.io.File;
import java.util.Scanner;

public class ScannerClassforReadingFiles {
    public static void main(String[] args) {
        try{
            File file = new File("/home/iamsameer/Programming/Java/text.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch(Exception e){
            System.out.println("Error Occured!!!" + e.getMessage());
        }
    }
}