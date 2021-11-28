interface first{
    void display1();
}
interface second extends first{
    void display2();
}

class a implements second{
    public void display1(){
        System.out.println("Interface first");
    }
    public void display2(){
        System.out.println("Interface Second");
    }
    public static void main(String[] args) {
        a obj=new a();
        obj.display1();
        obj.display2();
    }
}
