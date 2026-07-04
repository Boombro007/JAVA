import java.util.Scanner;
public class sumofArray {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of array : ");
        int n;
        n = sc.nextInt();
        int [] a = new int [n];
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.println("Sum of array is : "+sum);
        float avg = sum / n;
        System.out.print("Average is : " +avg);
    }
}