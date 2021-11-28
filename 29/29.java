class a{
    void display(){
        System.out.println("Class A");
    }
}

class b extends a{
    //Overriding display()
    void display(){
        System.out.println("Class B");
    }
}

class c{
    public static void main(String[] args) {
        b obj=new b();
        obj.display();
    }
}
