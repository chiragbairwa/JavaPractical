class Temp {
    private String p = "Parminder";
    protected String pro = "Parminder";
    public String pub = "Parminder";
    String def = "Parminder";

    Temp() {
        System.out.println("Private variable p= "+p);
        System.out.println("Protected variable pro= "+pro);
        System.out.println("Public variable pub= "+pub);
        System.out.println("Default variable def= "+def);
    }

    public static void main(String[] args) {
        Temp obj = new Temp();
    }
}
