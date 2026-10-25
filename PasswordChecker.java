import java.util.*;
public class PasswordChecker {
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        
        String uname,password;
        System.out.println("Enter username : ");
        uname = sc.nextLine();

        System.out.println("Enter password : ");
        password = sc.nextLine();

        boolean passl = false;
        boolean checks = false;

        if(password.length() >= 8){
            passl = true;
        }

        for(int i=0;i<password.length();i++){
            if(password[i] == '@' || password[i] == '#' || password[i] == '$'){
                checks = true;
            }
        }

        if(passl && checks){
            System.out.println("Length of password is : " + pass.length());
            System.out.println("Your password have a different sign.");
            System.out.print("Current Password is : ");
            for(int i=0;i<password.length();i++){
                if(password[i] == '@' || password[i] == '#' || password[i] == '$'){
                    password[i] = '*';
                }
            }
            System.out.println(password);
        }
        else{
            System.out.println("Check your password.\nRequirements are :\n1. Length should be 8 or more\n2. SHould contain special characters.");
        }

        sc.close();
    }
}