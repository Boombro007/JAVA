import java.util.Scanner;

public class ReverseNum {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        int rev = 0;
        System.out.print("Enter a number : ");
        n = scan.nextInt();
        while(n>0)
        {
            int dig = n % 10;
            rev = (rev * 10) + dig;
            n /= 10;
        }
        System.out.println("Reversed Number : " + rev);
        scan.close();
    }
}
