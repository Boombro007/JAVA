import java.util.*;
public class numberPosNeg {
    public static void main(String []a)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Number : ");
        n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("OUTPUT : ");
        for(int i=0;i<n;i++)
        {
            if(arr[i] > 0)
                System.out.println(arr[i] +"\nPostive");
            else if(arr[i] < 0)
                System.out.println(arr[i] +"\nNegative");
            else
                System.out.println(arr[i]+"\nZero");
        }
        sc.close();
    }
}
