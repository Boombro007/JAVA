import java.util.Scanner;

public class NumberComb {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int ch;
        System.out.print("Menu:\n1 - Duplication of Combination \"1234\"\n2 - Non-Duplication of Combination \"1234\"\n3 - Combination of \"123\"\n4 - Non-Duplication of Combination \"123\"\n");
        ch = scan.nextInt();
        if(ch == 1)
        {
            System.out.println("=-=-=-=- Duplication of \"1234\"=-=-=-=-");
            for(int i=1;i<=4;i++)
            {
                for(int j=1;j<=4;j++)
                {
                    for(int k=1;k<=4;k++)
                    {
                        for(int l=1;l<=4;l++)
                        {
                            if(j>i && k>l)
                            {
                                System.out.println(i+""+j+""+k+""+l);
                            }
                        }
                    }
                }
            }
        }
        else if(ch == 2)
        {
            System.out.println("=-=-=-=- Non - Duplication of \"1234\"=-=-=-=-");
            for(int i=1;i<=4;i++)
            {
                for(int j=1;j<=4;j++)
                {
                    for(int k=1;k<=4;k++)
                    {
                        for(int l=1;l<=4;l++)
                        {
                            if(j>i && k>l && i!=j && j!=k && k!=l && l!=i)
                            {
                                System.out.println(i+""+j+""+k+""+l);
                            }
                        }
                    }
                }
            }
        }
        else if(ch == 3)
        {
            System.out.println("=-=-=-=- Duplication of \"123\" =-=-=-=-");
            for(int i=1;i<=3;i++)
            {
                for(int j=1;j<=3;j++)
                {
                    for(int k=1;k<=3;k++)
                    {
                        if(j>i && k>i)
                        {
                            System.out.println(i+""+j+""+k);
                        }
                    }
                }
            }
        }
        else if(ch == 4)
        {
            System.out.println("=-=-=-=- Non - Duplication of \"123\" =-=-=-=-");
            for(int i=1;i<=3;i++)
            {
                for(int j=1;j<=3;j++)
                {
                    for(int k=1;k<=3;k++)
                    {
                        if(j>i && k>i && i!=j && j!=k && k!=i)
                        {
                            System.out.println(i+""+j+""+k);
                        }
                    }
                }
            }
        }
        scan.close();
    }   
}