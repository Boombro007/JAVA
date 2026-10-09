interface ExamMarks {
   // public final static int mark = 0;
    public int s1();
    public int s2();
    public int s3();
    public int Ex();
}

public class InterfaceClass implements ExamMarks{
    public int mark;
    public int s1(){
        mark = (int)(Math.random() * 37);
        return mark;
    }
    public int s2(){
        mark = (int)(Math.random() * 37);
        return mark;
    }
    public int s3(){
        mark = (int)(Math.random() * 37);
        return mark;
    }
    public int Ex(){
        mark = (int)(Math.random() * 61);
        return mark;
    }
}

class Mark {
    public static void main(String []a)
    {
        ExamMarks e1 = new InterfaceClass();
        System.out.println("Sessional - 1 : " + e1.s1());
        System.out.println("Sessional - 2 : " + e1.s2());
        System.out.println("Sessional - 3 : " + e1.s3());
        System.out.println("External : " + e1.Ex());   
    }
}