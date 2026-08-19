import java.awt.*;
import java.awt.event.*;

public class Cordinates extends Frame implements MouseListener 
{
    int x = 0;
    int y = 0;

    public void mouseClicked(MouseEvent e)
    {
        x = getX();
        y = getY();
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