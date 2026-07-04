import java.util.Scanner;
class suavg
{
    public static void main(String [] args)
    {
        int sum = 0;
        int n;
        int avg;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        n = sc.nextInt();
        System.out.print("Enter Second number : ");
        int m;
        m = sc.nextInt();
        int o = n + m;
        System.out.println("Sum : " + o); // prints : sum
        //or 
        System.out.println("Sum : "+ (n+m));// also print as above but if 
        //you don't use any braces the would print both number as a strings.
        int n1;
        System.out.print("Enter number of array : ");
        n1 = sc.nextInt();
        int [] a = new int[n1];
        for(int i=0;i<3;i++)
        {
            a[i] = sc.nextInt();
            System.out.print(" " +a[i]);
        }
    }
}