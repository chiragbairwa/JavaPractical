class a{
    public int a;
}
class b extends a{
    public int b;
    b(int a,int b){
        this.a=a;
        this.b=b;
    }
    void sum(){
        System.out.println("Class b:");
        System.out.println(a+b);
    }
}

class c extends a{
    public int c;
    c(int a,int c){
        this.a=a;
        this.c=c;
    }
    void sum(){
        System.out.println("Class c:");
        System.out.println(a+c);
    }
}

class d{
    public static void main(String[] args) {
        b obj=new b(10,10);
        obj.sum();
        c obj1=new c(20,20);
        obj1.sum();
    }
}
