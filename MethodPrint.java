import java.util.*;
public class MethodPrint
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        String ch;
        System.out.print("Enter size : ");
        n = scan.nextInt();
        System.out.print("Enter Character : ");
        ch = scan.next();
        MethodPrint.PrintL(n,ch);
        scan.close();
    }
    public static void PrintL(int len,String s)
    {
        for(int i=0;i<len;i++)
        {
            System.out.print(s);
        }
    }
}