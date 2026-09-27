import java.awt.*;
import java.awt.event.*;

public class Project extends Frame implements MouseListener {

    TextField t1, t2, t3, t4, t5, t6, t7, t8, t9;

    int c = 0;
    // c = 0 -> X
    // c = 1 -> O

    Project() {

        setSize(500, 500);
        setTitle("Tic Tac Toe");

        setLayout(new GridLayout(3, 3));

        t1 = new TextField();
        add(t1);
        t1.setEditable(false);

        t2 = new TextField();
        add(t2);
        t2.setEditable(false);

        t3 = new TextField();
        add(t3);
        t3.setEditable(false);

        t4 = new TextField();
        add(t4);
        t4.setEditable(false);

        t5 = new TextField();
        add(t5);
        t5.setEditable(false);

        t6 = new TextField();
        add(t6);
        t6.setEditable(false);

        t7 = new TextField();
        add(t7);
        t7.setEditable(false);

        t8 = new TextField();
        add(t8);
        t8.setEditable(false);

        t9 = new TextField();
        add(t9);
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

        setVisible(true);
    }

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

    public void mousePressed(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {
        new Project();
    }
}