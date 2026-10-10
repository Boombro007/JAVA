import java.awt.*;
import java.awt.event.*;
public class SubjectSelector extends Frame implements ItemListener{
    TextField t1;
    Checkbox c1,c2,c3,c4;
    SubjectSelector(){
        setSize(300,300);
        setTitle("Subject Selecter");
        setVisible(true);
        setLayout(new GridLayout(2,1));

        t1 = new TextField();
        add(t1);
        t1.setEditable(false);
        
        Panel p1 = new Panel();
        
        p1.setLayout(new GridLayout(1,4));
        
        c1 = new Checkbox("Java");
        c2 = new Checkbox("AI");
        c3 = new Checkbox("Python");
        c4 = new Checkbox("Machine Learning");
        
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        
        p1.add(c1);
        p1.add(c2);
        p1.add(c3);
        p1.add(c4);
    
        add(p1);
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == c1){
            t1.setText("Java ");
        }
        else if(e.getSource() == c2){
            t1.setText(" AI ");
        }
        else if(e.getSource() == c3){
            t1.setText(" Python ");
        }
        else if(e.getSource() == c3){
            t1.setText(" Machince Learning");
        }
    }
    public static void main(String []a){
        SubjectSelector s1 = new SubjectSelector();
    }
}
