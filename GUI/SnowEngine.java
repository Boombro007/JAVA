import java.awt.*;
import java.awt.event.*;
import java.util.Random;

// 1. Your Blueprint (No main method needed here)
class MakingSNowFlakes {
    int x, y, speed, size;
    Random rand = new Random();

    public MakingSNowFlakes(int screenWidth, int screenHeight) {
        this.x = rand.nextInt(screenWidth);
        this.y = rand.nextInt(screenHeight);
        this.size = rand.nextInt(6) + 3;
        this.speed = rand.nextInt(5) + 2;
    }

    public void fall(int screenWidth, int screenHeight) {
        y += speed; 
        if (y > screenHeight) {
            y = 0; 
            x = rand.nextInt(screenWidth); 
            speed = rand.nextInt(5) + 2; 
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, size, size);
    }
}

// 2. The Engine (The Window and the Loop)
public class SnowEngine extends Frame implements Runnable {
    // Create an array of 100 of YOUR snowflake objects
    MakingSNowFlakes[] flakes = new MakingSNowFlakes[100];

    public SnowEngine() {
        setTitle("Winter Engine");
        setSize(800, 600);
        setBackground(Color.BLACK);
        setLayout(null);

        // Fill the array with snowflakes
        for (int i = 0; i < flakes.length; i++) {
            flakes[i] = new MakingSNowFlakes(800, 600);
        }

        Thread t = new Thread(this);
        t.start();

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void run() {
        try {
            while (true) {
                // Move every snowflake
                for (int i = 0; i < flakes.length; i++) {
                    flakes[i].fall(getWidth(), getHeight());
                }
                repaint();
                Thread.sleep(30);
            }
        } catch (InterruptedException e) {
            System.out.println("Animation stopped");
        }
    }

    public void paint(Graphics g) {
        // Draw every snowflake
        for (int i = 0; i < flakes.length; i++) {
            flakes[i].draw(g);
        }
    }

    public static void main(String[] args) {
        // Run the engine, which creates the snowflakes
        new SnowEngine();
    }
}