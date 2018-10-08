import javax.swing.*;
import java.awt.*;  
import java.awt.event.*; 
import javax.swing.event.*;
import javax.swing.ImageIcon.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.image.BufferedImage.*;

import p1.resetit;

class MajhiMaitrinCharitableTrust extends JFrame //implements ActionListener
{
    //All declarations are made in here
    JFrame frame;
    JButton b1,b2,b3;
    JTextField t1,t2,t3,t4,t5;
    JPanel p1,p2,p3,mp1,mp2,mp3,mp4,mp5;
    JCheckBox c[]=new JCheckBox[3];
    JList l;
    JLabel bg,img_lab,l1,l2,l3,l4,l5,l6,l7,l8;
    JComboBox cb1,cb2;
    ImageIcon img,bi;
    JMenu menu, submenu,help;
    JMenuItem i1,i2,i3,i4,i5;
    JMenuBar mb;

    MajhiMaitrinCharitableTrust()
    {

        //This is the framing part
        frame = new JFrame("Majhi Maitrin Charitable Trust");
        frame.setSize(1100,600);


        //Menu, MenuItem and SubMenu
        mb = new JMenuBar();
        menu = new JMenu("File");
        help = new JMenu("Help");
        i1 = new JMenuItem("New File");
        i2 = new JMenuItem("Save");
        i3 = new JMenuItem("Quit");
        //this action is use to exit from the application using "Quit option"
        i3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent arg0){System.exit(0);}});
        i1.addActionListener(new setit());
        i2.addActionListener(new checkinput());//chould verify the form befor validation
        menu.add(i1);
        menu.add(i2);
        submenu = new JMenu("Database");
        i4 = new JMenuItem("View Records");
        i5 = new JMenuItem("View Excel");
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        menu.add(i3);
        mb.add(menu);
        mb.add(help);
        frame.setJMenuBar(mb);



        //This is for the label at the top wich contains the logo 
        p1 = new JPanel();
        p1.setBackground(Color.ORANGE);
        img = new ImageIcon("/home/prince/Desktop/Semester4/Service_Learning/Code/Pictures/mm-logo1.png");
        img_lab = new JLabel(img);
        p1.add(img_lab);
        frame.add(p1, BorderLayout.NORTH);
        


        // this is for the panel in the center, wich has all data entry options 
        p2 = new JPanel();
       // p2.setBackground(Color.LIGHT_GRAY);
        p2.setLayout(null);

        bi = new ImageIcon("/home/prince/Desktop/Semester4/Service_Learning/Code/Pictures/evo-GUI-BACKGROUND.png");
        bg = new JLabel(bi);
        p2.add(bg);

        //
        l2 = new JLabel("Date:");
        l8 = new JLabel("DD/MM/YYYY");
        t1 = new JTextField(10);
        l8.setForeground(Color.gray);
        l2.setBounds(50,45,50,30);                            // X axis,Y axis, width, height
        t1.setBounds(140,50,300,20);
        l8.setBounds(140,60,100,30);
        p2.add(l2);
        p2.add(t1);
        p2.add(l8);

        l3 = new JLabel("Group Number:");
        String[] group_no ={"Group 1","Group 2","Group 3", "Group 4"};
        cb1 = new JComboBox(group_no);
        l3.setBounds(500,45,150,30);
        cb1.setBounds(630,50,200,20);
        //cb1.setSelectedIndex(1);
        //cb1.addActionListener(this);
        p2.add(l3);
        p2.add(cb1);

        l4 = new JLabel("Item Name:");
        String[] item_name = {"Item1","Item2","Item3"};
        cb2 = new JComboBox(item_name);
        l4.setBounds(50,100,80,30);                            // X axis,Y axis, width, height
        cb2.setBounds(140,105,300,20);
        p2.add(l4);
        p2.add(cb2);

        l4 = new JLabel("quantity:");
        t2 = new JTextField(10);
        t2.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char input = e.getKeyChar();//Each time user type something it gets save into a variable
                if((input<'0' || input>'9') && input != '\b'){
                    e.consume();
                    //System.out.println("Invalid character!");
                }
            }
        });
        l4.setBounds(500,100,70,30);
        t2.setBounds(570,105,80,20);
        p2.add(l4);
        p2.add(t2);

        l5 = new JLabel("Price:");
        t3 = new JTextField(10);
        //Input restriction only numbers are allowed
        t3.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char input = e.getKeyChar();//Each time user type something it gets save into a variable
                if((input<'0' || input>'9') && input !='.'){
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
        l5.setBounds(670,100,50,30);
        t3.setBounds(720,105,110,20);
        p2.add(l5);
        p2.add(t3);

        l6 = new JLabel("Raw Material Cost:");
        t4 = new JTextField(10);
        //Input restriction only numbers are allowed
        t4.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char input = e.getKeyChar();//Each time user type something it gets save into a variable
                if((input<'0' || input>'9') && input !='.'){
                    e.consume();
                }
            }
        });
        l6.setBounds(50,150,150,30);
        t4.setBounds(190,155,250,20);
        p2.add(l6);
        p2.add(t4);

        l7 = new JLabel("Total Sales:");
        t5 = new JTextField(10);
        //Input restriction only numbers are allowed
        t5.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char input = e.getKeyChar();//Each time user type something it gets save into a variable
                if((input<'0' || input>'9') && input !='.'){
                    e.consume();
                }
            }
        });
        l7.setBounds(50,200,100,30);
        t5.setBounds(150,205,290,20);
        p2.add(l7);
        p2.add(t5);

        frame.add(p2, BorderLayout.CENTER);


        //this is form the last panel wich has some bottuns
        p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        b1 = new JButton("Cancel");
        b2 = new JButton("Reset");
        b3 = new JButton("Save");
        b2.addActionListener(new setit());
        b3.addActionListener(new checkinput());//chould verify the form befor validation
        //this action is use to exit from the application using "Cancel Button"
        b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent arg0){System.exit(0);}});
        p3.add(b1);
        p3.add(b2);
        p3.add(b3, BorderLayout.CENTER);
        p3.setBackground(Color.ORANGE);
        frame.add(p3, BorderLayout.SOUTH);
        //pack();
        //Make everything appearing
        frame.setVisible(true);
        //Set default option form closing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    // form validation action listener
    class checkinput implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {new inputalert();/*
            if((e.getSource() == b3) || (e.getSource() == i2))
            {
                String get = t2.getText().toString();
                char empty = ('@');
                for(int i=0; i<get.length();i++)
                {
                    if(get.charAt(i)==empty)
                    {
                        new inputalert();
                    }
                }
            }*/
        }
    }
    class setit implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            resetit rt = new resetit();
            t1.setText(rt.sqr("00/00/0000"));
            t2.setText(rt.sqr(""));
            t3.setText(rt.sqr("Rs "));
            t4.setText(rt.sqr("Rs "));
            t5.setText(rt.sqr("Rs "));

        }
    }



    //Main function, here used just to call
    public static void main(String[] args)
    {
       new MajhiMaitrinCharitableTrust();
       
    }   

}