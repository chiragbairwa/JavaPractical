interface first{
    void display1();
}
interface second extends first{
    void display2();
}

class j47 implements second{
    public void display1(){
        System.out.println("Interface first :");
    }
    public void display2(){
        System.out.println("Interface Second :");
    }
    public static void main(String[] args) {
        j47 obj=new j47();
        obj.display1();
        obj.display2();
    }
}
