import java.awt.*;
import java.awt.event.*;
class Action_event extends Frame implements ActionListener
{
    int a;
    int b;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
    Action_event()
    {
        setSize(500,800);
        setTitle("Calculator");
        setVisible(true);
        setLayout(new GridLayout(3,1));
        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(3,1));
        t1 = new TextField();
        t2 = new TextField();
        p1.add(t1);
        p1.add(t2);
        add(p1);

        t3 = new TextField();
        add(t3);

        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(2,2));
        b1 = new Button("Add");
        b1.addActionListener(this);
        b2 = new Button("Sub");
        b2.addActionListener(this);
        b3 = new Button("Mul");
        b3.addActionListener(this);
        b4 = new Button("Div");
        b4.addActionListener(this);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        add(p2);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s1 = t1.getText();
        String s2 = t2.getText();
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);

        if(e.getActionCommand().equals("Add"))
        {
            int s = a + b;
            t3.setText(s+"");
        }
        else if(e.getActionCommand().equals("Sub"))
        {
            int s = a - b;
            t3.setText(s+"");
        }
        else if(e.getActionCommand().equals("Mul"))
        {
            int s = a * b;
            t3.setText(s+"");
        }
        else if(e.getActionCommand().equals("Div"))
        {
            if(b == 0)
            {
                System.out.println("Erroe");
            }
            else
            {
            int s = a / b;
            t3.setText(s+"");
            }
        }
    }
    public static void main(String []a)
    {
        Action_event a1 = new Action_event();
    }
}