import java.awt.*;
class CheckList extends Frame{
    CheckList(){
        setVisible(true);
        setSize(300,300);
        // 1. Create a list (4 specifies the number of visible rows initially)
    List subjectList = new List(4, true); // 'true' allows selecting multiple items
    subjectList.add("Data Structures");
    subjectList.add("Web Development");
    subjectList.add("Database Management");
    subjectList.add("Computer Networks");

    // 2. Set position (Notice the larger height of 100 to fit the list)
    subjectList.setBounds(160, 200, 200, 100); 
    add(subjectList);
    }
    public static void main(String []a){
        CheckList c1 = new CheckList();
    }
}