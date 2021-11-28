//Write a program to  show the example of creating thread through runnable interface 

class j81 implements Runnable{  
	public void run(){  
		System.out.println("Thread is Started...");  
	}  
	  
	public static void main(String []args){  
		j81 obj = new j81();  
		Thread t = new Thread(obj);
		t.start();  
	 }  
}  