import java.util.Scanner;

class j9{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Integer = ");
        double x = sc.nextInt();

        System.out.print("Enter 2nd Integer = ");
        double y = sc.nextInt();
        
        if(y==0){
            System.out.println("Denominator should not be equals to 0");
        }
        else{
            double result = x / y;
            System.out.println("1st number is divided by 2nd number:" + x + "/" + y +"=" + result);
        }
    }
}