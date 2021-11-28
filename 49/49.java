import java.io.*;
class in{
    public static void main(String[] args) throws IOException {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(reader);
        System.out.print("Enter you name= ");
        String name=br.readLine();
        System.out.println(name);
    }
}
