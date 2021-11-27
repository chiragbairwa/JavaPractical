import java.applet.Applet;
import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.Button;

public class gridapplet extends Applet
{
	GridLayout g=new GridLayout(3,2);
	Button b1=new Button("Click1");
	Button b2=new Button("Click2");
	Button b3=new Button("Click3");
	public void init()
	{
	setLayout(g);
	add(b1);
	add(b2);
	add(b3);
	System.out.println(this.getLayout());
	}
}
/*<applet code="gridapplet.class" width="300" height="300"></applet>*/