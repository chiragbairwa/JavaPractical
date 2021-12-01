class j16{
    void disp1() {
        System.out.println("Calling by Named object :");
    }
    void disp2() {
        System.out.println("Calling by Unnamed object :");
    }

    public static void main(String []arg){
        new j16().disp2();

        j16 obj = new j16();
        obj.disp1();
    }
}