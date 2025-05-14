
import java.lang.Math;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        int num, rem, limit = 100000000, sum = 0;
        System.out.println("Armstrong numbers from 1 to " + limit);
        for (int i = 1; i <= limit; i++) {
            int count = 0;
            int temp = i;
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
            num = i;
            while (num > 0) {
                rem = num % 10;
                sum += Math.pow(rem, count);
                num /= 10;
            }
            if (sum == i) {
                System.out.println(i + " ");
            }
            sum = 0;
        }
    }

}
