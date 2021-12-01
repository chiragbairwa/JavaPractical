package p1;

class a {
    protected String str = "Hi from other class";
}

class j43 extends a {
    public static void main(String[] args) {
        a obj = new a();
        System.out.println(obj.str);
    }
}