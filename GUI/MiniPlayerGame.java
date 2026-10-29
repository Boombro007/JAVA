import java.awt.*;
import java.awt.event.*;
public class MiniPlayerGame extends Frame implements KeyListener {
    int x = 250,y = 250;
    MiniPlayerGame(){
        setSize(500,500);
        setTitle("Player");
        setLayout(new FlowLayout());
        setBackground(Color.BLUE);

        addKeyListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void keyPressed(KeyEvent k){
        if(k.getKeyCode() == KeyEvent.VK_UP){
            y -= 10;
        }
        else if(k.getKeyCode() == KeyEvent.VK_DOWN){
            y += 10;
        }
        else if(k.getKeyCode() == KeyEvent.VK_LEFT){
            x -= 10;
        }
        else if(k.getKeyCode() == KeyEvent.VK_RIGHT){
            x += 10;
        }
        repaint();
    }
    public void keyReleased(KeyEvent k){}
    public void keyTyped(KeyEvent k){}

    public static void main(String [] a){
        new MiniPlayerGame();
    }

    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillOval(x,y,10,10);
    }
}