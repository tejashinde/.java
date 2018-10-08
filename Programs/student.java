import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class student extends Frame implements ActionListener
{String msg;

  Button b1=new Button("Add");
  Button b2=new Button("Delete");
  Button b3=new Button("Display");
  Label l11=new Label("Database Connection",Label.CENTER);
  Label l1=new Label("ID : ",Label.LEFT);
  Label l2=new Label("Name : ",Label.LEFT);
  TextField t1=new TextField();
  TextField t2=new TextField();
public student()
 {
  addWindowListener(new myWindowAdapter());
  setBackground(Color.black);
  setForeground(Color.red);
  setLayout(null);
  add(l11);
  add(l1);
  add(l2);
  add(t1);
  add(t2);
  add(b1);
  add(b2);
  add(b3);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  add(b1);
  add(b2);
  add(b3);
  l11.setBounds(10,40,280,20);
  l1.setBounds(30,60,90,20);
  l2.setBounds(30,90,90,20);
  t1.setBounds(120,60,170,20);
  t2.setBounds(120,90,170,20);
  b1.setBounds(30,120,50,30);
  b2.setBounds(90,120,50,30);
  b3.setBounds(150,120,50,30);
}

public void actionPerformed(ActionEvent ae)
{
    try{
    int id = Integer.parseInt(t1.getText());
    String name = t2.getText();
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/JDBC","root","");
    Statement stmt = con.createStatement();
    if(ae.getSource() == b1)
    {
        String insertStatement = "insert into student values("+id+",'"+name+"')";
        stmt.executeUpdate(insertStatement);
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f,"Inserted records Succeccfully.","Alert",JOptionPane.WARNING_MESSAGE);
        con.close();
    }
    if(ae.getSource() == b2)
    {
        String deleteStatement = "delete from student where prn=" + id ;
        stmt.executeUpdate(deleteStatement);
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f,"Deleted records Succeccfully.","Alert",JOptionPane.WARNING_MESSAGE);
        con.close();
    }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}


public void paint(Graphics g)
{g.drawString(msg,200,450);}

public static void main(String g[])
{student stu=new student();
 stu.setSize(new Dimension(500,500));
 stu.setTitle("student registration");
 stu.setVisible(true);
}
}
 class myWindowAdapter extends WindowAdapter
{public void windowClosing(WindowEvent we)
 {
  System.exit(0);
 }
}
