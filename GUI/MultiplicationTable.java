import java.awt.*;
import java.awt.event.*;
public class MultiplicationTable extends Frame implements ActionListener {
    Label l1;
    TextField input;
    Button genrate;
    TextArea output;
    MultiplicationTable(){
        setTitle("Multiplication Table");
        setSize(250,350);
        setVisible(true);
        setLayout(null);
        
        l1 = new Label("Enter a number : ");
        l1.setBounds(30, 80, 100, 30);
        add(l1);

        input = new TextField();
        input.setBounds(140, 80, 100, 30);
        add(input);

        genrate = new Button("Genrate Table");
        genrate.addActionListener(this);
        genrate.setBounds(80, 130, 120, 30);
        add(genrate);

        output = new TextArea(12,20);
        output.setBounds(50, 180, 180, 200);
        add(output);
    }
    public void actionPerformed(ActionEvent e){
        int n = Integer.parseInt(input.getText());
        output.setText("");
        for(int i=1;i<=10;i++){
            String s = n + "x" + i + "=" + (n*i) + "\n";
            output.append(s);
        }
    }
    public static void main(String[] args) {
        MultiplicationTable m1 = new MultiplicationTable();
    }
}