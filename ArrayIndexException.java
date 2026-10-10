import java.awt.*;
import java.awt.event.*;

class ArrayIndexException extends Frame implements ActionListener{
    int []arr = new int[100];
    TextField t1,t2;
    Button b1;
    int idx;
    
    ArrayIndexException(){
        setSize(500,500);
        setTitle("Array Index Exception");

        setLayout(null);
        
        Label l1 = new Label("Enter a index : ");
        l1.setBounds(80, 100, 100, 30); 
        add(l1);

        t1 = new TextField();
        t1.setBounds(190, 100, 150, 30);
        add(t1);

        Label l2 = new Label();
        l2.setBounds(80, 150, 100, 30);
        add(l2);
        
        t2 = new TextField();
        t2.setBounds(190, 150, 150, 30);
        add(t2);
        t2.setEditable(false);

        b1 = new Button("Show");
        b1.setBounds(190, 200, 100, 30);
        add(b1);
        b1.addActionListener(this);

        setVisible(true);

        for(int i=0;i<100;i++){
            arr[i] = (int)(Math.random() * 101);
        }
    }
    
    public void actionPerformed(ActionEvent e){
        try{
            idx = Integer.parseInt(t1.getText());
            if(e.getSource() == b1){
                t2.setText(arr[idx] + "");
            }
        }
        catch(ArrayIndexOutOfBoundsException c){
            t2.setText("Error !!");
        }
    }
    
    public static void main(String []a){
        new ArrayIndexException();
    }
}