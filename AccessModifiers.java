abstract class Animal {

    abstract void sound();

}

class cat extends Animal {

    @Override void sound() {
        System.out.println("meow");
    }

}

class dog extends Animal {

    @Override void sound() {
        System.out.println("bark");
    }

}

public class AccessModifiers {

    public static void main(String[] args) {

        dog d1 = new dog();
        d1.sound();
        cat c1 = new cat();
        c1.sound();

    }

}
