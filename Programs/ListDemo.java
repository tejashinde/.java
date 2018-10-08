import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class ListDemo implements ListSelectionListener
{
    JFrame f;
    JList l;
    JPanel p;
    JTextField t;
    ListDemo()
    {
        f = new JFrame("List Demo");
        f.setSize(300,300);
        String[] countries = new String[]{"India","Germany","China","UK","USA","Denmark"};
        l = new JList(countries);
        p = new JPanel();
        p.add(l);
        t = new JTextField(20);
        f.setLayout(new BorderLayout());
        f.add(p,BorderLayout.CENTER);
        f.add(t,BorderLayout.SOUTH);
        l.addListSelectionListener(this);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void valueChanged(ListSelectionEvent le)
    {
        Object[] names = l.getSelectedValues();
        String message = "You have selected : ";
        for(int i=0;i<names.length;i++)
            message += (String)names[i] + " ";
            t.setText(message);
    }
    public static void main(String[] args)
    {
        new ListDemo();
    }
}