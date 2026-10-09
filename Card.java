import java.awt.*;
public class Card extends Frame{
    Card()
    {
        setSize(300,400);
        setTitle("Card Layout");
        CardLayout c1 = new CardLayout();
        setLayout(c1);

        Panel p1 = new Panel();
        Panel p2 = new Panel(); 
        
        Button b1 = new Button("P1");
        Button b2 = new Button("P2");

        p1.add(b1);
        p2.add(b2);

        add(p1,"card 1");
        add(p2,"Card 2");
        c1.show(this,"card 1");
        c1.show(this,"Card 2");
        // one card is visible at a time //
        setVisible(true);
    }
    public static void main(String[] args) {
        Card c = new Card();
    }
}