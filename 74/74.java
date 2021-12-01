//74. Program to show the example of visibility

import java.awt.*;
import java.awt.event.*;

class visibility extends Frame implements MouseListener{
    Button b1=new Button("click");
    Button b2=new Button("click here");
    visibility(){
        this.setLayout(null);
        this.setSize(500,500);
        b1.setBounds(30,200,50,30);
        add(b1);
        b2.setBounds(80,200,50,30);
        add(b2);
        b1.addMouseListener(this);
        b2.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent me){
        if(me.getSource()==b1){
            b1.setVisible(false);
            b2.setVisible(true);
        }
        else if(me.getSource()==b2){
            b2.setVisible(false);
            b1.setVisible(true);
        }
    }
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
}
class j74{
    public static void main(String[] args) {
        visibility v = new visibility();
        v.setVisible(true);
    }
}
