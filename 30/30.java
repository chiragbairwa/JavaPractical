class A{
    void display(){
        System.out.println("Class A display function");
    }
}

class B extends A{
    void display(){
        System.out.println("Class B display function");
    }
}

class C extends B{
    void display(){
        System.out.println("Class C display function");
    }
}

class test{
    public static void main(String[] args) {
        A obj=new A();
        B obj2=new B();
        C obj3=new C();
        obj.display();
        obj=obj2;
        obj.display();
        obj=obj3;
        obj.display();
    }
}