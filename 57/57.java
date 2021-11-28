import java.io.FileWriter;

class FWExample {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("file.txt");
            fw.write("Welcome to java");
            fw.close();
            System.out.println("Task is successful");
        } catch (Exception e) {
            System.out.println("Task is failed");
        }
    }
}