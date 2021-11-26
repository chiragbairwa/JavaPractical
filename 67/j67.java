//Program to show the example of Graphic class function in applet

import java.applet.Applet;  
import java.awt.Graphics;  

public class j67 extends Applet{
	public void init(){ System.out.println("init function "); }
	public void start(){ System.out.println ("start function"); }
	
	public void paint (Graphics g){
		g.drawString("Triangle", 100,150);
		g.drawLine(100, 100, 100, 0);
		g.drawLine(0, 100, 100, 0);
		g.drawLine(100, 100, 0, 100);
		System.out.println ( "Paint function "); 
	}

	public void stop(){ System.out.println("stop function "); }
	public void destroy(){ System.out.println("destroy function"); }	
}

/* 
<applet code="j67.java" width="300" height="300"> </applet> 
*/ 