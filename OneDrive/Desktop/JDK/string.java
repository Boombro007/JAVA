import java.util.Scanner;
class string
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter a string : ");
        s = sc.nextLine();
        System.out.println(s);
        System.out.print("Length of string : " + s.length());
        sc.close();
    }
}