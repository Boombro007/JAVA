import java.awt.*;
import java.awt.event.*;

public class MiniPainter extends Frame implements MouseListener, ActionListener {
    // Fixed variable declarations (added x2, removed unused y3)
    int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
    int c = 0;
    Button r, b, g;

    MiniPainter() {
        setTitle("Line Printer");
        setSize(500, 500);
        setLayout(new FlowLayout()); 

        // Fixed Button Labels
        r = new Button("Red");
        r.addActionListener(this);
        add(r);

        b = new Button("Blue");
        b.addActionListener(this);
        add(b);

        g = new Button("Green");
        g.addActionListener(this);
        add(g);

        // MUST register the mouse listener so the Frame detects clicks!
        addMouseListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        
        setVisible(true); // Best practice: put this at the end of constructor
    }

    public void mousePressed(MouseEvent m) {
        x1 = m.getX();
        y1 = m.getY(); // Fixed: was previously m.getX()
    }

    public void mouseReleased(MouseEvent m) {
        x2 = m.getX();
        y2 = m.getY();
        repaint(); // Fixed: Ask the screen to update and draw the line!
    }

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == r) {
            c = 1;
        } else if (a.getSource() == b) {
            c = 2;
        } else if (a.getSource() == g) {
            c = 3;
        }
        // Repaint is optional here unless you want the line to change color immediately 
        // after clicking a button, but it's fine to leave it.
        repaint();
    }

    public void mouseEntered(MouseEvent m) {}
    public void mouseExited(MouseEvent m) {}
    public void mouseClicked(MouseEvent m) {}

    public void paint(Graphics graphicsObj) { // Renamed parameter to avoid shadowing Button g
        if (c == 1) {
            graphicsObj.setColor(Color.RED); // Fixed COLOR to Color
            graphicsObj.drawLine(x1, y1, x2, y2);
        } else if (c == 2) {
            graphicsObj.setColor(Color.BLUE);
            graphicsObj.drawLine(x1, y1, x2, y2);
        } else if (c == 3) {
            graphicsObj.setColor(Color.GREEN);
            graphicsObj.drawLine(x1, y1, x2, y2);
        }
    }

    public static void main(String[] a) {
        new MiniPainter();
    }
}