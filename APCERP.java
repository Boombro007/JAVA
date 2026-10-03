import java.awt.*;
import java.util.*;

class Internal extends Frame{
    TextField t1,t2,t3,t4,t5,t6;
    Label l1,l2,l3,l4,l5,l6;
    TextArea t;
    Button change,roll,room,status;
    int rl = (int)(Math.random() * 400) + 600;
    
    int randRoom(){
        Random rand = new Random();
        
        // 99 total valid rooms across all blocks
        int r = rand.nextInt(99); 
        int rm = 0;
        
        if (r < 18) {
            // First 18 rooms: 1 to 18
            rm = 1 + r;
        } else if (r < 53) {
            // Next 35 rooms: 101 to 135
            rm = 101 + (r - 18);
        } else if (r < 89) {
            // Next 36 rooms: 201 to 236
            rm = 201 + (r - 53);
        } else {
            // Final 10 rooms: 301 to 310
            rm = 301 + (r - 89);
        }
        return rm;
    }

    Internal(){
        setSize(500,500);
        setTitle("APCERP");
        setVisible(true);
        setLayout(null);

        t = new TextArea("Photo");
        t.setBounds(30, 50, 120, 150);
        t.setEditable(false);
        add(t);

        change = new Button("Change Photo");
        change.setBounds(30, 210, 120, 30);
        add(change);

        roll = new Button(rl+"");
        roll.setBounds(30, 250, 120, 30);
        add(roll);

        room = new Button(randRoom()+"");
        room.setBounds(30, 290, 120, 30);
        add(room);

        status = new Button("Active");
        status.setBounds(30, 330, 120, 30);
        add(status);

        l1 = new Label("Name : ");
        l1.setBounds(180, 50, 110, 30);
        add(l1);
        t1 = new TextField("");
        t1.setBounds(300, 50, 160, 30);
        add(t1);

        l2 = new Label("Education : ");
        l2.setBounds(180, 90, 110, 30);
        add(l2);
        t2 = new TextField("");
        t2.setBounds(300, 90, 160, 30);
        add(t2);

        l3 = new Label("Blood Group : ");
        l3.setBounds(180, 130, 110, 30);
        add(l3);
        t3 = new TextField("");
        t3.setBounds(300, 130, 160, 30);
        add(t3);

        l4 = new Label("Address : ");
        l4.setBounds(180, 170, 110, 30);
        add(l4);
        t4 = new TextField("");
        t4.setBounds(300, 170, 160, 30);
        add(t4);

        l5 = new Label("Phone Number : ");
        l5.setBounds(180, 210, 110, 30);
        add(l5);
        t5 = new TextField("");
        t5.setBounds(300, 210, 160, 30);
        add(t5);

        l6 = new Label("Vibag : ");
        l6.setBounds(180, 250, 110, 30);
        add(l6);
        t6 = new TextField("");
        t6.setBounds(300, 250, 160, 30);
        add(t6);
    }
}

class External extends Frame{
    TextField t1,t2,t3,t4,t5,t6;
    Label l1,l2,l3,l4,l5,l6;
    TextArea t;
    Button change,roll,room,status;
    int rl = (int)(Math.random() * 100) + 500 , rm = (int)(Math.random() * 17) + 400;

    External(){
        setSize(500,500);
        setTitle("APCERP");
        setVisible(true);

        setSize(500,500);
        setTitle("APCERP");
        setVisible(true);
        setLayout(null);

        t = new TextArea("Photo");
        t.setBounds(30, 50, 120, 150);
        t.setEditable(false);
        add(t);

        change = new Button("Change Photo");
        change.setBounds(30, 210, 120, 30);
        add(change);

        roll = new Button(rl+"");
        roll.setBounds(30, 250, 120, 30);
        add(roll);

        room = new Button(rm+"");
        room.setBounds(30, 290, 120, 30);
        add(room);

        status = new Button("Active");
        status.setBounds(30, 330, 120, 30);
        add(status);

        l1 = new Label("Name : ");
        l1.setBounds(180, 50, 110, 30);
        add(l1);
        t1 = new TextField("");
        t1.setBounds(300, 50, 160, 30);
        add(t1);

        l2 = new Label("Education : ");
        l2.setBounds(180, 90, 110, 30);
        add(l2);
        t2 = new TextField("");
        t2.setBounds(300, 90, 160, 30);
        add(t2);

        l3 = new Label("Blood Group : ");
        l3.setBounds(180, 130, 110, 30);
        add(l3);
        t3 = new TextField("");
        t3.setBounds(300, 130, 160, 30);
        add(t3);

        l4 = new Label("Address : ");
        l4.setBounds(180, 170, 110, 30);
        add(l4);
        t4 = new TextField("");
        t4.setBounds(300, 170, 160, 30);
        add(t4);

        l5 = new Label("Phone Number : ");
        l5.setBounds(180, 210, 110, 30);
        add(l5);
        t5 = new TextField("");
        t5.setBounds(300, 210, 160, 30);
        add(t5);

        l6 = new Label("Vibag : ");
        l6.setBounds(180, 250, 110, 30);
        add(l6);
        t6 = new TextField("");
        t6.setBounds(300, 250, 160, 30);
        add(t6);
    }
}

class APCERP {
    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        String ch;
        System.out.println("Enter the option for I - Internal & E - External : ");
        ch = sc.nextLine();
        
        if(ch.equalsIgnoreCase("I")){
            new Internal();
        }
        else if(ch.equalsIgnoreCase("E")){
            new External();
        }
        sc.close();
    }
}