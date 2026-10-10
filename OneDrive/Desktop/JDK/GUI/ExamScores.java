import java.awt.*;
import java.awt.event.*;

public class ExamScores extends Frame implements ActionListener {
    
    // For main frame
    Label l1, l2;
    TextField t1, t2;
    Button sub; 

    // For Result Dialog
    Label l3, l4;
    TextField t3, t4;

    Dialog dis, Err;

    int m = (int)(Math.random() * 101); // generate random marks from 0 - 100

    String use = "25ITUOZ089", pass = "B#avy@.2109";

    ExamScores() {
        // Frame Setup
        setSize(400, 300);
        setTitle("Exam Score");
        setLayout(null);
        
        // Window closing mechanism for the main frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Username
        l1 = new Label("Username : ");
        l1.setBounds(50, 60, 80, 30);
        add(l1);

        t1 = new TextField("");
        t1.setBounds(140, 60, 160, 30);
        add(t1);

        // Password
        l2 = new Label("Password : ");
        l2.setBounds(50, 110, 80, 30);
        add(l2);

        t2 = new TextField("");
        t2.setBounds(140, 110, 160, 30);
        t2.setEchoChar('*'); // Hides password characters
        add(t2);

        // Submit Button
        sub = new Button("Submit");
        sub.setBounds(140, 160, 100, 30);
        sub.addActionListener(this); // CRITICAL: Links the button to the actionPerformed method
        add(sub);

        // Reusable dialog closer
        WindowAdapter dialogCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                we.getWindow().setVisible(false);
            }
        };

        // Dialog for displaying marks
        dis = new Dialog(this, "Result", true);
        dis.setSize(300, 200);
        dis.setLayout(null);
        dis.addWindowListener(dialogCloser);

        l3 = new Label("Name : ");
        l3.setBounds(40, 60, 50, 30);
        
        t3 = new TextField("");
        t3.setBounds(100, 60, 150, 30);
        t3.setEditable(false);

        l4 = new Label("Score : ");
        l4.setBounds(40, 110, 50, 30);
        
        t4 = new TextField("");
        t4.setBounds(100, 110, 150, 30);
        t4.setEditable(false);

        dis.add(l3);
        dis.add(t3);
        dis.add(l4);
        dis.add(t4);

        // Dialog for login error
        Err = new Dialog(this, "Error", true);
        Err.setSize(300, 150);
        Err.setLayout(null);
        Err.addWindowListener(dialogCloser);
        
        Label errLabel = new Label("Check your username or password!");
        errLabel.setBounds(40, 60, 220, 30);
        Err.add(errLabel);
        
        // Set visible at the very end to ensure all components render properly
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == sub) {
            if(t1.getText().equals(use) && t2.getText().equals(pass)) {
                // FIXED: t3 is for Name, t4 is for Score
                t3.setText("Bhavya Patel");
                t4.setText(m + "");
                dis.setVisible(true);
            } else {
                Err.setVisible(true);
            }
        }
    }

    public static void main(String[] args) {
        new ExamScores();
    }
}