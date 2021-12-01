class a{
    protected int a;
}

class b extends a{
    public int b;
    
    b(int a,int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println("a = "+ a +" b = " + b);
    }
}

class j24{
    public static void main(String[] args) {
        b obj=new b(1,2);
        obj.display();
    }
}


