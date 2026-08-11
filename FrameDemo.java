import java.awt.*;
public class FrameDemo extends Frame {
    public FrameDemo()
    {
        setSize(500,500);
        setTitle("GUI");
        setVisible(true);
    }   
    public static void main(String []a)
    {
        FrameDemo f1 = new FrameDemo();
    }
    public void paint(Graphics g)
    {
        g.drawString("Hello I am Krirish",50,50);
        g.drawRect(200,200,100,100);
        g.setColor(Color.red);
        g.fillRect(200, 200, 100, 100);
        g.drawOval(200,200,100,100);
        g.setColor(Color.white);
        g.fillOval(200, 200, 100, 100);
        g.drawOval(200,200,10,10);
        g.setColor(Color.black);
        g.fillOval(200, 200, 10, 10);
    }
}