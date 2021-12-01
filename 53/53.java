import java.io.*;
import java.util.Scanner;

class j53{
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("file.txt");
            DataOutputStream data = new DataOutputStream(file);

            data.writeChars("hello");
            data.flush();
            data.close();
            System.out.println("Task is done :");
        } catch (Exception e) {
            System.out.println("Task is failed :");
        }
    }
}