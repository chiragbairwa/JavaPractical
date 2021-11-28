class St_Functions {
    public static void main(String[] args) {

        String str = "Hell";
        System.out.println(str);
        str += "o";
        System.out.println(str);
        str = "hi";
        System.out.println(str);

        try {
            System.out.println("The detail of String class in Command Prompt");
            Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"javap java.lang.String\"");
        } catch (Exception e) {
            // : handle exception
            System.out.print("Something is wrong....");
        }
    }
}
