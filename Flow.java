import java.awt.*;
public class Flow extends Frame{
    Flow()
    {
        setTitle("Flow Layout");
        setSize(1000,1000);
        setVisible(true);
        setLayout(new FlowLayout());
        Button b1 = new Button("SUBMIT");
        Button b2 = new Button("Jay Swaminaryan");
        add(b1);
        add(b2);
        Checkbox c1 = new Checkbox("Male");
        add(c1);
    }
    public static void main(String[] args) {
        Flow f1 = new Flow();
    }
}