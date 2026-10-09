import java.awt.*;
public class CardProblem extends Frame {
    CardProblem()
    {
        setSize(900,700);
        setTitle("Card Problem");
        
        CardLayout c1 = new CardLayout();  // new card layout
        setLayout(new BorderLayout()); // created an borderlayout
        
        Button b1 = new Button("North"); // button for north
        add(b1,BorderLayout.NORTH);
        Button b2 = new Button("East"); // button for east
        add(b2,BorderLayout.EAST);
        
        Panel cardPanel = new Panel(); // creted a panel
        CardLayout cardLayout = new CardLayout(); // another card layout
        cardPanel.setLayout(cardLayout); // set a layout of thr panel card layout
        
        Button firstCard = new Button("This is Card 1 (Center)");
        Button secondCard = new Button("This is Card 2 (Center)");
        
        cardPanel.add(firstCard, "Card 1"); // added button 1
        cardPanel.add(secondCard, "Card 2"); // added button 2
        
        add(cardPanel, BorderLayout.CENTER); // added the panel in borderlayout to center
        
        cardLayout.show(cardPanel, "Card 1");// showed the card 1 or button 1
        
        setVisible(true);
    }    
    public static void main(String[] args) {
        CardProblem c1 = new CardProblem(); 
    }
}