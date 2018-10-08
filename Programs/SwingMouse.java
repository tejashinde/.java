import.javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingMouse extends JFrame implements MousteListener
{
    JLabel l;
    int x,y;   
    //static int c=0;
    SwingMouse()
    {
        l = new JLabel();
        add(l);
        //addMouseListener(this)
        addMouseListener(
        new MouseAdapter()
        {
            public void mouseClicked(ActionEvent ae)
            {
                x = ae.getx();
                y = ae.gety();
                repaint();
            }
            
        }
    }
}