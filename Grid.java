import java.awt.*;
public class Grid extends Frame{
    Grid() 
    {
        setSize(900,700);
        setTitle("Grid Layout");
        setVisible(true);
        setLayout(new GridLayout(5,2));
        
        Label l1 = new Label("Name : ");
        Label l2 = new Label("Address : ");
        Label l3 = new Label("Hobbies : ");
        Label l4 = new Label("Moblie no : ");
        
        TextField t1 = new TextField();
        TextArea t2 = new TextArea();
        TextField t3 = new TextField();

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);

        Panel p1 = new Panel();
        Checkbox c1 = new Checkbox("Cricket");
        Checkbox c2 = new Checkbox("Reading");
        p1.setLayout(new FlowLayout());
        p1.add(c1);
        p1.add(c2);

        add(p1);
        add(l4);
        add(t3);
    }  
    public static void main(String []a)
    {
        Grid g1 = new Grid(); 
    }
}