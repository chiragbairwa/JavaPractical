class a
{
	public static void main(String args[])throws java.io.IOException
	{
		
		java.io.InputStreamReader isr=new java.io.InputStreamReader(System.in);
		java.io.BufferedReader br=new java.io.BufferedReader(isr);
		char ch='x';
		System.out.println("Enter a character.......press n for quit");
		do
		{
		if(ch=='n')
		{
		System.exit(0);
		}
		ch=(char)br.read();
		}while(ch!='n');
	}	
}