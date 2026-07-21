import java.util.*;
public class Array2D {
    public static void main(String [] argd)
    {
        Scanner scan = new Scanner(System.in);
        int n,m;
        System.out.print("Enter n : ");
        n = scan.nextInt();
        System.out.print("Enter m : ");
        m = scan.nextInt();

        if(n == m)
        {
            int arr[][] = new int[n][m];
            int brr[][] = new int[n][m];
            int crr[][] = new int[n][m];

            System.out.print("Enter elment of array - 1 :");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    arr[i][j] = scan.nextInt();
                }
            }
            System.out.print("Enter elment of array - 2 :");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    brr[i][j] = scan.nextInt();
                }
            }

            System.out.print("\n=-=-= ADDITION =-=-=\n");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    crr[i][j] = arr[i][j] + brr[i][j];
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(crr[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("\n=-=-= MULTIPLICATION =-=-=\n");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    for(int k=0;k<n;k++)
                    {
                        crr[i][j] += arr[i][j] * brr[i][j];
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(crr[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("n != m");
        }
        scan.close();
    }
}