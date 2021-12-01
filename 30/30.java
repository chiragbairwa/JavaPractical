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

class j30{
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        C obj3=new C();
        
        obj1.display();
        obj1 = obj2;
        obj1.display();
        obj1 = obj3;
        obj1.display();
    }
}