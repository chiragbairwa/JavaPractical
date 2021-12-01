import java.util.Scanner;

class j2{
    public static void main(String []args) {
        System.out.print("Enter your password :");
        Scanner sc = new Scanner(System.in);

        String pass = sc.nextLine();
        System.out.print("Secret password :");
        for (int i=0; i<pass.length(); i++)
            System.out.print("*");
    } 
}
