import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Button;

public class myapplet extends Applet
{
	Button b1=new Button("Click");
	public void init()
	{
		add(b1);
	}
	public void paint(Graphics g)
	{
	}
}
/*<applet code="myapplet class" width="300" height="300"></applet>*/