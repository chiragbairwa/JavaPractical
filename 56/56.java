import java.io.FileReader;

class FLExample {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("file.txt");
            int i;
            while ((i = fr.read()) != -1)
                System.out.print((char) i);
            fr.close();
        } catch (Exception e) {
            System.out.println("Task is failed");
        }
    }
}