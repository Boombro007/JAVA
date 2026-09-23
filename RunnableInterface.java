public class RunnableInterface implements Runnable {
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
class Demo{
    public static void main(String [] a){
        RunnableInterface obj = new RunnableInterface();
        Thread t1 = new Thread(obj);
        t1.start(); 
    }
}