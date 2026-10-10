import java.awt.*;
import java.awt.event.*;

public class menulist extends Frame implements ActionListener 
{
    MenuBar mb;
    Menu L;
    MenuItem r,y,g;
    int c = 0;
    menulist()
    {
        setSize(500,900);
        setTitle("Menu");
        setVisible(true);
        setLayout(new FlowLayout());
        mb = new MenuBar();
        setMenuBar(mb);
        L = new Menu("Light");
        mb.add(L);
        r = new MenuItem("Red");
        y = new MenuItem("Yellow");
        g = new MenuItem("Green");
        L.add(r);
        r.addActionListener(this);
        L.add(y);
        y.addActionListener(this);
        L.add(g);
        g.addActionListener(this);
    }
    public void actionPerformed(ActionEvent w)
    {
        if(w.getSource() == r)
        {
            c = 1;
        }
        else if(w.getSource() == y)
        {
            c = 2;
        }
        else if(w.getSource() == g)
        {
            c = 3;
        }
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawRect(100, 150, 200, 600);
        g.drawOval(100,150,200,200);
        g.drawOval(100,350,200,200);
        g.drawOval(100,550,200,200);
        g.setColor(Color.black);
        g.fillRect(100,150,200,600);
        if(c == 1)
        {
            g.setColor(Color.red);
            g.fillOval(100,150,200,200);
        }
        else if(c == 2)
        {
            g.setColor(Color.yellow);
            g.fillOval(100,350,200,200);
        }
        else if(c == 3)
        {
            g.setColor(Color.green);
            g.fillOval(100,550,200,200);
        }
    }
    public static void main(String[] args) {
        menulist m1 = new menulist();
    }    
}
