public class indexOutofBoundException {
    public static void main(String[] args) {
        String name = "Sameer";

        try {
            char ch = name.charAt(6);
            System.out.println("Character at index 6: " + ch);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Index out of bound exception");
        }
        System.out.println("Program continues after exception handling.");

    }
}