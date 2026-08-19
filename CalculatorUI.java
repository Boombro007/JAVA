import java.awt.*;

public class CalculatorUI extends Frame {
    
    CalculatorUI() {
        setSize(350, 450); 
        setTitle("Calculator");
        //Set the main Frame layout to BorderLayout
        setLayout(new BorderLayout()); 
        //Create the display screen and put it at the top (NORTH)
        TextField display = new TextField("0");
        add(display, BorderLayout.NORTH);
        //Create a Panel for the buttons
        Panel p1 = new Panel();
        //Set the Panel layout to a 4x4 GridLayout (4 rows, 4 columns)
        p1.setLayout(new GridLayout(4, 4)); 
        // Creating buttons instead of Labels
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button bDiv = new Button("/");
        
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button bMul = new Button("*");
        
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button bSub = new Button("-");
        
        Button bClear = new Button("C");
        Button b0 = new Button("0");
        Button bEq = new Button("=");
        Button bAdd = new Button("+");
        
        // Adding buttons to the GridLayout Panel
        // GridLayout fills left-to-right, then top-to-bottom
        p1.add(b7); 
        p1.add(b8); 
        p1.add(b9); 
        p1.add(bDiv);
        p1.add(b4); 
        p1.add(b5); 
        p1.add(b6); 
        p1.add(bMul);
        p1.add(b1); 
        p1.add(b2); 
        p1.add(b3); 
        p1.add(bSub);
        p1.add(bClear); 
        p1.add(b0); 
        p1.add(bEq); 
        p1.add(bAdd);

        // Add the button panel to the middle (CENTER) of the Frame
        add(p1, BorderLayout.CENTER);
        setVisible(true); 
    }    
    
    public static void main(String[] args) {
        new CalculatorUI();
    }
}