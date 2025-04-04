class SuperClass {

    void sample() {
        System.out.println("Method of the super class");
    }
}

class Overriding extends SuperClass {

    @Override void sample() {
        System.out.println("Method of the sub class");
    }

    public static void main(String[] args) {
        Overriding obj = new Overriding();
        SuperClass obj2 = new Overriding();
        obj.sample();
        obj2.sample();
    }
}
