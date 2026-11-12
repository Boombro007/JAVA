import java.awt.*;
import java.awt.event.*;

class Moving_car extends Frame implements KeyListener {
    Moving_car(){
        setSize(500,500);
        setTitle("Moving Car");
        setLayout(new FlowLayout());

        

        setVisible(true);
    }
    public void keyPressed(KeyEvent k){}
    public void keyTyped(KeyEvent k){}
    public void keyReleased(KeyEvent k){}
    public static void main(String[] args) {
        new Moving_car();
    }
}