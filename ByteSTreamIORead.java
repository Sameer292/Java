import java.io.FileInputStream;

public class ByteSTreamIORead {

    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("ByteFile.txt");
            int i;
            while ((i = file.read()) != -1) {
                System.out.print((char)i);
            }
            System.out.println("");
            file.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("An error occured: "+e.getMessage());
        }
    }
}