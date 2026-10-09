class Stud{
    String name;
    int id;
    int []marks = new int[6];
    int total;
    double per;
    Stud(String name,int id)
    {
        this.name = name;
        this.id = id;
        System.out.println("NAME : "+name);
        System.out.println("ID : "+id);
    }
    Stud(){}
    public void result(int ar)
    {
        System.out.println("OBTAINED MARKS : "+ar);
        System.out.println("TOTAL MARKS : 600");
    }
    public void result()
    {
        per = (total * 100) / 600;
        System.out.println("PERCENTAGE : "+per);
    }
}

public class MethodOverloading {
    public static void main(String [] a){
        Stud d1= new Stud("Vyom Patel",59);
        d1.result(510);
        d1.result();
    }
}