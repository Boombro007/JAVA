import java.awt.*;
import java.awt.event.*;
public class CalculatorGUI extends Frame implements ActionListener {
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
    int a,b;
    CalculatorGUI()
    {
        setSize(300,500);
        setTitle("Calculator");
        setVisible(true);
        setLayout(new GridLayout(4,1));
        t1 = new TextField("");
        t2 = new TextField("");
        add(t1);
        add(t2);
        t3 = new TextField();
        add(t3);
        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(1, 4));
        b1 = new Button("Add");
        b1.addActionListener(this);
        b2 = new Button("Sub");
        b2.addActionListener(this);
        b3 = new Button("Mul");
        b3.addActionListener(this);
        b4 = new Button("Div");
        b4.addActionListener(this);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        add(p1);
    }
    public void actionPerformed(ActionEvent e)
    {
        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t2.getText());
        if(e.getSource() == b1)
        {
            int s = a + b;
            t3.setText(s+"");
        } 
        else if(e.getSource() == b2)
        {
            int s = a - b;
            t3.setText(s+"");
        }
        else if(e.getSource() == b3)
        {
            int s = a * b;
            t3.setText(s+"");
        }
        else if(e.getSource() == b4)
        {
            int s = a / b;
            t3.setText(s+"");
        }
    }
    public static void main(String[] args) 
    {
        CalculatorGUI c1 = new CalculatorGUI();
    } 
}
