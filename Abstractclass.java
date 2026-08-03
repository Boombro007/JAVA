abstract class Animal{
    public void Walk(){}
}

class Horse extends Animal{
    Horse()
    {
        System.out.println("Created a horse.");
    }
    public void Walk()
    {
        System.out.println("It walks on 4 legs!!!");
    }
}

class Chicken extends Animal{
    Chicken()
    {
        System.out.println("Created a chicken.");
    }
    public void Walk()
    {
        System.out.println("It walks on 2 legs!!!");
    }
}

public class Abstractclass
{
    public static void main(String [] a)
    {
        Horse h1 = new Horse();
        h1.Walk();
        Chicken c1 = new Chicken();
        c1.Walk();
    }
}