import java.awt.*;
import java.awt.event.*;

public class CharacterCounter extends Frame implements ActionListener {
    TextArea t1;
    TextField t2; // Fixed spelling
    Button b1;

    CharacterCounter() {
        setSize(500, 500);
        setTitle("Character Counter");
        setLayout(null);

        Label l1 = new Label("Enter Text : ");
        l1.setBounds(50, 50, 100, 30); // Adjusted coordinates so they don't overlap
        add(l1);

        t1 = new TextArea("");
        t1.setBounds(150, 50, 200, 100);
        add(t1);

        b1 = new Button("Count");
        b1.addActionListener(this);
        b1.setBounds(150, 170, 100, 30);
        add(b1);

        Label l2 = new Label("Characters : ");
        l2.setBounds(50, 220, 100, 30);
        add(l2);

        t2 = new TextField("");
        t2.setEditable(false);
        t2.setBounds(150, 220, 100, 30);
        add(t2);

        // Good practice: make visible after adding all components
        setVisible(true);
        
        // Allows the window to be closed
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String n = t1.getText();
            // No need for a loop or static variables, just use length()
            int count = n.length(); 
            t2.setText(String.valueOf(count));
        }
    }

    public static void main(String[] a) {
        new CharacterCounter();
    }
}