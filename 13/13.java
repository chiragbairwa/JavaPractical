import java.util.Scanner;

class j13 {
    public static void main(String[] args) {

        String[] rel = { "Father", "Mother", "Brother" };
        String[] input = new String[3];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter your " + rel[i] + " name : ");
            input[i] = s.nextLine();
        }

        System.out.print("\n");

        for (int i = 0; i < 3; i++) {
            System.out.println("Your " + rel[i] + " name is " + input[i]);
        }
    }
}
