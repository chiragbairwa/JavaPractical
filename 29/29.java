class a{
    void display(){
        System.out.println("Class A");
    }
}

class b extends a{
    void display(){
        System.out.println("Class B");
    }
}

class j29{
    public static void main(String[] args) {
        b obj=new b();
        obj.display();
    }
}