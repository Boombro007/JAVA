import java.util.*;
public class EmailChecker
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  email;
        
        System.out.print("Enter your email : ");
        email = scan.nextLine();
        
        int at = email.indexOf("@");
        boolean numberPresent = email.matches(".*\\d.*");
        String name = email.substring(at,at+1);
        int size = email.length();
        String domain = email.substring(at,size);

        System.out.println("\t Errors \t");
        if(at < 8)
        {
            System.out.println("enter 8 characters,number,special symbols");
        }
        if(!numberPresent)
        {   
            System.out.println("Please Enter a number!!!");
        }
        if(domain != "gmail.com" || domain != "yahoo.com" || domain != "icloud.com")
        {
            System.out.println("Enter correct domain name!!!!");
        }
        else
        {
            System.out.println("No errors !!!!");
        }
        scan.close();
    }
}