import java.util.*;
public class ArrayMerge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        int m;
        int p;

        System.out.print("Enter Size of array - 1 : ");
        n = scan.nextInt();
        System.out.print("Enter Size of array - 2 : ");
        m = scan.nextInt();

        p = m + n;
        int arr[] = new int [n];
        int brr[] = new int [m];
        int crr[] = new int [p];
        
        System.out.println("Enter element of array - 1 :");
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter element of array - 2 :");
        for(int i=0;i<m;i++)
        {
            brr[i] = scan.nextInt();
        }

        // System.out.println("Enter element of array - 1 :");
        for(int i=0;i<n;i++)
        {
            crr[i] = arr[i];
        }
        for(int i=0;i<m;i++)
        {
            crr[n+i] = brr[i];
        }

        System.out.println("Merged array : ");
        for(int i=0;i<p;i++)
        {
            System.out.print(crr[i] + " ");
        }
        System.out.println();

        for(int i=0;i<p;i++)
        {
            for(int j=0;j<p;j++)
            {
                if(crr[i] < crr[j])
                {
                    int t = crr[i];
                    crr[i] = crr[j];
                    crr[j] = t;
                }
            }
        }
        //Arrays.sort(array);

        System.out.println("Sortted array : ");
        for(int i=0;i<p;i++)
        {
            System.out.print(crr[i] + " ");
        }
        System.out.println();
        scan.close();
    }   
} 