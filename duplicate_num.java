import java.util.Scanner;
class duplicate_num
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of array : ");
        n = sc.nextInt();
        int []a = new int [n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int d_count = 0;

        //This code is for counting duplicates
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=1+i;j<n;j++)
        //     {
        //         if(a[i] == a[j])
        //         {
        //             d_count++;
        //             break;
        //         }
        //     }
        // }

        //for removing duplicates
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i] == a[j])
                {
                    for(int k = j;k<n-1;k++)
                    {
                        a[k] = a[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        System.out.print("After removing duplicates : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
}