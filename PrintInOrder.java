import java.util.*;
public class PrintInOrder {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int id;
        String name;
        String department;
        float cgpa;

        System.out.print("Enter ID : ");
        id = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Name : ");
        name = scan.nextLine();
        System.out.print("Enter Department : ");
        department = scan.nextLine();
        System.out.print("Enter CGPA : ");
        cgpa = scan.nextFloat();

        PrintInOrder.Print(id,name,department,cgpa);

        scan.close();
    }   
    public static void Print(int i,String n,String d,float c)
    {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.printf("%-10s : %10s\n","NAME",n);
        System.out.printf("%-10s : %10d\n","ID",i);
        System.out.printf("%-10s : %10s\n","DEPARTMENT",d);
        System.out.printf("%-10s : %10.2f\n","CGPA",c);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}