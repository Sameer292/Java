
class outer {

    int x = 10;

    class inner {

        int y = 20;

        void display() {
            System.out.println(x);
            System.out.println(y);
        }
    }
}

class NestedClass {

    public static void main(String[] args) {
        outer obj = new outer();
        outer.inner obj2 = obj.new inner();
        obj2.display();
    }
}
