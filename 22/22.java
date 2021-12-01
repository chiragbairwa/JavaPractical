class j22{
    int sum(int x,int y){
        return x+y;
    }

    int sum(int x,int y,int z){
        return x+y+z;
    }

    public static void main(String[] args) {
        j22 s=new j22();

        System.out.println(s.sum(10,10));
        System.out.println(s.sum(10,10,10));
    }
}
