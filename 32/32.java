abstract class A{
    void display(){
        System.out.println("Display function of abstract class");
    }
}

class j32 extends A{
    public static void main(String[] args) {
        j32 obj=new j32();
        obj.display();
    }
}