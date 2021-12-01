class j38 {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("Hell");
        System.out.println(str);
        System.out.println("The length of StringBuffer is " + str.length());

        try {
            System.out.println("The detail of StringBuffer class in Command Prompt");
            Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"javap java.lang.StringBuffer\"");
        } catch (Exception e) {
            // : handle exception
            System.out.print("Something is wrong....");
        }
    }
}