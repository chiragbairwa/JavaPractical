class j14 {
    private String a = "private";
    protected String b = "protected";
    public String c = "public";
    String d = "Default";

    j14() {
        System.out.println("Private Data Member : " + a);
        System.out.println("Protected Data Member : " + b);
        System.out.println("Public Data Member : " + c);
        System.out.println("Default Data Member : " + d);
    }

    public static void main(String[] args) {
        j14 obj = new j14();
    }
}
