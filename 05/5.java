import java.util.Scanner;

class j5{
    public static void main(String []args){
        System.out.println("Enter number to round off :");
        Scanner sc=new Scanner(System.in);

        float number=sc.nextFloat();
        System.out.println(java.lang.Math.round(number));
    }
}