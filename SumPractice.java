public class SumPractice{

static int result;

static void add(int a, int b){
    result = a+b;
}

public static void main(String[] args) {
    SumPractice.add(12, 24);
    System.out.println("Sum: " + SumPractice.result);
}
}