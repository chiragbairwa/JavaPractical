abstract class A{
    abstract void display();
}

class B extends A{
    void display(){
        System.out.println("Overriding the abstract function");
    }

    public static void main(String[] args) {
        B obj=new B();
        obj.display();
    }
}
