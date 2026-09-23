public class PrintingNum extends Thread {
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
}
class PrintingNum1 extends Thread {
    public void run(){
        for(int i=11;i<=20;i++){
            System.out.println(i);
        }
    }
}
class Demo{
    public static void main(String[] args) {
        PrintingNum n1 = new PrintingNum();
        n1.start();
        PrintingNum1 n2 = new PrintingNum1();
        n2.start();
    }
}