import java.util.*;

class stud
{
    int roll_no;
    String name;
    int marks[] = new int[4];
    public void Detail()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll no. : ");
        roll_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks of 4 - subject : ");
        for(int i=0;i<4;i++)
        {
            marks[i] = sc.nextInt();
        }
        sc.close();
    } 
}

class result extends stud
{
    int sum = 0;
    public void Print()
    {
        for(int i=0;i<4;i++)
        {
            sum += marks[i];
        }    
        double per = (sum * 100) / 144; 
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("ROLL NO : "+roll_no);
        System.out.println("NAME : " +name);
        System.out.println("OBTAINED MARKS : "+sum);
        System.out.println("TOTAL MARKS : 144");
        System.out.println("PERCENTAGE : "+per);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
    }
}

public class StudentResult {
    public static void main()
    {
        result res = new result();
        res.Detail();
        res.Print();
    }
}