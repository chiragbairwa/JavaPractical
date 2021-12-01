class a{
    protected int a;
}

class b extends a{
    protected int b;

}

class c extends b{
    int c;
    c(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    void display(){
        System.out.println("a="+a+" b="+b+" c="+c);
    }
}

class j25{
    public static void main(String []args) {
        c obj=new c(1,2,3);
        obj.display();
    }
}
