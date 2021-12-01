class j20{
    String str;

    j20(){}

    j20(j20 temp){
        System.out.println("Copy Constructor is called : ");
        str = temp.str;
    }
    public void disp(){
        System.out.println("Result = " + str);
    }  
    
    public static void main(String []args) {
        j20 obj1=new j20();
        obj1.str = "First obj";

        j20 obj2=new j20(obj1);
        obj2.disp();
    }
}


