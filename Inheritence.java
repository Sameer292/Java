
class MMC {

    public void displayInfo() {
        System.out.println("I am a student of MMC!!!");
    }

}

class Student extends MMC {

    String name;

    public Student(String name) {
        this.name = name == null ? "Sameer" :                                                                                                                                                                                                                                                                           name;
    }

    public void inputInfo() {
        System.out.println("My name is " + name);
        displayInfo();

    }
}

public class Inheritence {

    public static void main(String[] args) {
        Student s1 = new Student("Shreeya");
        Student s2 = new Student(null);
        s2.inputInfo();
        s1.inputInfo();
    }
}
