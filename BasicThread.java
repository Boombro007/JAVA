// package Threaddss;

class Thread1 implements Runnable{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("Task A - " + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            e.getStackTrace();
        }
    }
}

class Thread2 implements Runnable{
    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println("Task B - " + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class BasicThread{
    
    public static void main(String []a) throws InterruptedException{
        Thread1 task1 = new Thread1();
        Thread2 task2 = new Thread2();
        
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("All tasks completed !");
    }   
}