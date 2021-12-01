import java.util.Scanner;

class MyExp extends Exception{
    public MyExp(String s){
        // Call constructor of parent Exception
        super(s);
    }
}
 
class j65{
   void ageCheck(int age) throws MyExp{
		if(age<1){
			throw new MyExp("Age Invalid");
		}
	}
   
    public static void main(String args[]){
    	j65 obj = new j65();
        try{
			System.out.print("Enter the Age : ");
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt(); 
            obj.ageCheck(age);
			System.out.println("Age Valid");
        }
        catch (MyExp ex){
            System.out.println("Caught the exception :");
            System.out.println(ex.getMessage());
        }
    }
}