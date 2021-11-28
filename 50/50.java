import java.io.*;

class input {
    public static void main(String[] args) throws IOException {
        String name = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name : ");
        name = br.readLine();
        System.out.println("Your name is " + name);
    }
}

