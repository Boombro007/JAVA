import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class FileInGUI extends Frame implements ActionListener {
    TextField t1, t2;
    TextArea t3;
    CheckboxGroup cbg;
    Checkbox c1, c2, c3, c4;
    Button b1, b2;

    FileInGUI() {
        cbg = new CheckboxGroup(); // Initialized to prevent crash
        
        setSize(500, 500);
        setTitle("Registration Form");
        setLayout(null);

        // Row 1: Name
        Label l1 = new Label("Name : ");
        l1.setBounds(50, 50, 100, 30);
        add(l1);
        t1 = new TextField("");
        t1.setBounds(160, 50, 200, 30);
        add(t1);

        // Row 2: Address
        Label l2 = new Label("Address : ");
        l2.setBounds(50, 100, 100, 30);
        add(l2); // Fixed typo (was add(l1))
        t3 = new TextArea("");
        t3.setBounds(160, 100, 200, 60); // Increased height for TextArea
        add(t3);

        // Row 3: Mobile No
        Label l3 = new Label("Mobile No. : ");
        l3.setBounds(50, 180, 100, 30);
        add(l3);
        t2 = new TextField();
        t2.setBounds(160, 180, 200, 30);
        add(t2);

        // Row 4: Hobbies
        Label l4 = new Label("Hobbies : ");
        l4.setBounds(50, 230, 100, 30);
        add(l4);
        c1 = new Checkbox("Cricket");
        c1.setBounds(160, 230, 80, 30);
        add(c1);
        c2 = new Checkbox("Reading");
        c2.setBounds(250, 230, 80, 30);
        add(c2);

        // Row 5: Gender
        Label l5 = new Label("Gender : ");
        l5.setBounds(50, 280, 100, 30);
        add(l5);
        c3 = new Checkbox("Male", cbg, false);
        c3.setBounds(160, 280, 70, 30);
        add(c3);
        c4 = new Checkbox("Female", cbg, false);
        c4.setBounds(240, 280, 80, 30);
        add(c4);

        // Row 6: Buttons
        b1 = new Button("Submit");
        b1.addActionListener(this);
        b1.setBounds(120, 340, 100, 30);
        add(b1);

        b2 = new Button("Reset");
        b2.addActionListener(this);
        b2.setBounds(240, 340, 100, 30);
        add(b2);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == b1) {
            try {
                FileWriter f = new FileWriter("Form1.txt");
                f.write("Name : " + t1.getText() + "\n");
                f.write("Address : " + t3.getText() + "\n");
                f.write("Mobile no. : " + t2.getText() + "\n");
                if(c1.getState()){
                    f.write("Hobbie : " + c1.getLabel() + "\n");
                }
                else if(c2.getState()){
                    f.write("Hobbie : " + c2.getLabel() + "\n");
                }
                Checkbox Sg = cbg.getSelectedCheckbox();
                if(Sg != null){
                    f.write("Gender : " + Sg.getLabel() + "\n");
                }
                else{
                    f.write("Gender : Not Selected\n");
                }
                f.close();
            } catch (IOException e) {
                System.out.println("An erroergenrated : " + e.getMessage());
            }
        }
        else if(a.getSource() == b2){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            c1.setState(false);
            c2.setState(false);
            cbg.setSelectedCheckbox(null);
        }
    }

    public static void main(String[] args) {
        new FileInGUI();
    }
}