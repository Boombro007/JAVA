import java.util.*;
public class Registrationform {
    public static void main(String [] a)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu:\n1 - Student Registraction\n2 - Faculty Registraction");
        int ch;
        System.out.print("Enter Your Choice : ");
        ch = scan.nextInt(); 
        Registrationform form = new Registrationform();
        if(ch == 1)
        {
            int id;
            String name;
            float cgpa;
            System.out.print("Enter Your ID : ");
            id = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter Your Name : ");
            name = scan.nextLine(); 
            System.out.print("Enter Your CGPA : ");
            cgpa = scan.nextFloat();  
            form.StuRegi(id,name,cgpa);
        }
        else if(ch == 2)
        {
            int id;
            String name;
            Double salary;
            System.out.print("Enter Your ID : ");
            id = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter Your Name : ");
            name = scan.nextLine(); 
            System.out.print("Enter Your CGPA : ");
            salary = scan.nextDouble();  
            form.facregi(id,name,salary);
        }
        scan.close();
    }   
    public void StuRegi(int i,String n,float c)
    {
        System.out.println("==== STUDENT ====");
        System.out.println("ID   : "+i);
        System.out.println("NAME : "+n);
        System.out.println("CGPA : "+c);
        System.out.println("===============");
    }
    public void facregi(int i,String name,double s)
    {
        System.out.println("==== FACULTY ====");
        System.out.println("ID   : "+i);
        System.out.println("NAME : "+name);
        System.out.println("SALARY : "+s);
        System.out.println("===============");
    }
}