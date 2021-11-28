interface a{
    int add(int x,int y);
}
interface b{
    int add(int x,int y);
}
class c implements a,b{
    public int add(int x,int y){
        return (x+y);
    }
    public static void main(String[] args) {
        c obj=new c();
        int x=obj.add(5,5);
        System.out.println("Multiple Inheritance:");
        System.out.println("Addition of 5 and 5 is= "+x);
    }
}
