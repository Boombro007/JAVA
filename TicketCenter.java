import java.util.*;
public class TicketCenter {
    public static void main(String [] a)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of people : ");
        n = sc.nextInt();

        int []ages = new int[n];
        
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter age of person "+ (i+1) +" : ");
            ages[i] = sc.nextInt();
        }
        
        int totalCost = 0;
        
        for(int i=0;i<n;i++)
        {
            if(ages[i] < 12)
                totalCost += 8;
            else if(ages[i] >= 12 && ages[i] <= 64)
                totalCost += 15;
            else 
                totalCost += 10;
        }

        System.out.println("The total cost of the group is : "+totalCost);

        sc.close();
    }
}