import java.awt.*;
import java.awt.event.*;

public class Project extends Frame implements MouseListener,ActionListener {

    TextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
    Button b1,b2;
    Dialog win;
    TextField winn;

    int c = 0;
    // c = 0 -> X
    // c = 1 -> O

    Project() {

        setSize(500, 500);
        setTitle("Tic Tac Toe");

        setLayout(new GridLayout(2,0));

        // Dialog Box to diaply the Winner
        win = new Dialog(this,"Winner",true);
        win.setLayout(new FlowLayout());
        win.setSize(250,250);
        winn = new TextField("");
        winn.setEditable(false);
        win.add(winn);

        // Allows the user to close the Dialog Box
        win.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                win.setVisible(false);
            }
        });

        // Allows the user to close the Main Game Window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(3, 3));

        t1 = new TextField();
        p1.add(t1);
        t1.setEditable(false);

        t2 = new TextField();
        p1.add(t2);
        t2.setEditable(false);

        t3 = new TextField();
        p1.add(t3);
        t3.setEditable(false);

        t4 = new TextField();
        p1.add(t4);
        t4.setEditable(false);

        t5 = new TextField();
        p1.add(t5);
        t5.setEditable(false);

        t6 = new TextField();
        p1.add(t6);
        t6.setEditable(false);

        t7 = new TextField();
        p1.add(t7);
        t7.setEditable(false);

        t8 = new TextField();
        p1.add(t8);
        t8.setEditable(false);

        t9 = new TextField();
        p1.add(t9);
        t9.setEditable(false);

        // Add MouseListener to every TextField
        t1.addMouseListener(this);
        t2.addMouseListener(this);
        t3.addMouseListener(this);
        t4.addMouseListener(this);
        t5.addMouseListener(this);
        t6.addMouseListener(this);
        t7.addMouseListener(this);
        t8.addMouseListener(this);
        t9.addMouseListener(this);
        add(p1);

        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(0,2));

        b1 = new Button("Reset");
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new Button("Submit");
        b2.addActionListener(this);
        p2.add(b2);

        add(p2);

        setVisible(true);
    }

    //Writing the Logic for X and O to be displayed !
    public void mouseClicked(MouseEvent e) {

        // Check which TextField was clicked
        if (e.getSource() == t1) {

            if (t1.getText().equals("")) {

                if (c % 2 == 0) {
                    t1.setText("X");
                } else {
                    t1.setText("O");
                }

                c++;
            }
        }

        else if (e.getSource() == t2) {

            if (t2.getText().equals("")) {

                if (c % 2 == 0) {
                    t2.setText("X");
                } else {
                    t2.setText("O");
                }

                c++;
            }
        }

        else if (e.getSource() == t3) {

            if (t3.getText().equals("")) {

                if (c % 2 == 0) {
                    t3.setText("X");
                } else {
                    t3.setText("O");
                }

                c++;
            }
        }

        else if (e.getSource() == t4) {

            if (t4.getText().equals("")) {

                if (c % 2 == 0) {
                    t4.setText("X");
                } else {
                    t4.setText("O");
                }

                c++;
            }
        }

        else if (e.getSource() == t5) {

            if (t5.getText().equals("")) {

                if (c % 2 == 0) {
                    t5.setText("X");
                } else {
                    t5.setText("O");
                }

                c++;
            }
        }

        else if (e.getSource() == t6) {

            if (t6.getText().equals("")) {

                if (c % 2 == 0) {
                    t6.setText("X");
                } else {
                    t6.setText("O");
                }

                c++;
            }
        }

        else if (e.getSource() == t7) {

            if (t7.getText().equals("")) {

                if (c % 2 == 0) {
                    t7.setText("X");
                } else {
                    t7.setText("O");
                }

                c++;
            }
        }

        else if (e.getSource() == t8) {

            if (t8.getText().equals("")) {

                if (c % 2 == 0) {
                    t8.setText("X");
                } else {
                    t8.setText("O");
                }

                c++;
            }
        }

        else if (e.getSource() == t9) {

            if (t9.getText().equals("")) {

                if (c % 2 == 0) {
                    t9.setText("X");
                } else {
                    t9.setText("O");
                }

                c++;
            }
        }
    }

    public void actionPerformed(ActionEvent a){
        if(a.getSource() == b1){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
        }
        else if(a.getSource() == b2){
            // Get text from all 9 TextFields
            String s1 = t1.getText();
            String s2 = t2.getText();
            String s3 = t3.getText();
            String s4 = t4.getText();
            String s5 = t5.getText();
            String s6 = t6.getText();
            String s7 = t7.getText();
            String s8 = t8.getText();
            String s9 = t9.getText();
            
            String result = "";

            // 1. Check Rows
            if (!s1.equals("") && s1.equals(s2) && s2.equals(s3)) result = s1;
            else if (!s4.equals("") && s4.equals(s5) && s5.equals(s6)) result = s4;
            else if (!s7.equals("") && s7.equals(s8) && s8.equals(s9)) result = s7;
            
            // 2. Check Columns
            else if (!s1.equals("") && s1.equals(s4) && s4.equals(s7)) result = s1;
            else if (!s2.equals("") && s2.equals(s5) && s5.equals(s8)) result = s2;
            else if (!s3.equals("") && s3.equals(s6) && s6.equals(s9)) result = s3;
            
            // 3. Check Diagonals
            else if (!s1.equals("") && s1.equals(s5) && s5.equals(s9)) result = s1;
            else if (!s3.equals("") && s3.equals(s5) && s5.equals(s7)) result = s3;
            
            // 4. Check for Draw (No winner, but all boxes are filled)
            else if (!s1.equals("") && !s2.equals("") && !s3.equals("") && 
                     !s4.equals("") && !s5.equals("") && !s6.equals("") && 
                     !s7.equals("") && !s8.equals("") && !s9.equals("")) {
                result = "Draw";
            }

            // 5. Update the Dialog Box and display it
            if (result.equals("Draw")) {
                winn.setText("Match is a Draw!");
                win.setVisible(true);
            } else if (!result.equals("")) {
                winn.setText("Player " + result + " Wins!");
                win.setVisible(true);
            } else {
                // If submit is clicked before the game is over
                winn.setText("Game in progress...");
                win.setVisible(true);
            }
        }
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {
        new Project();
    }
}