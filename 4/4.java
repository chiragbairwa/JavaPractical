import java.util.Scanner;
class div{
public static void main(String n[]) throws java.io.IOException
{
System.out.println("Enter number");
Scanner num=new Scanner(System.in);
int number=num.nextInt();
if(number%4==0)
System.out.println(number  + " is divisible by 4");
else 
System.out.println(number  + " is not divisible by 4");
}
}