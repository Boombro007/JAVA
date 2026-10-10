class IntruptionCreationThreads implements Runnable{
    Thread t1;
    IntruptionCreationThreads(){
        t1 = new Thread(this);
        System.out.println("Child thread : " + t1);
        t1.start();
    }
    public void run(){
        try{
            for(int i=1;i<=10;i++){
                System.out.println("Child : "+i);
                Thread.sleep(500);
            }
        }
        catch(Exception e){}
    }
    public static void main(String[] args) {
        new IntruptionCreationThreads();
        try{
            for(int i=1;i<=5;i++){
                System.out.println("Main : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){}
    }
}