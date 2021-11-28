//Write a program to show the example of priority

class j84 extends Thread{
	public void run(){
		System.out.println("Inside the run() method");  
	}  

	public static void main(String args[]){
		j84 t1 = new j84();  
		j84 t2 = new j84();  
		j84 t3 = new j84();  
 
		System.out.println("Priority of t1 : " + t1.getPriority());  
		    
		System.out.println("Priority of t2 : " + t2.getPriority());  
		  
		System.out.println("Priority of t3 : " + t3.getPriority() + "\n");  
		   
		t1.setPriority(6);  
		t2.setPriority(3);  
		t3.setPriority(9);  
		    
		System.out.println("Priority of t1 : " + t1.getPriority());  
		    
		System.out.println("Priority of t2 : " + t2.getPriority());  
		  
		System.out.println("Priority of t3 : " + t3.getPriority());  
		   
		System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
		  
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
		   
		Thread.currentThread().setPriority(10);  
		  
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
	}  
}  