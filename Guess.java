import java.awt.*;
import java.awt.event.*;
public class Guess extends Frame implements ActionListener{
    TextField t1,t2;
    Button b1;
    int randNum;
    Guess(){
        randNum = (int)(Math.random() * 101);
    
        setSize(600,600);
        setTitle("Guess the number");
        setLayout(null);

        // Input Label
        Label l1 = new Label("Input (1-100): ");
        l1.setBounds(50, 50, 100, 30);
        add(l1);
        
        // Input TextField
        t1 = new TextField("");
        t1.setBounds(160, 50, 130, 30);
        add(t1);

        // Output Label
        Label l2 = new Label("Output : ");
        l2.setBounds(50, 100, 100, 30);
        add(l2);
        
        // Output TextField
        t2 = new TextField("");
        t2.setBounds(160, 100, 180, 30);
        t2.setEditable(false); // Make the output field read-only
        add(t2);

        // Submit Button
        b1 = new Button("Submit");
        b1.addActionListener(this);
        b1.setBounds(160, 150, 130, 30);
        add(b1);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        int n = Integer.parseInt(t1.getText());
        if(e.getSource() == b1){
            if(randNum == n){
                t2.setText("You gussed the correct Number.");
            }
            else if(randNum > n){
                t2.setText("Lower your guess.");
            }
            else{
                t2.setText("Higher your guess.");
            }
        }
    }
    public static void main(String[] args) {
        new Guess();
    }
}