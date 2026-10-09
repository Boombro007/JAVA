import java.util.Scanner;

// import javax.print.DocFlavor.STRING;
public class UserLog {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String username = "Admin";
        String password = "Admin.0707";
        String u_name;
        String P_name;
        while(true)
        {
            System.out.print("Enter username : ");
            u_name = sc.nextLine();
            System.out.print("Enter password : ");
            P_name = sc.nextLine();
            if(username .equals(u_name) && password.equals(P_name))
            {
                System.out.println("Access Granted!!");
                break;
            }
            else if(username != u_name && password != P_name)
            {
                System.out.println("Check your Username or Password");
            }
        }
    }
}
