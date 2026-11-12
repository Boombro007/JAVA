import java.awt.*;
import java.awt.event.*;

class Moving_car extends Frame implements KeyListener {
    // Starting coordinates for the car
    int x = 100;
    int y = 150;
    
    Moving_car(){
        setSize(500,500);
        setTitle("Moving Car");
        setLayout(new FlowLayout());

        // Allows the window's "X" button to actually close the program
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        
        // Tells the frame to listen to our keyboard presses
        addKeyListener(this);
        setVisible(true);
    }
    
    public void keyPressed(KeyEvent k){
        // Use getKeyCode() to check for arrow keys
        if(k.getKeyCode() == KeyEvent.VK_UP){
            y -= 10; // Move up
        }
        else if(k.getKeyCode() == KeyEvent.VK_DOWN){
            y += 10; // Move down
        }
        else if(k.getKeyCode() == KeyEvent.VK_LEFT){
            x -= 10; // Move left
        }
        else if(k.getKeyCode() == KeyEvent.VK_RIGHT){
            x += 10; // Move right
        }
     
        repaint();
    }
    
    public void keyTyped(KeyEvent k){}
    public void keyReleased(KeyEvent k){}
    
    public static void main(String[] args) {
        new Moving_car();
    }
    
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(250, 10, 10, 450);
        
        g.setColor(Color.blue);
        g.fillRect(x, y, 50, 70);
    }
}