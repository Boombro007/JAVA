import java.util.Scanner;
public class CalCulator {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int a,b;
        System.out.print("Enter Opertaion : ");
        String op;
        op = scan.nextLine();
        System.out.print("Enter First Number : ");
        a = scan.nextInt();
        System.out.print("Enter second Number : ");
        b = scan.nextInt();
        

       if(op.equals("+"))
        {
            System.out.println("Sum : "+(a+b));
        }
        else if(op.equals("-"))
        {
            if(a > b)
            {
                System.out.println("SUbstraction : "+(a-b));
            }
            else
            {
                System.out.println("Substraction : "+(b-a));
            }
        }
        else if(op.equals("*"))
        {
            System.out.println("Multilplication : "+(a*b));
        }
        else if(op.equals("/"))
        {
            if(b != 0)
            {
                System.out.println("Division : "+(a/b));
            }
            else
            {
                System.out.println("b == 0");
            }
        }
        else if(op.equals("%"))
        {
            System.out.println("Remainder : "+(a%b));
        }
        else
        {
            System.out.println("Invalid case");
        }
    }

    @Override
    public String toString() {
        return "CalCulator []";
    }   
}