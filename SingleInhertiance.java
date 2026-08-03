class Shape{
    public void print()
    {
        System.out.println("Area of shape");
    }
}

class Rectangle extends Shape{
    public void print(int h,int w){
        System.out.println("Area : "+(2*h*w));
    }
}

public class SingleInhertiance {
    public static void main(String [] a)
    {
        Rectangle r1 = new Rectangle();
        r1.print();
        r1.print(3,4);
    }  
}