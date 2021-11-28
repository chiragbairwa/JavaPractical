import java.applet.Applet;
import java.awt.*;

public class j72 extends Applet{
	GridLayout gl = new GridLayout(3, 3);

	Button btn1=new Button("Click1");
	Button btn2=new Button("Click2");
	Button btn3=new Button("Click3");
	
	public void init(){
		setLayout(gl);
		add(btn1);
		add(btn2);
		add(btn3);
		System.out.println(this.getLayout());
	}
}
/*<applet code="j72.class" width="300" height="300"></applet>*/