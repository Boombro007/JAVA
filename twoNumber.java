import java.util.*;
public class twoNumber {
    public static int compareTwo(int n1,int n2)
    {
        if(n1 > n2)
            return n1;
        else
            return n2;
    }
    public static void main(String [] a)
    {
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.print("Enter Number - 1 :");
        n = sc.nextInt();
        System.out.print("Enter Number - 2 :");
        m = sc.nextInt();
        System.out.println("The biggest number is : "+compareTwo(n,m));
        sc.close();
    }   
}