class name
{
public static void main(String n[]) throws java.io.IOException
{
System.out.println("Enter your name");
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br=new  java.io.BufferedReader(isr);
String str=br.readLine();
int length=str.length();
char[] ch=str.toCharArray();
for(int i=0;i<=length;i++)
{
System.out.println(ch[i]);
}
}
}