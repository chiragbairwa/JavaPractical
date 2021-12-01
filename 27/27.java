class a{
    public int a;
    a(int a){
        this.a=a;
    }
}
class b extends a{
    public int b;
    b(int a,int b){
        super(a);
        this.b=b;
    }

    void display(){
        System.out.println("a="+a+" b="+b);
    }
}

class j27{
    public static void main(String[] args) {
        b obj=new b(1,2);
        obj.display();
    }
}
