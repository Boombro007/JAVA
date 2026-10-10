import java.util.*;
public class StringBasic
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        //Took the input for both the strings

        System.out.println((A.length()) + (B.length()));
        // this prints the sum of both strings length

        if(A.compareTo(B) > 0)
            System.out.println("Yes");
        else    
            System.out.println("No");
        //compares weather the string A is not greater than B

        String capA = A.substring(0,1).toUpperCase() + A.substring(1);
        String capB = B.substring(0,1).toUpperCase() + B.substring(1);
        //this above inbulit function of string helps to capatilize the first letter of the given string
        //the first substring gets the first letter and convert it to upper case and then concarte it with the rest
        
        System.out.println(capA + " " + capB);
        //this prints the both chnaged string by a space

        scan.close();
    }
}