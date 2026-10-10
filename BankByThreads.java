class Balance{
    public static int balance = 1000;
    public static synchronized void decrement(String tname){
        if(balance >= 700)
        {
           balance -= 700;
           System.out.println(tname + " withdrawl the money !");
           System.out.println("Remainig balance : " + balance);
        }
        else{
            System.out.println(tname + " has Insufficent Balance !");
        }
    }
}
class Thread1 implements Runnable{
    public void run(){
        while((Balance.balance-700) > 0){
            Balance.decrement("Thread1");
        } 
    }
}

class Thread2 implements Runnable{
    public void run(){
        while((Balance.balance-700) > 0){
            Balance.decrement("Thread2");
        }
    }
}

public class BankByThreads {
    public static void main(String[] args) throws InterruptedException{
        Thread1 task1 = new Thread1();
        Thread2 task2 = new Thread2();

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Remainig balance : " + Balance.balance);
        System.out.println("Balance in under required balance !");
    }
}