import java.util.Scanner;
class conditional
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Menu:\n1 - Simple Intrest\n2 - Max. of 2 numbers\n3 - Factorial\n4 - Eligible for driving lisence\n");
        ch = sc.nextInt();
        if(ch == 1)
        {
            double principle;
            double rate;
            double time;
            System.out.print("Enter principle : ");
            principle = sc.nextDouble();
            System.out.print("Enter rate : ");
            rate = sc.nextDouble();
            System.out.print("Enter time : ");
            time = sc.nextDouble();
            double SI = (principle * rate * time) / 100;
            System.out.println("Simple Interest : " + SI);
            System.out.println("Total Amount : " + (SI + principle));
        }
        else if(ch == 2)
        {
            int a;
            int b;
            System.out.print("Enter a number : ");
            a = sc.nextInt();
            System.out.print("Enter second number : ");
            b = sc.nextInt();
            if(a > b)
            {
                System.out.println(a + " is greater than "+b);
            }
            else if(a < b)
            { 
                System.out.println(a + " is less than "+b);
            }
            else
            {
                System.out.println(a + " are equal " + b);
            }
        }
        else if(ch == 3)
        {
            int fact = 1;
            int n;
            System.out.print("Enter a number to find factorial : ");
            n = sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                fact *= i;
            }
            System.out.println("Factorial of "+n+" is "+fact);
        }
        else if(ch == 4)
        {
            int age;
            System.out.print("Enter your age : ");
            age = sc.nextInt();
            if(age < 18)
            {
                System.out.println("Not eligible for driving lisence");
            }
            else if(age >= 18 && age <= 100)
            {
                System.out.println("Yes you are eligible for driving lisecnce");
            }
            else
            {
                System.out.println("ERRORRRRR!!!!");
            }
        }
        else
        {
            System.out.println("INVALID OPTION!!!!");
        }
    }
}