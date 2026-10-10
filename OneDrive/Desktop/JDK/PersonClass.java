import java.util.*;
class Person
{
    int id;
    String name;
    public void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        sc.close();
    }
    public void Print()
    {
        System.out.println("ID : "+id);
        System.out.println("NAME : "+name);
    }
}
class Student extends Person
{
    float cgpa;
    public void getdata()
    {
        super.getdata();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CGPA : ");
        cgpa = sc.nextFloat();
        sc.close();
    }
    public void Print()
    {
        super.Print();
        System.out.println("CGPA : "+cgpa);
    }
}
class Professor extends Person
{
    int publications;
    public void getdata()
    {
        super.getdata();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter publications : ");
        publications = sc.nextInt();
        sc.close();
    }
    public void Print()
    {
        super.Print();
        System.out.println("Publications : "+publications);
    }
}
public class PersonClass {
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("1 - Student\n2 - Faculty\n");
        ch = sc.nextInt();
        if(ch == 1)
        {
            Student st = new Student();
            st.getdata();
            st.Print();
        }
        else
        {
            Professor pro = new Professor();
            pro.getdata();
            pro.Print();
        }
        sc.close();
    }
}