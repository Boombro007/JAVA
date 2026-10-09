import java.awt.*;
import java.awt.event.*;

public class Draw_Shape extends Frame implements ItemListener {
    CheckboxGroup cbg;
    Checkbox c1,c2;
    int c = 0;
    Draw_Shape()
    {
        setSize(500,500);
        setTitle("Shape");
        setVisible(true);
        setLayout(new FlowLayout());
        cbg = new CheckboxGroup();
        c1 = new Checkbox("Rectangle",cbg,false);
        c2 = new Checkbox("Circle",cbg,false);
        add(c1);
        c1.addItemListener(this);
        add(c2);
        c2.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource() == c1)
        {
            c = 1;
        }
        else if(e.getSource() == c2)
        {
            c = 2;
        }
        repaint();
    }
    public void paint(Graphics g)
    {
        if(c == 1){
            g.drawRect(100,100,50,50);
        }
        else if(c == 2){
            g.drawOval(100,100,50,50);
        }
    }
    public static void main(String [] a)
    {
        Draw_Shape d1 = new Draw_Shape();
    }
}
