import java.util.*;
class except{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            
            try {
                int arr[]=new int[5];
                arr[5]=1;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner try catch block");
            }
            int x=Integer.parseInt("JAVA");

        } catch (NumberFormatException e) {
            System.out.println("Outer try catch block");
        }
    }
}
