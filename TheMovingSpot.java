import java.awt.*;
import java.awt.event.*;
public class TheMovingSpot extends Frame implements MouseListener {
    int x = 200 ,y = 200;
    TheMovingSpot()
    {
        setSize(500,500);
        setTitle("The Moving Spot");
        setLayout(new FlowLayout());
        addMouseListener(this);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e)
    {
        x = e.getX() - 25;
        y = e.getY() - 25;
        repaint();
    }
    public void mouseReleased(MouseEvent e)
    {}
    public void mousePressed(MouseEvent e)
    {}
    public void mouseEntered(MouseEvent e)
    {}
    public void mouseExited(MouseEvent e)
    {}
    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.drawOval(x,y,50,50);
    }
    public static void main(String [] a)
    {
        TheMovingSpot t1 = new TheMovingSpot();
    }   
}