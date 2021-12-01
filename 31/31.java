abstract class A{
    abstract void display();
}

class j31 extends A{
    void display(){
        System.out.println("Overriding the abstract function");
    }

    public static void main(String []args) {
        j31 obj=new j31();
        obj.display();
    }
}
