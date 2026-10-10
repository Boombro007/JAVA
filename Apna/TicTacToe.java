import java.awt.*;
import java.awt.event.*;
public class TicTacToe extends Frame implements ActionListener {
    TicTacToe()
    {
        setSize(30,300);
        setTitle("Tic Tac Toe");
        setLayout(new GridLayout(3,3));
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        TicTacToe t1 = new TicTacToe();
    }
}