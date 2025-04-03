
class Area {

    static double pi = 3.1415926;

    static double circle(double r) {
        return pi * r * r;
    }

    public static void main(String[] args) {
        double result = Area.circle(7);
        System.out.println("Area of the circle: " + result);
    }
}
