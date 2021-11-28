import java.io.*;
class DIS {
    public static void main(String[] args) {
        try {
            InputStream input = new FileInputStream("file.txt");
            DataInputStream inst = new DataInputStream(input);
            int count = input.available();
            System.out.println(count);
            byte[] ary = new byte[count];
            inst.read(ary);
            for (byte bt : ary) {
                char k = (char) bt;
                System.out.print(k);
            }
        } catch (IOException e) {
            System.out.println("File is not found");
        }
    }
}