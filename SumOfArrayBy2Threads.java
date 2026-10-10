class Thread1 implements Runnable{
    private int s1 = 0;
    int arr1[] = new int[5];
    public void run(){
        System.out.println("Thread1 is started ....");
        for(int i=0;i<5;i++){
            arr1[i] = (int)(Math.random()*101);
        }
        for(int i=0;i<5;i++){
            try{
                s1 += arr1[i];
                System.out.println(arr1[i] + " Is added.");
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
        System.out.println("Sum of thread 1 : " + s1);
    }
    int getSum(){
        return s1;
    } 
}
class Thread2 implements Runnable{
    int arr1 [] = new int[5];
    private int s2 = 0;
    public void run(){
        System.out.println("Thread2 is started ....");
        for(int i=0;i<5;i++){
            arr1[i] = (int)(Math.random()*101);
        }
        for(int i=0;i<5;i++){
            try{
                s2 += arr1[i];
                System.out.println(arr1[i] + " Is added.");
                Thread.sleep(1000);
            }
            catch(Exception e){}
        }
        System.out.println("Sum of thread 2 : " + s2);
    }
    public int getsum(){
        return s2;
    }
}
public class SumOfArrayBy2Threads {
    public static void main(String[] args) throws InterruptedException{
        Thread1 task1 = new Thread1();
        Thread t1 = new Thread(task1);
        
        Thread2 task2 = new Thread2();
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
        
        t1.join();
        t2.join();

        int total = task1.getSum() + task2.getsum();
        System.out.println("Total sum : " + total);
        System.out.println("Main thread : Thread1 and Thread2 are complemeted !");
    }
}