class Thread1 implements Runnable{
    public void run(){
        try{
            Thread.sleep(100);
            for(int i=0;i<5;i++){
                System.out.println("Thread 1 : " + i);
            }
        }
        catch(Exception e){}
    }
}
public class JoinInThreads {
    public static void main(String []a) 
        throws InterruptedException{
        Thread1 t1 = new Thread1();
        Thread t = new Thread(t1);
        t.start();
        t.join();
        System.out.println("Program Finished !");
    }
}