class Product{
    int id;
    String name;
    public double price;
    int total=0;
    Product(){}
    Product(int id,String name,double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    void Printdetails()
    {
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Price : "+price);
    }
    public static void calculateTotal(Product[] products)
    {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        System.out.println("Total price : " + total);
    }
}

public class ArrayOfObject 
{ 
    public static void main(String []a) 
    {
        Product []p = new Product[5];
        p[0] = new Product(10,"PS5",45000);
        p[1] = new Product(15,"GTA6",2500);
        p[2] = new Product(21, "MaxTech", 2500);
        p[3] = new Product(22, "OnePlus Nord 5", 38000);
        p[4] = new Product(25, "LofiTech Mouse", 4500);

        for(int i=0;i<5;i++)
        {
            p[i].Printdetails();
        }
        
        Product.calculateTotal(p);
    }  
}