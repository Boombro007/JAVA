import java.util.*;
public class TowerOfHanoi {
    public static void moveDisks(int n,char fromTower,char toTower,char auxTower)
    {
        if(n==1)
        {
            System.out.println("Move disk "+n+" from "+fromTower+" to "+toTower);
        }
        else
        {
            moveDisks(n-1,fromTower,auxTower,toTower);
            System.out.println("Move disk "+n+" from "+fromTower+" to "+toTower);
            moveDisks(n-1,fromTower,auxTower,toTower);
        }
    }       
    public static void main(String []a)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of disk : ");
        int diskCount = sc.nextInt();
        System.out.println("The moves are : ");
        moveDisks(diskCount,'A','B','C');
        sc.close();
    }
}