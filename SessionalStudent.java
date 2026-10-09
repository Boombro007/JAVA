abstract class SessionalExam
{
    abstract int appearInExam();
} 
class OnlineSessionalExam extends SessionalExam
{
    public int marks = (int) (Math.random()*37);
    int appearInExam()
    {
        System.out.println("Online Exams");
        return marks;
    }    
}

class RegularSessionalExam extends SessionalExam
{
    public int marks = (int) (Math.random()*37);
    int appearInExam()
    {
        System.out.println("Regular Exams");
        return marks;
    }
}

class SessionalStudent
{
    public static void main(String [] a)
    {
        OnlineSessionalExam o1 = new OnlineSessionalExam();
        o1.appearInExam();
        System.out.println("Online Exams marks : "+ o1.marks);
        RegularSessionalExam o2 = new RegularSessionalExam();
        o2.appearInExam();  
        System.out.println("Regular Exams marks : "+ o2.marks);
    }
}