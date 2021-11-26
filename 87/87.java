//Write a program to show the example of sleep() method

import java.lang.Thread;  
  
class j87{   
    public static void main(String []args){  
        try {  
            for (int i=0; i<5; i++){       
                Thread.sleep(1000);  
 
                System.out.println(i);  
                }  
        }  
        catch (Exception e){  
            System.out.println(e);  
        }
    }  
}  