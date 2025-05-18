import java.io.FileOutputStream;

public class ByteSTreamIO {

    public static void main(String[] args) {
    try {
        FileOutputStream file = new FileOutputStream("ByteFile.txt");
        file.write("Kale chatpate".getBytes());
        file.close();
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println("An error occured: "+ e.getMessage());
    }       
    }
}