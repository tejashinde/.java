import java.awt.*;
class FrameDemo extends Frame{
	FrameDemo(){
		Button b = new Button("Click me");
		b.setBounds(30,100,80,30);//Setting Button position
		add(b);//Adding Button to Frame
		setSize(300,300);//Set Frame Size
		setLayout(null);
		setVisible(true);//Frame will be visible , by default not visible
	}
	public static void main(String args[]){
		FrameDemo f = new FrameDemo();
	}
}