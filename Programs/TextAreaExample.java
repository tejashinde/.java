import java.awt.*;
import javax.swing.*;

public class TextAreaExample
{
    TextAreaExample(){
        JFrame f = new JFrame();
        JTextArea area = new JTextArea("Welcome to Javapoint");
        Font font = new Font("Arial",Font.ITALIC,18);
        area.setBounds(10,30,200,200);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setFont(font);
        area.setBackground(Color.BLUE);
        f.add(area);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new TextAreaExample();
    }
}