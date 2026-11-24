import java.awt.*;
import java.awt.event.*;

class WithdrawlLimitation extends Exception {
    public WithdrawlLimitation(String message) {
        super(message);
    }
}

class DepositLimitation extends Exception {
    public DepositLimitation(String message) {
        super(message);
    }
}

public class BankingPage extends Frame implements ActionListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    Dialog with, depo, balace, tf, ts;
    Label l1, l2, l3, l4, l5, l6, l7, l8;
    TextField t1, t2, t3;
    double money;
    double balance = 100000;

    BankingPage() {
        /*
        ----------------------------------------------------------------------
                                Main page
        ----------------------------------------------------------------------
        */
        setSize(500, 500);
        setTitle("Banking Application");
        setLayout(null);

        b1 = new Button("1");
        b1.addActionListener(this);
        b1.setBounds(100, 150, 120, 35);
        add(b1);

        l1 = new Label("Withdrawl");
        l1.setBounds(250, 150, 150, 35);
        add(l1);

        b2 = new Button("2");
        b2.addActionListener(this);
        b2.setBounds(100, 230, 120, 35);
        add(b2);

        l2 = new Label("Deposit");
        l2.setBounds(250, 230, 150, 35);
        add(l2);

        b3 = new Button("3");
        b3.addActionListener(this);
        b3.setBounds(100, 310, 120, 35);
        add(b3);

        l3 = new Label("Balance Enquiry");
        l3.setBounds(250, 310, 150, 35);
        add(l3);

        /*
        ----------------------------------------------------------------------
                                Withdrawl dialog box
        ----------------------------------------------------------------------
        */
        with = new Dialog(this, "Withdrawl", true);
        with.setSize(400, 260);
        with.setLayout(null);

        l4 = new Label("Enter amount : ");
        l4.setBounds(50, 80, 110, 30);
        with.add(l4);

        t1 = new TextField("");
        t1.setBounds(170, 80, 170, 30);
        with.add(t1);

        b4 = new Button("Cancel");
        b4.addActionListener(this);
        b4.setBounds(70, 160, 110, 35);
        with.add(b4);

        b5 = new Button("Submit");
        b5.addActionListener(this);
        b5.setBounds(220, 160, 110, 35);
        with.add(b5);

        /*
        ----------------------------------------------------------------------
                                Deposit dialog box
        ----------------------------------------------------------------------
        */
        depo = new Dialog(this, "Deposit", true);
        depo.setSize(400, 260);
        depo.setLayout(null);

        l5 = new Label("Enter amount : ");
        l5.setBounds(50, 80, 110, 30);
        depo.add(l5);

        t2 = new TextField("");
        t2.setBounds(170, 80, 170, 30);
        depo.add(t2);

        b6 = new Button("Cancel");
        b6.addActionListener(this);
        b6.setBounds(70, 160, 110, 35);
        depo.add(b6);

        b7 = new Button("Submit");
        b7.addActionListener(this);
        b7.setBounds(220, 160, 110, 35);
        depo.add(b7);

        /*
        ----------------------------------------------------------------------
                                Balance dialog box
        ----------------------------------------------------------------------
        */
        balace = new Dialog(this, "Balance", true);
        balace.setSize(360, 220);
        balace.setLayout(null);

        l6 = new Label("Balance : ");
        l6.setBounds(40, 70, 80, 30);
        balace.add(l6);

        t3 = new TextField(balance + "");
        t3.setEditable(false);
        t3.setBounds(130, 70, 180, 30);
        balace.add(t3);

        b8 = new Button("OK");
        b8.addActionListener(this);
        b8.setBounds(130, 140, 100, 35);
        balace.add(b8);

        /*
        ----------------------------------------------------------------------
                                Transaction pass dialog box
        ----------------------------------------------------------------------
        */
        ts = new Dialog(this, "Success", true);
        ts.setSize(300, 160);
        ts.setLayout(null);

        l7 = new Label("Transaction Successful");
        l7.setBounds(70, 45, 180, 30);
        ts.add(l7);

        b9 = new Button("OK");
        b9.setBounds(100, 95, 100, 35);
        b9.addActionListener(this);
        ts.add(b9);

        /*
        ----------------------------------------------------------------------
                                Transaction fail dialog box
        ----------------------------------------------------------------------
        */
        tf = new Dialog(this, "Failed", true);
        tf.setSize(320, 160);
        tf.setLayout(null);

        l8 = new Label("Transaction Failed");
        l8.setBounds(25, 45, 270, 30);
        tf.add(l8);

        b10 = new Button("OK");
        b10.setBounds(110, 95, 100, 35);
        b10.addActionListener(this);
        tf.add(b10);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void withdrawl(double amount) throws WithdrawlLimitation {
        if (amount > 20000) {
            throw new WithdrawlLimitation("Limit exceeded (Max 20,000)!");
        } else if (amount > balance) {
            throw new WithdrawlLimitation("Insufficient balance!");
        } else {
            balance = balance - amount;
        }
    }

    public void deposit(double amount) throws DepositLimitation {
        if (amount > 20000) {
            throw new DepositLimitation("Limit exceeded (Max 20,000)!");
        } else {
            balance = balance + amount;
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            with.setVisible(true);
        } else if (e.getSource() == b2) {
            depo.setVisible(true);
        } else if (e.getSource() == b3) {
            t3.setText(balance + "");
            balace.setVisible(true);
        } else if (e.getSource() == b4) {
            with.setVisible(false);
            t1.setText("");
            l8.setText("Transaction Cancelled");
            tf.setVisible(true);
        } else if (e.getSource() == b5) {
            with.setVisible(false);
            try {
                money = Double.parseDouble(t1.getText());
                withdrawl(money);
                ts.setVisible(true);
            } catch (WithdrawlLimitation w) {
                l8.setText(w.getMessage());
                tf.setVisible(true);
            } catch (NumberFormatException ex) {
                l8.setText("Please enter a valid number!");
                tf.setVisible(true);
            }
            t1.setText("");
        } else if (e.getSource() == b6) {
            depo.setVisible(false);
            t2.setText("");
            l8.setText("Transaction Cancelled");
            tf.setVisible(true);
        } else if (e.getSource() == b7) {
            depo.setVisible(false);
            try {
                money = Double.parseDouble(t2.getText());
                deposit(money);
                ts.setVisible(true);
            } catch (DepositLimitation d) {
                l8.setText(d.getMessage());
                tf.setVisible(true);
            } catch (NumberFormatException ex) {
                l8.setText("Please enter a valid number!");
                tf.setVisible(true);
            }
            t2.setText("");
        } else if (e.getSource() == b8) {
            balace.setVisible(false);
        } else if (e.getSource() == b9) {
            ts.setVisible(false);
        } else if (e.getSource() == b10) {
            tf.setVisible(false);
        }
    }

    public static void main(String[] a) {
        new BankingPage();
    }
}