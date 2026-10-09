import java.util.*;

// import javax.lang.model.util.ElementScanner14;
public class GradeSystem {
    public static void main(String [] a)
    {
        Scanner scan = new Scanner(System.in);
        int marks;
        String grade;

        System.out.print("Enter Marks : ");
        marks = scan.nextInt();

        if(marks >= 90)
            grade = "A";
        else if(marks >= 71 && marks <= 80)
            grade = "B";
        else if(marks >= 61 && marks <= 70)
            grade = "C";
        else if(marks >= 51 && marks <= 60)
            grade = "D";
        else if(marks >= 41 && marks <= 50)
            grade = "E";
        else
            grade = "F";

        System.out.println("Marks : "+marks);
        System.out.println("Grade : "+grade);
        
        scan.close();
    }   
}