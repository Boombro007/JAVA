import java.awt.*;
import java.awt.event.*;
public class Draw_Rectangle extends Frame implements ActionListener {
    Button b1;
    int c = 0;
    Draw_Rectangle()
    {
        setSize(500,800);
        setTitle("Draw Rectangle");
        setVisible(true);
        setLayout(new FlowLayout());
        b1 = new Button("Rectangle");
        add(b1);
        b1.addActionListener(this);
    }
    public void paint(Graphics g)
    {
        if(c == 1)
        {
            g.drawRect(350,350,200,300);
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        c = 1;
        repaint();
    }
    public static void main(String []a)
    {
        Draw_Rectangle r1 = new Draw_Rectangle();
    }
}