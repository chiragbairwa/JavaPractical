class j21{  
     public static void main(String[] args){   
        j21 obj = new j21();   
        System.out.println(obj.hashCode());   
        obj = null;   
        // calling garbage collector    
        System.gc();   
        System.out.println("End of garbage collection");   
  
    }   
    @Override  
    protected void finalize(){   
        System.out.println("Finalize method called");   
    }   
}  