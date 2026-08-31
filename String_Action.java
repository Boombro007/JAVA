import java.awt.*;
import java.awt.event.*;
public class String_Action extends Frame implements ActionListener {
    TextField t1,t2;
    Button b1,b2,b3,b4;
    String_Action()
    {
        setSize(800,400);
        setVisible(true);
        setTitle("String");
        setLayout(new GridLayout(3,1));
        t1 = new TextField("");
        t2 = new TextField("");
        add(t1);
        add(t2);

        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(1,4));
        b1 = new Button("Length");
        b2 = new Button("Uppercase");
        b3 = new Button("Lowercase");
        b4 = new Button("Reverse");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);

        add(p1);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            int n = t1.getText().length(); 
            String s = n+" ";
            t2.setText(s);
        }
        else if(e.getSource() == b2)
        {
            t2.setText(t1.getText().toUpperCase());
        }
        else if(e.getSource() == b3)
        {
            t2.setText(t1.getText().toLowerCase());
        }
        else if(e.getSource() == b4)
        {
            String originalText = t1.getText();
            StringBuilder sb = new StringBuilder(originalText);
            String reversedText = sb.reverse().toString();
            t2.setText(reversedText);
        }
    }
    public static void main(String[] args) {
        String_Action s1 = new String_Action();
    }
}