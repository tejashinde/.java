import java.awt.*;
import javax.swing.*;

class MenuExample
{
    JMenu filemenu , filesubmenu , shyamnathmenu;
    JMenuItem i1 , i2 , i3 , i4 , i5 , i6 , i7;
    MenuExample(){
        JFrame f = new JFrame("Menu and Menu item example");
        JMenuBar mb = new JMenuBar();
        
        filemenu = new JMenu("File");
        shyamnathmenu = new JMenu("Shyamnath");
        
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i6 = new JMenuItem("Stupid");
        i7 = new JMenuItem("Dumb");        
        shyamnathmenu.add(i6);
        shyamnathmenu.add(i7);    
        filemenu.add(i1);
        filemenu.add(i2);
        filemenu.add(i3);
        
        filesubmenu = new JMenu("Sub Menu");
        
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");
        filesubmenu.add(i4);
        filesubmenu.add(i5);
        
        filemenu.add(filesubmenu);
        
        mb.add(filemenu);
        mb.add(shyamnathmenu);
        
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
public static void main(String args[])
{
    new MenuExample();
}
}