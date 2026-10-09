import java.awt.*;
public class MovingString extends Frame implements Runnable{
    int x = 10,y = 250;
    Thread t1;
    MovingString(){
        t1 = new Thread(this);
        t1.start();
        
        setSize(500,500);
        setTitle("Moving String");
        setVisible(true);

    }   
    public void run(){
        while(true){
            while(x < 450){
                try{
                    x += 25;
                    Thread.sleep(100);
                    repaint();
                }
                catch(Exception e){}
            }
            y += 25; 
            while(x > 10){
                try{
                    x -=25;
                    Thread.sleep(100);
                    repaint();
                }
                catch(Exception e){}
            }
            y += 25;
        }
    }
    public static void main(String[] args) {
        new MovingString();
    } 
    public void paint(Graphics g){
        g.drawString("Hello", x, y);
    }
} 