
class finalKeyword {

    static class Parent {

         void display() {
            System.out.println("I am Parent");
        }

    }

    static class child extends Parent {

        void displayChild() {
            System.out.println("I am Child");
        }
    }

    public static void main(String[] args) {

        
        Parent p = new Parent();
        p.display();
        child c = new child();
        c.display();
        c.displayChild();

    }
}
