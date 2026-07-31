import java.util.*;
public class ThreeNumberAvg
{
    public static void printAvg(int n1,int n2,int n3)
    {
        int avg;
        avg = n1+n2+n3;
        System.out.println("Average of 3 number : "+avg / 3);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter Three Number : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        printAvg(a, b, c);
        sc.close();
    }
}