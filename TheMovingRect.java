import java.awt.*;
import java.awt.event.*;
public class TheMovingRect extends Frame implements KeyListener{
    int x=200,y=200;
    public void keyTyped(KeyEvent k)
    {}
    public void keyPressed(KeyEvent k)
    {
        int key = k.getKeyCode();
        if(key == KeyEvent.VK_UP || key == KeyEvent.VK_W)
        {
            y -= 10; 
        }
        else if(key == KeyEvent.VK_DOWN || key == KeyEvent.VK_A)
        {
            y += 10;
        }
        else if(key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_S)
        {
            x += 10;
        }
        else if(key == KeyEvent.VK_LEFT || key == KeyEvent.VK_D)
        {
            x -=  10;
        }
        repaint();
    }
    public void keyReleased(KeyEvent k)
    {}
    TheMovingRect()
    {
        setSize(500,500);
        setTitle("The Moving Rectangle");
        setLayout(new FlowLayout());
        setVisible(true);
        addKeyListener(this);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.cyan);
        g.drawRect(x,y,10,10);
    }
    public static void main(String [] a)
    {
        TheMovingRect r1 = new TheMovingRect();
    }
}