import java.util.Scanner;
class matrix
{
public static void main(String matrix[])
{
Scanner sc=new Scanner(System.in);
int x[][]=new int[2][2];
int y[][]=new int[2][2];
int z[][]=new int[2][2];

System.out.println("Enter Elements of First matrix");
for(int i=0;i<2;i++)//Elements of first matrix
{
for(int j=0;j<2;j++)
{
x[i][j]=sc.nextInt();
}
}
//------------------------
System.out.println("Enter Elements of First matrix");
for(int i=0;i<2;i++)//Elements of Second matrix
{
for(int j=0;j<2;j++)
{
y[i][j]=sc.nextInt();
}
}

for(int i=0;i<2;i++)//Third matrix
{
for(int j=0;j<2;j++)
{
z[i][j]=0;
for(int k=0;k<2;k++)
{
z[i][j]=z[i][j] + (x[i][k]*y[k][j]);
}
}
}
System.out.println("Multiplication of two matrix is:");
for(int i=0;i<2;i++)//multiplication
{
for(int j=0;j<2;j++)
{
System.out.println(z[i][j]+" ");
}
System.out.println();
}

}
}