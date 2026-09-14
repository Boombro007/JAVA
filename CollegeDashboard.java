import java.awt.*;
// import java.awt.event.*;
public class CollegeDashboard extends Frame {
    Label m,n,s,i;
    Button b1,b2,b3,b4,b5,b6; 
    Label na,r,c,mb,ad,o,se,of,h;
    TextField t1,t2,t3,t4;
    Choice course;
    CollegeDashboard(){
        setSize(700,300);
        setTitle("College STudent Registration");
        setVisible(true);
        setLayout(null);

        m = new Label("COLLEGE STUDENT REGISTRATION"); // Heading
        m.setBounds(350,50,350,30);
        add(m);

        n = new Label("NAVIGATION"); // Title Bar - 1
        n.setBounds(50,70,100,30);
        add(n);

        s = new Label("STUDENT DETAILS"); // Title Bar - 2
        s.setBounds(350, 70, 100, 30);
        add(s);

        i = new Label("INFORMATION"); // Title Bar - 3
        i.setBounds(650,70,100,30);
        add(i);

        b1 = new Button("Home"); // button - 1
        b1.setBounds(50,110,100,30);
        add(b1);

        b2 = new Button("Register");//button - 2
        b2.setBounds(50,140,100,30);
        add(b2);

        b3 = new Button("Courses");//button - 3
        b3.setBounds(50, 170, 100, 30);
        add(b3);

        b4 = new Button("Exit"); // button - 4
        b4.setBounds(50,200, 100, 30);
        add(b4);

        na = new Label("Name : "); // Detail - 1
        na.setBounds(250, 110, 100, 50);
        add(na);

        r = new Label("Roll Number : "); // Detail - 2
        r.setBounds(250, 140, 100, 50);
        add(r);

        c = new Label("Courses : "); // Detail - 4
        c.setBounds(250, 170, 100, 50);
        add(c);

        mb = new Label("Mobile Number : "); // Detail - 4
        mb.setBounds(250, 200, 100, 50);
        add(mb);

        ad = new Label("Address : "); // Detail - 5
        ad.setBounds(250, 230, 100, 50);
        add(ad);

        t1 = new TextField(); // Textfield -> Name
        t1.setBounds(450, 110, 200, 30);
        add(t1);

        t2 = new TextField(); // TexFeild -> Rollno.
        t2.setBounds(450, 140, 200, 30);
        add(t2);
        
        course = new Choice(); // Detail - 3
        course.setBounds(450,170,200,50);
        course.add("IT");
        course.add("CE");
        course.add("EC");
        add(course);

        t3 = new TextField(); // TextFeild -> Mobile number
        t3.setBounds(450, 200, 200, 30);
        add(t3);

        t4 = new TextField(); // TextFeild -> Address
        t4.setBounds(450, 230, 200, 30);
        add(t4);

        b5 = new Button("Submit"); //Button :Submit
        b5.setBounds(330,260,100,30);
        add(b5);
        
        b6 = new Button("Cancel"); // Button :Canel
        b6.setBounds(450,260,100,30);
        add(b6);

        o = new Label("Admission Open"); // Informa - 1
        o.setBounds(650,100,100,30);
        add(o);

        se = new Label("Session : 2026 - 27"); // Informa - 2
        se.setBounds(650, 150, 100, 30);
        add(se);

        of = new Label("Office : Block A"); // Informa - 3
        of.setBounds(650, 200, 100,30);
        add(of);

        h = new Label("Registration Status : Ready"); // status
        h.setBounds(350,290,100,30);
        add(h);
    }
    public static void main(String []a){
        CollegeDashboard c1 = new CollegeDashboard();
    }   
}