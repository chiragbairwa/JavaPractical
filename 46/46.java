interface a{
    //public,static and final (By Default)
    int x=10;
}
class temp implements a{
    public static void main(String[] args) {
        //a.x=89;//Error
        System.out.println(a.x);
    }
}