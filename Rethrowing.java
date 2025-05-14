public class Rethrowing {
    public int add(int a, int b) throws Exception {
        try {
            if (a < 0 || b < 0)
                throw new Exception("Negative numbers are not allowed.");
            return (a + b);
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }
    public static void main(String[] args) {
        Rethrowing obj = new Rethrowing();
        try {
            int result = obj.add(10, -20);
            System.out.println("Sum is: " + result);
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        try {
            int result = obj.add(10, 20);
            System.out.println("Sum is: " + result);
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}