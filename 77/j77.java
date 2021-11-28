//Program to show the example of font property change

import java.applet.Applet;
import java.awt.*;

public class j77 extends Applet{
	Label lbl1 = new Label ();
	Label lbl2 = new Label ();
	
	public void init(){
		add(lbl1);
		add(lbl2);

		lbl1.setText("This is a Default FONT");
		
		lbl2.setFont(new Font("Arial", Font.BOLD, 19));
		lbl2.setText("This is a Arial FONT");
		
	}
}

/*<applet code="j77.class" width="300" height="300"></applet> */