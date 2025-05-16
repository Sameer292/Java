import java.io.FileReader;

public class ReadingContent {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("/home/iamsameer/Programming/Java/text.txt");
            int data;
            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }
            file.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("An error occured.." + e.getMessage());
        }
        System.out.println("");
    }
}