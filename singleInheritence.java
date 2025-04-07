class Person{

void showPerson(){
    System.out.println("I am a person!!!");
}

}
class student extends Person{
    void showStudent(){
        System.out.println("I am a Student!!!");
    }

}


class singleInheritence{
    
    public static void main(String[] args) {
        student s = new student();
        s.showPerson();
        s.showStudent(); 
    }

}