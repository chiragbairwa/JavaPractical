interface demo{
     int add(int x,int y);
}

class j44 implements demo{
    public int add(int x,int y){
        return (x+y);
    }
    public static void main(String[] args) {
        j44 obj = new j44();
        int x = obj.add(1,1);
        System.out.println("Addition of 1 and 1 is= "+x);
    }
}