import java.awt.*;
import java.awt.event.*;

public class DialogBox extends Frame implements ActionListener {

    Button b1;
    Dialog ctDialog;

    DialogBox(){
        setSize(500,500);
        setTitle("Dialog Box");
        setVisible(true);

        setLayout(new FlowLayout());

        ctDialog = new Dialog(this,"Error",true);
        ctDialog.setSize(200,200);
        ctDialog.setLayout(new FlowLayout());

        b1 = new Button("Press This");
        b1.addActionListener(this);
        add(b1);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            ctDialog.setVisible(true);
        }
    }

    public static void main(String [] a){
        new DialogBox();
    }
}