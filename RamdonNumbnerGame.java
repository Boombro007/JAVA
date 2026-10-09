import java.util.Scanner;
public class RamdonNumbnerGame
{
    public static void main(String[] s)
    {
        Scanner scan = new Scanner(System.in);
        int randomnumber = (int)(Math.random() * 101); // set range of 0 to 100
        int guess;
        int Count = 0;
        while(true)
        {
            guess = scan.nextInt();
            if(guess == randomnumber)
            {
                System.out.println("You Guessed the number !!");
                System.out.println("Count : "+Count);
                break;
            }
            else if(guess > randomnumber)
            {
                System.out.println("Low your guess");
                Count++;
            }
            else if(guess < randomnumber)
            {
                System.out.println("High your guess");
                Count++;
            }
        }
        scan.close();
    }
}