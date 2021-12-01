import java.util.Scanner;
import java.io.IOException;

class j4{
    public static void main(String []args) throws IOException{
        System.out.println("Enter a number :");
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();

        if(num%4==0)
            System.out.println(num  + " is divisible by 4");
        else 
            System.out.println(num  + " is not divisible by 4");
    }
}