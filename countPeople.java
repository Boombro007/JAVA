import java.util.Scanner;
class countPeople
{
    public static void main(String [] args)
    {
        int peopleinRoom = 0;
        int n;
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu:\n1 - Entered\n2 - Exited\n3 - Display\n");
            n = sc.nextInt();
            if(n == 1)
            {
                peopleinRoom++;
            }
            else if(n == 2)
            {
                peopleinRoom--;
            }
            else if(n == 3)
            {
                System.out.println("Total people : "+ peopleinRoom);
                break;
            }
            else
            {
                break;
            }
        }
    }
}