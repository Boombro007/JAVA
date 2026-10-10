import java.util.*;

public class UserNameChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine(); 
        
        String[] name = new String[n];
        for(int i = 0; i < n; i++) {
            name[i] = sc.nextLine();
        }
        
        for(int i = 0; i < n; i++) {
            String currentName = name[i];
            
            boolean isValid = true; 
            
            if(currentName.length() <= 8) {
                isValid = false;
            } else {
                
                char firstChar = currentName.charAt(0);
                
                if (!(firstChar == '_' || (firstChar >= 'A' && firstChar <= 'Z') || (firstChar >= 'a' && firstChar <= 'z'))) {
                    isValid = false;
                } else {
                    for(int j = 1; j < currentName.length(); j++) {
                        char c = currentName.charAt(j);
                       
                        boolean isLetter = (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
                        boolean isNumber = (c >= '0' && c <= '9');
                        
                        if (!isLetter && !isNumber && c != '_') {
                            isValid = false;
                            break;
                        }
                    }
                }
            }
            
            if (isValid) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        
        sc.close();
    }   
}