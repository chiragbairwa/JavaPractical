  
class sync{
    synchronized void run(){
        System.out.println("Thread started :");
        
        for(int i=0; i<5; i++)
                System.out.println(i);

        System.out.println("Thread ended :");
    } 
}
class MyThread extends Thread{
    sync f;
    MyThread(sync obj){
        f=obj;
    }
    public void run() {
        f.run();
    }
}
class j83{
    public static void main(String[] args) {
        sync f=new sync();
        MyThread t1= new MyThread(f);
        MyThread t2= new MyThread(f);
        t1.start();
        t2.start();
    } 
}
