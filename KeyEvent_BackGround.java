import java.awt.*;
import java.awt.event.*;
public class KeyEvent_BackGround extends Frame implements KeyListener {
    int c = 0;
    KeyEvent_BackGround(){
        setSize(300,300);
        setTitle("Key Event");
        setVisible(true);
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_R){
            c = 1;
        }
        else if(e.getKeyCode() == KeyEvent.VK_G){
            c = 2;
        }
        else if(e.getKeyCode() == KeyEvent.VK_B){
            c = 3;
        }
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    public void paint(Graphics g){
        if(c == 1){
            setBackground(Color.red);
        }
        else if(c == 2){
            setBackground(Color.green);
        }
        else if(c == 3){
            setBackground(Color.blue);
        }
        repaint();
    }
    public static void main(String[] args) {
        KeyEvent_BackGround k1 = new KeyEvent_BackGround();
    }
}