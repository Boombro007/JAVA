import java.util.Scanner;
public class CopyingArray 
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter Size of array : ");
        n = scan.nextInt();
        int arr[] = new int[n];
        int arrcp[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
            arrcp[i] = arr[i];
        }
        System.err.print("Normal array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.print("Copied array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+arrcp[i]);
        }
        scan.close();
    }
}