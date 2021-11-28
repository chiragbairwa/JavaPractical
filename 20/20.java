class A{
    public int value;

    A(){}

    A(A temp){
        System.out.println("Copy Constructor is called");
        value=temp.value;
    }
    public void display(){
        System.out.println("Value="+value);
    }  
    
    public static void main(String[] args) {
        A obj1=new A();
        obj1.value=10;
        A obj2=new A(obj1);
        obj2.display();
    }
}


