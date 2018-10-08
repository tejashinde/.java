import javax.swing.*;
public class OptionPaneExample{
JFrame f;
OptionPanelExample()
{
    f = new JFrame();
    JOptionPane.showMessageDialog(f,"Successfully Updated","Alert",JOptionPane.WARNING);
}
public static void main(String args[])
{
    new OptionPaneExapmle();
}
}