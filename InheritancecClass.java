class Registration
{
    int id;
    String name;
    float cgpa;
    Registration(int i,String n,float c)
    {
        id = i;
        name = n;
        cgpa = c;
    }
}
class Student extends Registration
{
    Student(int i,String n,float c)
    {
        super(i,n,c);
    }
    public void Print() 
    {
        System.out.println("==== STUDENT ====");
        System.out.println("ID   : "+id);
        System.out.println("NAME : "+name);
        System.out.println("CGPA : "+cgpa);
        System.out.println("=================");
    }
}
public class InheritancecClass{
    public static void main(String [] a)
    {
        Student stud1 = new Student(59,"Vyom Patel",7.05f);
        stud1.Print();
    }
}