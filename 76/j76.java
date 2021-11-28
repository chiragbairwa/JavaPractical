//Program to show the example of textfield and label

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;

public class j76 extends Applet{
	Label lbl =new Label ();
	TextField txt = new TextField("This is a TextField");
	
	public void init(){
		add(lbl);
		add(txt);
		lbl.setText("This is a Label");
	}
}

/*<applet code="j76.class" width="300" height="300"></applet> */