class SumUsingThreads extends Thread{
    public void run(){
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = (int)(Math.random() * 101);   
        }
        int sum = 0;
        for(int i=0;i<10;i++){
            try{
                sum += arr[i];
                System.out.println(arr[i] + " Is added.");
                Thread.sleep(1000);
                System.out.println("Sum : "+sum);
            }
            catch(Exception e){}
        }
    }
    public static void main(String[] args) {
        SumUsingThreads s1 = new SumUsingThreads();
        s1.start();
    }
}