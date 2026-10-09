class Thread1 implements Runnable{
    public void run(){
        
    }
}
class Thread2 implements Runnable{
    public void run(){

    }
}
public class SumOfArrayBy2Threads implements Runnable {
    public void run(){

    }
    public static void main(String[] args) {
        SumOfArrayBy2Threads s1 = new SumOfArrayBy2Threads();
        Thread t1 = new Thread(s1);
        t1.start();
    }
}
