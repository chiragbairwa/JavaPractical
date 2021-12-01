interface a{
    int add(int x,int y);
}
interface b{
    int add(int x,int y);
}
class j45 implements a,b{
    public int add(int x,int y){
        return (x+y);
    }
    public static void main(String[] args) {
        j45 obj=new j45();
        int x=obj.add(5,5);
        
        System.out.println("Multiple Inheritance:");
        System.out.println("Addition of 5 and 5 is= "+x);
    }
}
