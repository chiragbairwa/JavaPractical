import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class j78 extends Applet implements MouseListener{
    Button btn = new Button("Click");
    Label lbl = new Label("Mouse Event..");

    public void init(){
        btn.addMouseListener(this);
        add(btn);
        add(lbl);
    }
    public void paint(Graphics g){}
    public void mouseClicked(java.awt.event.MouseEvent me){
        lbl.setText("MouseClicked");
    }
    public void mousePressed(java.awt.event.MouseEvent me){
        lbl.setText("MousePressed");
    }
    public void mouseReleased(java.awt.event.MouseEvent me){
        lbl.setText("MouseReleased");
    }
    public void mouseEntered(java.awt.event.MouseEvent me){
        lbl.setText("MouseEntered");
    }
    public void mouseExited(java.awt.event.MouseEvent me){
        lbl.setText("MouseExited");
    } 
}

/*<applet code="j78.class" height="300" width="300"></applet> */
