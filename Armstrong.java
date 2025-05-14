
import java.lang.Math;

public class Armstrong {

    public static void main(String[] args) {
        int n, arg, sum = 0, r;
        n = 153;
        arg = n;
        for (int i = 1; i < n; i++) {
            while (n > 0) {
                r = n % 10;
                sum += Math.pow(r, 3);
                n /= 10;
            }
        }

        if (arg == sum) {
            System.out.println(arg + " is an armstrong number.");
        } else {
            System.out.println(arg + " is not an armstrong number.");
        }
    }
}
