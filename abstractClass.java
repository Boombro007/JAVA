import java.util.*;
abstract class Sum
{
    int a;
    public void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        a =sc.nextInt();
        sc.close();
    }
    abstract public void Print();
}
class DetaPrint extends Sum
{
    public void Print()
    {
        System.out.println("Cube : "+(a^3));
    }
}
class abstractClass
{
    public static void main(String [] a)
    {
        DetaPrint pri = new DetaPrint();
        pri.getdata();
        pri.Print();
    }
}