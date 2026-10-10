import java.util.*;
public class EndOfFile
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int line = 1;
        while(scan.hasNextLine())
        {
            String L = scan.nextLine();
            System.out.println(line + " " + L);
            line++;
        }
        scan.close();
    }
}