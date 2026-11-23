import java.awt.*;
import java.awt.event.*;
public class SquareColored extends Frame implements ItemListener {
    int r = 0,g = 0,b = 0;
    Checkbox c1,c2,c3;
    SquareColored(){
        setSize(500,500);
        setTitle("Coloring yourself");

        setLayout(new FlowLayout());

        c1 = new Checkbox("Red");
        c2 = new Checkbox("Blue");
        c3 = new Checkbox("Green");

        add(c1);
        add(c2);
        add(c3);

        
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);  

        setVisible(true);
    }
    public void itemStateChanged(ItemEvent e){
        r = c1.getState() ? 255 : 0;
        g = c3.getState() ? 255 : 0;
        b = c2.getState() ? 255 : 0;

        repaint();
    }
    public static void main(String []a){
        new SquareColored();
    } 
    public void paint(Graphics g){
        g.setColor(new Color(r,this.g,b));
        g.fillRect(200,250,100,100);
    }
}