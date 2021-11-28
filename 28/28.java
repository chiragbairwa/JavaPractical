class C1{
    C1(){
        System.out.println("Super Class Constructor");
    }
}
class C2 extends C1{
    C2(){
        super();
        System.out.println("Sub Class Constructor");
    }
}

class C3{
    public static void main(String[] args) {
        C2 obj=new C2();
    }
}