import java.util.Scanner;
class avg
{
public static void main(String av[])
{
Scanner scan=new Scanner(System.in);

double marks[]=new double[5];
double sum=0;
for(int i=1;i<5;i++)
{
System.out.println("Enter marks of subject"+ i);
marks[i]=scan.nextDouble();
sum+=marks[i];
}
System.out.println("Average="+sum/5);
}
}