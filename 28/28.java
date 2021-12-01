class a{
    a(){
        System.out.println("Super Class Constructor");
    }
}
class b extends a{
    b(){
        super();
        System.out.println("Sub Class Constructor");
    }
}

class j28{
    public static void main(String[] args) {
        b obj=new b();
    }
}