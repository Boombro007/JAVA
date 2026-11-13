import java.util.*;

public class StringComppressor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        
        // Safety check: if the user just hits Enter without typing anything
        if (s.isEmpty()) {
            sc.close();
            return;
        }
        
        // Convert to lowercase so 'A' and 'a' are counted together
        s = s.toLowerCase();
        
        int count = 1;
        
        // Loop through the string up to the second-to-last character
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                // Characters match, increase the streak
                count++;
            } else {
                // Streak is broken! Print the character and its count
                System.out.print(s.charAt(i) + "" + count);
                // Reset count for the new character
                count = 1;
            }
        }   
        
        // Print the very last character and its final count outside the loop
        System.out.print(s.charAt(s.length() - 1) + "" + count);
        System.out.println(); // Just adds a clean new line at the end
        
        sc.close();
    }
}