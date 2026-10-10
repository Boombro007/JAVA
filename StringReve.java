import java.util.Scanner;
public class StringReve {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        String a;
        a = scan.nextLine();
        String rev = new StringBuilder(a).reverse().toString();
        if(a.equals(rev))
            System.out.println("Yes");
        else
            System.out.println("No");
        scan.close();
    }
}