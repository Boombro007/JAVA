import java.awt.*;
public class RadioButton extends Frame{
    RadioButton()
    {
        setSize(300,400);
        setTitle("Radio Button");
        setLayout(new FlowLayout());
        Label l1 = new Label("Gender : ");
        add(l1);
        CheckboxGroup cgb = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male",cgb,true);
        Checkbox c2 = new Checkbox("Female",cgb,false);
        add(c1);
        add(c2);
        setVisible(true);
    }
    public static void main(String[] args) {
        RadioButton r1 = new RadioButton();
    }
}