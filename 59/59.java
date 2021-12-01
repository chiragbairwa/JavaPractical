class j59{
	public static void main(String args[]){
		int x=0;
		try{
			x=Integer.parseInt(args[0]);
		}

		catch(NumberFormatException e){	
			System.out.println(e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		System.out.println(x);	
	}
}