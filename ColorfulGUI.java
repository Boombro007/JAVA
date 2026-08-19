import java.awt.*;
import java.awt.event.*;

class ColorfulGUI extends Frame implements MouseListener
{
    ColorfulGUI()
    {
        setSize(900, 700);
        setTitle("ColourFul");
        addMouseListener(this);
        setVisible(true); 
    }
    
    public void mouseClicked(MouseEvent e)
    {
        setBackground(Color.red);
    }
    
    public void mousePressed(MouseEvent e)
    {
        setBackground(Color.cyan);
    }
    
    public void mouseEntered(MouseEvent e)
    {
        setBackground(Color.green);
    }
    
    public void mouseExited(MouseEvent e)
    {
        setBackground(Color.yellow);
    }
    
    public void mouseReleased(MouseEvent e)
    {
        setBackground(Color.blue);
    }
    
    public static void main(String[] args) {
        ColorfulGUI c1 = new ColorfulGUI();
    }
}