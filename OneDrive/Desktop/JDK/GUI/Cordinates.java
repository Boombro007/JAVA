import java.awt.*;
import java.awt.event.*;

public class Cordinates extends Frame implements MouseListener 
{
    int x = 0;
    int y = 0;
    Cordinates()
    {
        setSize(300,300);
        setTitle("Coordinates");
        setVisible(true);
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        repaint();
    }
    public void mousePressed(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void paint(Graphics g)
    {
        String  str = x+","+y;
        g.drawString(str, x, y);
    }
    public static void main(String[] args) {
        Cordinates c1 = new Cordinates();
    }
}