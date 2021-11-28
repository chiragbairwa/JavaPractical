class Sum{
    public int sum(int x,int y){
        return x+y;
    }
    //Overloaded Function sum()
    public int sum(int x,int y,int z){
        return x+y+z;
    }

    public static void main(String[] args) {
        Sum s=new Sum();
        System.out.println(s.sum(10,10));
        System.out.println(s.sum(10,10,10));
    }
}
