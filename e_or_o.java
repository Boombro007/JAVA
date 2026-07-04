import java.util.Scanner;
class e_or_o
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of array : ");
        n = sc.nextInt();
        int []a = new int[n];
        int e_count = 0;
        int o_count = 0;
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i] % 2 == 0)
            {
                e_count++;
            }
            else
            {
                o_count++;
            }
        }
        System.out.println("ODD : "+o_count);
        System.out.println("EVEN : "+e_count);
    }
}