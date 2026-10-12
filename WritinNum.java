
class WriteNum {

    public synchronized void writeNum() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("Num : " + (i + 1));
        }

        System.out.println("Can't get next ...");

        wait();

        for (int i = 5; i < 10; i++) {
            System.out.println("Num : " + (i + 1));
        }
    }

    public synchronized void reminder() {
        System.out.println("Next is 6 !");
        notify();
    }
}

public class WritinNum {
    public static void main(String[] args) {
        WriteNum n1 = new WriteNum();

        Thread t1 = new Thread(() -> {
            try {
                n1.writeNum();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(() -> {
            n1.reminder();
        });

        t1.start();
        t2.start();
    }
}