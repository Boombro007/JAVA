import java.awt.*;
import java.awt.event.*;

public class FullCalculator extends Frame implements ActionListener {
    TextField in1, in2, out, activeField;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, Add, mul, div, sub, e1, e2;

    FullCalculator() {
        setSize(400, 500);
        setTitle("Calculator");
        setLayout(new GridLayout(2, 1));

        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(3, 1));
        in1 = new TextField();
        in2 = new TextField();
        out = new TextField();
        out.setEditable(false);
        
        // Default the active field to the first input
        activeField = in1;

        p1.add(in1);
        p1.add(in2);
        p1.add(out);
        add(p1);

        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(1, 2));

        Panel p3 = new Panel();
        p3.setLayout(new GridLayout(4, 3));
        
        b1 = new Button("1"); b1.addActionListener(this); p3.add(b1);
        b2 = new Button("2"); b2.addActionListener(this); p3.add(b2);
        b3 = new Button("3"); b3.addActionListener(this); p3.add(b3);
        b4 = new Button("4"); b4.addActionListener(this); p3.add(b4);
        b5 = new Button("5"); b5.addActionListener(this); p3.add(b5);
        b6 = new Button("6"); b6.addActionListener(this); p3.add(b6);
        b7 = new Button("7"); b7.addActionListener(this); p3.add(b7);
        b8 = new Button("8"); b8.addActionListener(this); p3.add(b8);
        b9 = new Button("9"); b9.addActionListener(this); p3.add(b9);
        
        // Added ActionListeners to the selector buttons
        e1 = new Button("I1"); e1.addActionListener(this); p3.add(e1); 
        b0 = new Button("0");  b0.addActionListener(this); p3.add(b0);
        e2 = new Button("I2"); e2.addActionListener(this); p3.add(e2); 

        p2.add(p3);

        Panel p4 = new Panel();
        p4.setLayout(new GridLayout(2, 2));
        Add = new Button("Add"); Add.addActionListener(this); p4.add(Add);
        sub = new Button("Sub"); sub.addActionListener(this); p4.add(sub);
        mul = new Button("Mul"); mul.addActionListener(this); p4.add(mul);
        div = new Button("Div"); div.addActionListener(this); p4.add(div);
        p2.add(p4);

        add(p2);
        
        // Added WindowListener so the close (X) button works
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        // 1. Switch the active input field based on I1 / I2
        if (cmd.equals("I1")) {
            activeField = in1;
            return;
        } else if (cmd.equals("I2")) {
            activeField = in2;
            return;
        }

        // 2. Append numbers to the currently active field instead of overwriting
        if (cmd.matches("[0-9]")) {
            activeField.setText(activeField.getText() + cmd);
            return;
        }

        // 3. Perform calculations ONLY when an operator button is pressed
        try {
            int a = Integer.parseInt(in1.getText());
            int b = Integer.parseInt(in2.getText());

            if (cmd.equals("Add")) {
                out.setText((a + b) + "");
            } else if (cmd.equals("Sub")) {
                out.setText((a - b) + "");
            } else if (cmd.equals("Mul")) {
                out.setText((a * b) + "");
            } else if (cmd.equals("Div")) {
                if (b == 0) {
                    out.setText("Error !! Div by 0");
                } else {
                    out.setText((a / b) + "");
                }
            }
        } catch (NumberFormatException ex) {
            // Catches the error if the user presses an operator before entering both numbers
            out.setText("Enter both numbers!");
        }
    }

    public static void main(String[] args) {
        new FullCalculator();
    }
}