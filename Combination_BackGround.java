import java.awt.*;
import java.awt.event.*;
public class Combination_BackGround extends Frame implements ItemListener{
    Checkbox c1,c2,c3;
    Combination_BackGround()
    {
        setSize(400,400);
        setTitle("Combination Background");
        setVisible(true);
        setLayout(new FlowLayout());
        c1 = new Checkbox("Red");
        c2 = new Checkbox("Blue");
        c3 = new Checkbox("Green");
        add(c1);
        c1.addItemListener(this);
        add(c2);
        c2.addItemListener(this);
        add(c3);
        c3.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
    {
        int r = c1.getState() ? 255 : 0;
        int b = c2.getState() ? 255 : 0;
        int g = c3.getState() ? 255 : 0;

        Color comb = new Color(r,g,b);
        setBackground(comb);
    }
    public static void main(String [] a)
    {
        Combination_BackGround b1 = new Combination_BackGround();
    }
}
