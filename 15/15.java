class j15{
    static String str = "Static Data Member"; 

    void disp(){
        show();
    }
    static void show(){
        System.out.print("Static function called by non-static function : ");
    }
    public static void main(String []arg){
        j15 obj = new j15();
        obj.disp();

        System.out.println(str);
    }
}