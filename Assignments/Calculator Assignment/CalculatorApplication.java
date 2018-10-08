/*
Author : Tejas Ashok Shinde
SICSR MSc CA
18030142037
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalculatorApplication implements ActionListener
{
    JFrame frame;
    JLabel numberLabel1,numberLabel2,resLabel,tagLabel;
    JTextField mTextField,nTextField,resTextField;
    JButton addButton,subButton,mulButton,divButton,resetButton,exitButton;

    public CalculatorApplication()
    {

        frame = new JFrame("Simple Calculator");
        frame.setSize(1000,800);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

/*_______________________________________________________________________________
CREATING ELEMENTS OF FRAME
_______________________________________________________________________________*/

        numberLabel1 = new JLabel("<html><span style='font-size:10px'>" + "1st Number" + "</span></html>");
        numberLabel2 = new JLabel("<html><span style='font-size:10px'>" + "2nd Number" + "</span></html>");
        resLabel = new JLabel("<html><span style='font-size:12px'>" + "Result" + "</span></html>");
        tagLabel = new JLabel("<html><p style='font-size:9px;color:#A9A9A9'>" + "Ultra Simple Calculator Version 2.0" + "</p></html>");
        mTextField = new JTextField();
        nTextField = new JTextField();
        resTextField = new JTextField();
        resTextField.setEnabled(false);
        addButton = new JButton("Add (+)");
        subButton = new JButton("Subtract (-)");
        mulButton = new JButton("Multiply (*)");
        divButton = new JButton("Divide (/)");
        resetButton = new JButton("Reset");
        exitButton = new JButton("Exit");

/*_______________________________________________________________________________
ADDING ELEMENTS TO FRAME
_______________________________________________________________________________*/

        frame.add(numberLabel1);
        frame.add(numberLabel2);
        frame.add(resLabel);
        frame.add(tagLabel);
        frame.add(mTextField);
        frame.add(nTextField);
        frame.add(resTextField);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(mulButton);
        frame.add(divButton);
        frame.add(resetButton);
        frame.add(exitButton);
/*_______________________________________________________________________________
ADDING ACTION LISTENER TO BUTTONS
_______________________________________________________________________________*/

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        resetButton.addActionListener(this);
        exitButton.addActionListener(this);

/*_______________________________________________________________________________
SETTING BOUNDS
_______________________________________________________________________________*/

        int lWidth = 200 , lHeight = 50 , ly = 250;
        numberLabel1.setBounds(145,ly,lWidth,lHeight);
        numberLabel2.setBounds(445,ly,lWidth,lHeight);
        resLabel.setBounds(745,ly,lWidth,lHeight);
        tagLabel.setBounds(400,600,200,50);

        int tWidth = 250 , tHeight = 40 , ty = 300;
        mTextField.setBounds(50,ty,tWidth,tHeight);
        nTextField.setBounds(350,ty,tWidth,tHeight);
        resTextField.setBounds(650,ty,tWidth,tHeight);

        int bWidth = 120 , bHeight = 30 , by = 400;
        addButton.setBounds(140,by,bWidth,bHeight);
        subButton.setBounds(340,by,bWidth,bHeight);
        mulButton.setBounds(540,by,bWidth,bHeight);
        divButton.setBounds(740,by,bWidth,bHeight);
        resetButton.setBounds(340,by+100,bWidth,bHeight);
        exitButton.setBounds(540,by+100,bWidth,bHeight);
    }

/*_______________________________________________________________________________
ELEMENT HANDLING AND DATA MANIPULATION
_______________________________________________________________________________*/

    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            if(isTextFieldEmpty(mTextField, nTextField))
            {
                    double mNumber = Double.parseDouble(mTextField.getText());
                    double nNumber = Double.parseDouble(nTextField.getText());

                    if(ae.getSource() == addButton)
                    {
                        resTextField.setText(String.valueOf(mNumber + nNumber));
                    }

                    else if(ae.getSource() == subButton)
                    {
                        resTextField.setText(String.valueOf(mNumber - nNumber));
                    }

                    else if(ae.getSource() == mulButton)
                    {
                        // double result = ;
                        resTextField.setText(String.valueOf(mNumber * nNumber));
                    }

                    else if(ae.getSource() == divButton)
                    {
                        if(nNumber == 0)
                        {
                            JOptionPane.showMessageDialog(frame, "Cannot Divide by zero");
                        }
                        resTextField.setText(String.valueOf(mNumber / nNumber));
                    }
            }

            else if(ae.getSource() == resetButton)
            {
                clearTextFields(mTextField, nTextField);
            }

            else if(ae.getSource() == exitButton)
            {
                frame.dispose();
                System.exit(0);
            }

            else
            {
                JOptionPane.showMessageDialog(frame, "Please fill in all the enabled text fields.");
            }

          }
          catch(ArithmeticException aexc)
          {
              JOptionPane.showMessageDialog(frame, "Error");
          }
          catch(NumberFormatException nfe)
          {
              JOptionPane.showMessageDialog(frame, "Please enter a valid integer value");
          }
    }

    boolean isTextFieldEmpty(JTextField mTextField, JTextField nTextField)
    {
      if(mTextField.getText().equals("") || nTextField.getText().equals(""))
      {
          return false;
      }
      else
        return true;
    }

    void clearTextFields(JTextField mTextField,JTextField nTextField)
    {
        mTextField.setText("");
        nTextField.setText("");
    }

/*_______________________________________________________________________________
MAIN
_______________________________________________________________________________*/

    public static void main(String args[])
    {
        new CalculatorApplication();
    }
}
