import java.util.Scanner;
class sort
{
public static void main(String sort[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter length of array:");
int n=sc.nextInt();
int number[]=new int[n];
System.out.println("Enter Elements into an array");
for(int i=0;i<number.length;i++)
{
number[i]=sc.nextInt();
}
java.util.Arrays.sort(number);

System.out.println("Sorted array in acending order");
for(int j=0;j<number.length;j++)
{
System.out.print(number[j]+",");
}
}
}