import java.util.*;
public class SumOf
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.print("Enter Number : ");
        n = scan.nextInt();

        while(n > 0)
        {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        System.out.println("Sum of Digit : "+sum);

        scan.close();
    }
}