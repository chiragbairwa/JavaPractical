import java.applet.Applet;
import java.awt.*;

public class j71 extends Applet{

	Button btn1 = new Button("Click 1");
	Button btn2 = new Button("Click 2");
	BorderLayout b=new BorderLayout();
	
	public void init(){
		this.setLayout(b);
		add(btn1,BorderLayout.NORTH);
		add(btn2,BorderLayout.SOUTH);
	}
}
/*<applet code="j71.class" width="300" height="300"></applet>*/