import java.util.Scanner;
public class ForLoopSeries {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int size;
        
        size = scan.nextInt();
        for(int i=0;i<size;i++)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int currentSum = a;
            for(int j=0;j<n;j++)
            {
                currentSum += (1 << j) * b; //(1 << j); = Math.pow(1,j);
                System.out.print(currentSum + " ");
           }
           System.out.println("");
        }
    }
}
