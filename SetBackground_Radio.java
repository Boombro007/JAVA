import java.awt.*;
import java.awt.event.*;
public class SetBackground_Radio extends Frame implements ItemListener {
    CheckboxGroup cbg;
    Checkbox c1,c2;
    int c = 0;
    SetBackground_Radio()
    {
        setSize(500,800);
        setTitle("Radio Shapes");
        setVisible(true);
        setLayout(new FlowLayout());
        cbg = new CheckboxGroup();
        c1 = new Checkbox("Red",cbg,false);
        c2 = new Checkbox("Blue",cbg,false);
        add(c1);
        c1.addItemListener(this);
        add(c2);
        c2.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource() == c1)
        {
            setBackground(Color.red);
        }
        else if(e.getSource() == c2)
        {
            setBackground(Color.blue);
        }
    }
    public static void main(String []a)
    {
        SetBackground_Radio r1 = new SetBackground_Radio();
    }
}
