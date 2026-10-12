class Shared{
    synchronized void waiting() throws InterruptedException {
        System.out.println("Thread 1 is waiting...");
        wait();
        System.out.println("Thread 1 is awake!");
    }

    synchronized void signal() {
        System.out.println("Thread 2 is sending a signal!");
        notify();
    }
}
public class friendMessage {
    public static void main(String[] args) {
        Shared obj = new Shared();

        Thread t1 = new Thread(() -> {
            try {
                obj.waiting();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(() -> {
            obj.signal();
        });

        t1.start();
        t2.start();
    }
}