class Student{
    String name;
    int id;
    double cgpa;
    Student(){}
    Student(Student s)
    {
        name = s.name;
        id = s.id;
        cgpa = s.cgpa;
    }
    public void printInfo()
    {
        System.out.println("ID : "+id);
        System.out.println("NAME : "+name);
        System.out.println("CGPA : "+cgpa);        
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vyom Patel";
        s1.id = 59;
        s1.cgpa = 7.06d;

        Student s2 = new Student(s1);
        System.out.println("=-=-= S1 =-=-=");
        s1.printInfo();
        System.out.println("=-=-= S2 =-=-=");
        s2.printInfo();
    }
}