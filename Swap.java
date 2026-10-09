import java.util.Scanner;
public class Swap {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        System.out.print("Enter A number : ");
        a = scan.nextInt();//a = 3
       
        System.out.print("Enter B number : ");
        b = scan.nextInt();//b = 4
        
        System.out.println("Before : A = "+a+",B = "+b);
        a = a ^ b;//a = 3 ^ 4
        b = a ^ b;//b = 3 
        a = a ^ b;//a = 4
        System.out.println("After : A = "+a+",B = "+b);
    }
}