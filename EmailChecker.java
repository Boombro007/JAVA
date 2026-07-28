import java.util.*;
public class EmailChecker
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  email;
        
        System.out.print("Enter your email : ");
        email = scan.nextLine();
        
        int at = email.indexOf("@");
        String name = email.substring(at,at+1);
        int size = email.length();
        String domain = email.substring(at,size);
        
        if(at < 8)
        {
            System.out.println("enter 8 characters,number,special symbols");
        }
        scan.close();
    }
}