import javax.swing.*;

public class inputalert
{
    JFrame f;
    inputalert()
    {
        f = new JFrame();
        //f.getToolkit().beep();
        JOptionPane.showMessageDialog(f,"Data not entered..!");
    }
}