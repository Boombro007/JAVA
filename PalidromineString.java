import java.util.Scanner;
public class PalidromineString {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        String a;
        System.out.print("Enter a string : ");
        a = scan.nextLine();
        String rev = new StringBuilder(a).reverse().toString();
        if(a.equals(rev))
            System.out.println(a+" String is Palidromine");
        else
            System.out.println(a+" String is not Palindromine");
        scan.close();
    }
}
