//Write a program to  show the example of button size increase or decrease 

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class j80 extends Applet implements ActionListener {
	int btn_x = 20;
	int btn_y = 30;

	public void init() {

		button1 = new Button("Button 1");
		add(button1);
		button1.setSize(btn_x, btn_y);
		button1.addActionListener(this);

		button2 = new Button("Increase");
		add(button2);
		button2.addActionListener(this);

		button3 = new Button("Decrease");
		add(button3);
		button3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button2) {
			btn_x = btn_x + 10;
			btn_y = btn_y + 10;
			button1.setSize(btn_x, btn_y);
		}
		else if(e.getSource() == button3){
			btn_x = btn_x - 10;
			btn_y = btn_y - 10;
			button1.setSize(btn_x, btn_y);
		}
	}	

	Button button1, button2, button3;
}


/*<applet code="j80.class" width="300" height="300"></applet> */