import javax.swing.*;
import java.awt.event.*;    

class GUIExample
{ 
    public static void main(String args[]){
    JFrame f = new JFrame("Example");
    JTextField t1,t2,t3;
    JLabel l1,l2,l3;    
    JButton b1,b2;
    t1 = new JTextField();
    t2 = new JTextField();
    t3 = new JTextField();
    b1 = new JButton("Concat");
    b2 = new JButton("Reverse");
    l1 = new JLabel("Fname");
    l2 = new JLabel("Lname");
    l3 = new JLabel("Processed");                    

    t1.setBounds(100,100,100,30);
    t2.setBounds(100,150,100,30);
    t3.setBounds(100,200,100,30);
    b1.setBounds(0,250,100,30);
    b2.setBounds(150,250,100,30);
    l1.setBounds(20,100,100,30);    
    l2.setBounds(20,150,100,30);
    l3.setBounds(20,200,100,30);
    t3.setEditable(false);    
        
    f.add(t1);
    f.add(t2);
    f.add(t3);
    f.add(b1);
    f.add(b2);
    f.add(l1);
    f.add(l2);
    f.add(l3);   

    b1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            String fname = t1.getText();
            String lname = t2.getText();
            t3.setText(fname + lname);
        }
    });
        
    b2.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            String fname = t1.getText();
            String lname = t2.getText();
            t3.setText(new StringBuilder(fname + lname).reverse().toString());
        }
    });
    f.setSize(600,600);
    f.setLayout(null);
    f.setVisible(true);
}
}
