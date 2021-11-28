class MyException extends Throwable
{
	public String getMessage()
	{
		return "Negative number";
	}
}

class input
{
	public static void main(String args[])
	{
		int x=0;
		try
		{
		x=Integer.parseInt(args[0]);
		display(x);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
	}
	static void display(int x) throws MyException
	{
		if(x<0)
		{
			throw new MyException();
		}
		else 
		{
			System.out.println(x);
		}
	}
}