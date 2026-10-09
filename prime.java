import java.util.Scanner;
class prime
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a prime number : ");
        n = sc.nextInt();
        int i =2;
        boolean isPrime = true;
        if(n <= 1)
        {
            isPrime = false;
        }
        while(i < n && isPrime)
        {
            if(n % i == 0)
            {
                isPrime = false;
            }
            i++;
        }
        if(isPrime)
        {
            System.out.println(n + " Is a Prime Number.");
        }
        else
        {
            System.out.println(n + " Is not a prime number.");
        }
    }
}