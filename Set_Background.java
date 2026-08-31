import java.awt.*;
import java.awt.event.*;
public class Set_Background extends Frame implements ActionListener {
    Button c1,c2;
    Set_Background()
    {
        setSize(500,300);
        setTitle("BackGround");
        setVisible(true);
        setLayout(new FlowLayout());
       
        c1 = new Button("Red");
        c2 = new Button("Blue");
        add(c1);
        c1.addActionListener(this);
        c2.addActionListener(this);
        add(c2);
    }
    public void actionPerformed(ActionEvent e)
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
    public static void main(String [] a)
    {
        Set_Background s1 = new Set_Background();
    }
}