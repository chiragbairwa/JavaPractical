abstract class A{
    void display(){
        System.out.println("Display function of abstract class");
    }
}

class B extends A{
    public static void main(String[] args) {
        B obj=new B();
        obj.display();
    }
}