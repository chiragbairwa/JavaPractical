class input
{
	public static void main(String args[])throws java.io.IOException
	{
		java.io.InputStreamReader isr=new java.io.InputStreamReader(System.in);
		java.io.BufferedReader br=new java.io.BufferedReader(isr);
		System.out.print("Enter your name: ");
		String st=br.readLine();
		System.out.println(st);
	}
}