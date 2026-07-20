import java.util.*;
public class CalSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        String op;

        System.out.print("Enter First Number : ");
        a = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Operator : ");
        op = scan.nextLine();
        System.out.print("Enter Second Number : ");
        b = scan.nextInt();

        switch(op)
        {
            case "+":
            {
                System.out.println("Sum : "+(a+b));
                break;
            }
            case "-":
            {
                if(a>b)
                    System.out.println("Substraction : "+(a-b));
                else
                    System.out.println("Substraction : "+(b-a));
                break;
            }    
            case "*":
            {
                System.out.println("SUbstraction : "+(a*b));
                break;
            }
            case "/":
            {
                if(b == 0)  
                    System.out.println("B = 0");
                else
                    System.out.println("SUbstraction : "+(a/b));
                break;
            }
            default:
            {
                System.out.println("INVALID!!!!!!");
                break;
            }
        }
        scan.close();
    }   
}