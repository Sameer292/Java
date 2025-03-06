// import java.util.Scanner;

public class pattern {
// public static void main(String[] args) {
    
// }

    public static void main(String[] args) {
        int numberOfRows = Integer.parseInt(args[0]);
        int numberOfColumns = 2*numberOfRows-1;
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 1; j <= numberOfColumns; j++) {
                if (j == numberOfRows || j >= numberOfRows - i && j <= numberOfRows + i) {

                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
