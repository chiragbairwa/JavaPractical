//Write a program to  show the example of changing text color

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Color;

public class j79 extends Applet{
	Label lbl1 = new Label ();
	Label lbl2 = new Label ();
	
	public void init(){
		add(lbl1);
		add(lbl2);

		lbl1.setText("This is a Default Label");
		
		lbl2.setForeground(Color.red);
		lbl2.setText("This is a Red Colour Label");
		
	}
}

/*<applet code="j79.class" width="300" height="300"></applet> */