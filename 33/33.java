class A{
    final public int a=10;
    void display(){
        System.out.println("a="+a);
    }
}

class B{
    public static void main(String[] args) {
        A obj=new A();
        obj.a=5;
        obj.display();
    }
}
