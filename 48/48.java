interface A{
    int x=10;
    void display();
}
class B implements A{
    public void display(){
        System.out.println("In B class ,the value of x = "+A.x);
    }
}
class C implements A{
    public void display(){
        System.out.println("In C class ,the value of x = "+A.x);
    }
}

class D{
    public static void main(String[] args) {
        A obj;
        obj=new B();
        obj.display();
        obj=new C();
        obj.display();
    }
}
