class Counter {
    static int count = 0;

    public static synchronized void increment() {
        count++;
    }
}

class MyTask implements Runnable {
    public void run() {
        for (int i = 0; i < 100000; i++) {
            Counter.increment();
        }
    }
}

public class TwoThreads{
    public static void main(String[] args)
            throws InterruptedException {

        Thread t1 = new Thread(new MyTask());
        Thread t2 = new Thread(new MyTask());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + Counter.count);
    }
}