class Counter{
    static int count = 0;
    public static synchronized void increment(){
        count++;
    } 
    public static  void printCount(){
        System.out.println(count);
    }
}
class Thread1 implements Runnable{
    public void run(){
        for(int i=0;i<100000;i++){
            Counter.increment();
        }
    }
}
class Thread2 implements Runnable{
    public void run(){
        for(int i=0;i<100000;i++){
            Counter.increment();
        }
    }    
}
public class CounterThread {
    public static void main(String[] args) throws InterruptedException {
        Thread1 task1 = new Thread1();
        Thread2 task2 = new Thread2();

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        Counter.printCount();
    }
}