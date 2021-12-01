import java.util.Scanner;

class MyException extends Throwable{
	public String getMessage(){
		return "Negative number";
	}
}

class j64{
	static void display(int x) throws MyException{
		if(x<0){
			throw new MyException();
		}
		else {
			System.out.println(x);
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();

		try{
			display(x);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e){
			System.out.println(e.getMessage());
		}
		catch(MyException e){
			System.out.println(e.getMessage());
		}
	}
	
}