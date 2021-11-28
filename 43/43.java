package temp;

class J1 {
    protected String str = "Hi from other class";
}

class J2 extends J1 {
    public static void main(String[] args) {
        J2 obj = new J2();
        System.out.println(obj.str);
    }
}