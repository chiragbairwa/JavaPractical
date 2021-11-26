//Write a program to show the example of suspend() and resume() method

class j85 extends Thread{
    public void run(){    
        for(int i=0; i<5; i++){    
            try{  
                sleep(500);  
                System.out.println(Thread.currentThread().getName());    
            }
            catch(InterruptedException e){ System.out.println(e); }    
            System.out.println(i);    
        }
    }    
    public static void main(String []args)  
    {    
        j85 t1=new j85();    
        j85 t2=new j85();   
        j85 t3=new j85();   
  
        t1.start();  
        t2.start();  
         
        t2.suspend();   
         
        t3.start();  
    }    
}  