//Write a program to  show the example of creating thread through thread class 

class j82 extends Thread{  
	public void run(){  
		System.out.println("Thread Started :");  
	}

	public static void main(String args[]){  
		j82 obj=new j82();  
		obj.start();  

	 }  
}  