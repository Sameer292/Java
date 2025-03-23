class Construct{
    int num1, num2;
    Construct(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    void display(){
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void main(String[] args) {
        Construct obj = new Construct(200000,687687687);
        obj.display();
    }
}