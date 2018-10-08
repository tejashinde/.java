import javax.swing.*;
import java.awt.*;

class A12{
    JFrame f;
    A12(){
        f = new JFrame("Welcome");
        f.setSize(100,100);



//        JFrame win = new JFrame("Layout Demo");
//        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JLabel east = new JLabel("East");
        east.setOpaque(true);
        east.setBackground(Color.RED);


        JLabel west = new JLabel("WEST");
        west.setOpaque(true);
        west.setBackground(Color.BLUE);

        JLabel north = new JLabel("NORTH");
        north.setOpaque(true);
        north.setBackground(Color.YELLOW);

        JLabel south = new JLabel("SOUTH");
        south.setOpaque(true);
        south.setBackground(Color.GREEN);

        JLabel center = new JLabel("CENTRE");
        center.setOpaque(true);
        center.setBackground(Color.ORANGE);

        f.setLayout(new FlowLayout());
        f.add(east);
        f.add(west);
        f.add(north);
        f.add(south);
        f.add(center);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args){
        new A12();

    }
}
