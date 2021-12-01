import java.util.Scanner;

class j7{
    public static void main(String []str){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number ");
        int x=sc.nextInt();
        if(x!=0)
            System.out.println(x/x);
        else{
            x = 1;
            System.out.println(x);
        }
    }
}