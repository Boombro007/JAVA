import java.util.Scanner;
class sortingArray
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter Number of Array : ");
        n = sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Before : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(" " +a[i]);
        }
        System.out.println(" ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i] < a[j])
                {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            } 
        }
        System.out.print("After sorting : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+ a[i]);
        }
        System.out.println(" ");
        // int l = a.length;
        System.out.println("Minimum : "+a[0]);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i] > a[j])
                {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            } 
        }
        System.out.println("Maximum : "+a[0]);
    }
}