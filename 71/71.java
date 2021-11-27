import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Button;
import java.awt.BorderLayout;

public class borderlayout extends Applet
{
	Button b1=new Button("Click 1");
	Button b2=new Button("Click 2");
	BorderLayout b=new BorderLayout();
	public void init()
	{
	this.setLayout(b);
	add(b1,BorderLayout.NORTH);
	add(b2,BorderLayout.SOUTH);
	}
	public void paint(Graphics g)
	{
	
	}
}
/*<applet code="borderlayout.class" width="300" height="300"></applet>*/