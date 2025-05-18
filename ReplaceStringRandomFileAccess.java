import java.io.RandomAccessFile;

public class ReplaceStringRandomFileAccess {

    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("text.txt", "rw");
            file.seek(5);
            file.writeBytes("Overreading");
            file.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("An error occured");
        }
    }
}