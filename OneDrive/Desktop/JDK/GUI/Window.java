import java.awt.*;
import java.awt.event.*;
class Window extends Frame implements WindowListener
{
    public void windowActivated(WindowEvent w)
    {}
    public void windowDeactivated(WindowEvent w)
    {}
    public void windowIconified(WindowEvent w)
    {}
    public void windowDeiconified(WindowEvent w)
    {}
    public void windowOpened(WindowEvent w)
    {}
    public void windowClosed(WindowEvent w)
    {}
    public void windowClosing(WindowEvent w)
    {}
    public static void main(String []a)
    {
        Window w1 = new Window();
    }
}