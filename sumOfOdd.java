import java.util.*;
public class sumOfOdd {
    public static int printOddNum(int n)
    {
        int sum = 0;
        for(int i=0;i<=n;i++)
        {
            if(i % 2 != 0)
            {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String [] a)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number : ");
        n = sc.nextInt();
        System.out.println("Sum of Odd number : "+printOddNum(n));
        sc.close();
    }
}