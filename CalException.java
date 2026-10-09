import java.util.*;
public class CalException{
    public static void main(String []q)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int den;
        double ans;
        System.out.print("Enter Numserator and denominator : ");
        num = sc.nextInt();
        den = sc.nextInt();
        try{    
            ans = num / den;
            System.out.println("Result : "+ans);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error : You cannot divide by zero !");
        }
        finally{
            System.out.println("Calculator is shutting down.");
            sc.close();
        }
    }
}