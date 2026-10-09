import java.util.*;
public class ComplexPatterns {
    public static void main(String  args[])
    {
        Scanner scan = new Scanner(System.in);
        
        int n;
        String op;
        int choice;

        System.out.println("Menu :\n1 - Right hand Triangle\n2 - Inverted Triangle\n3 - Alphabetic Sqaure\n4 - Square Number\n5 - 2nd Alphanumeric Sqaure\n");
        System.out.print("Enter Your choice : ");
        choice = scan.nextInt();
        System.out.print("Enter number of rows : ");
        n = scan.nextInt();
        System.out.print("Enter the character to print : ");
        op = scan.next();
        
        //right hand
        if(choice == 1)
        {
            for(int i=0;i<=n;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print('*'+" ");
                }
                System.out.println();
            }
        }
        //inverted 
        else if(choice == 2)
        {
            for(int i=0;i<=n;i++)
            {
                for(int j=0;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                for(int k=0;k<=2*n-i;k++)
                {
                    System.out.print('*'+" ");
                }
                System.out.println();
            }
        }
        //aplabetic sqaure
        else if(choice == 3)
        {
            for (int i=0;i<n;i++)
            {
                char ch = 'A';
                for(int j=0;j<n;j++)
                {
                    System.out.println(ch + " ");
                    ch++;
                }
                System.out.println();
            }
            
        }
        //numeric sqaure
        else if(choice == 4)
        {
            int num = 1;
            for(int i =0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.println(num + " ");
                    num++;
                }
                System.out.println();
            }
        }
        //2nd alpha numberic
        else if(choice == 5)
        {
            char ch = 'A';
            for(int i =0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.println(ch + " ");
                    ch++;
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Invalid !!!!!");
        }
        scan.close();
    }   
}