import java.util.*;
class BookList
{
    public void printDetail(String b_name,String A_name, int pages,float price)
    {
        System.out.println("=-=-=-= DETAILS =-=-=-=");
        System.out.printf("%-12s : %12s\n","BOOK NAME", b_name);
        System.out.printf("%-12s : %12s\n","AUTHOR NAME", A_name);
        System.out.printf("%-12s : %12d\n","PAGES", pages);
        System.out.printf("%-12s : %12.2f\n","PRICE", price);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
public class Classes {
    public static void main(String [] a)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        String author;
        int p;
        float pri;
        
        System.out.print("Enter Book name : ");
        name = sc.nextLine();
        System.out.print("Enter Author name : ");
        author = sc.nextLine();
        System.out.print("Enter Pages : ");
        p = sc.nextInt();
        System.out.print("Enter Price : ");
        pri = sc.nextFloat();
        
        BookList book = new BookList();
        book.printDetail(name, author, p, pri);
        sc.close();
    } 
}