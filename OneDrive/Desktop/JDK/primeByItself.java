import java.util.Scanner;
public class primeByItself {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.print("Enter A number : ");
        a = scan.nextInt();
        if(a % 1 == 0 && a % a == 0 )
            System.out.println(a + " Is prime Number");
        else
            System.out.println(a + " Not a prime number");
        scan.close();
    }   
}