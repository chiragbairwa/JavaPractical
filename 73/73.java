//73. Program to show the example of add, mul, sub,div in frame

import java.awt.*;
import java.awt.event.*;
class Myframe extends Frame implements MouseListener,WindowListener{
    Label l1=new Label("First num");
    Label l2=new Label("Second num");
    Label l3=new Label("Result");
    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    Button b1=new Button("Add");
    Button b2=new Button("Sub");
    Button b3=new Button("Mul");
    Button b4=new Button("Div");
    public void windowOpened(java.awt.event.WindowEvent w){}
    public void windowClosing(java.awt.event.WindowEvent w){
        System.exit(1);
    }
    public void windowClosed(java.awt.event.WindowEvent w){}
    public void windowIconified(java.awt.event.WindowEvent w){}
    public void windowDeiconified(java.awt.event.WindowEvent w){}
    public void windowActivated(java.awt.event.WindowEvent w){}
    public void windowDeactivated(java.awt.event.WindowEvent w){}
    Myframe(){
        this.setSize(500,500);
        this.setLayout(null);
        this.setTitle("My Frame");
        l1.setBounds(40,50,80,30);
        add(l1);
        l2.setBounds(40,100,80,30);
        add(l2);
        l3.setBounds(40,150,80,30);
        add(l3);
        t1.setBounds(150,50,80,30);
        add(t1);
        t2.setBounds(150,100,80,30);
        add(t2);
        t3.setBounds(150,150,80,30);
        add(t3);
        b1.setBounds(30,200,50,30);
        add(b1);
        b2.setBounds(80,200,50,30);
        add(b2);
        b3.setBounds(130,200,50,30);
        add(b3);
        b4.setBounds(180,200,50,30);
        add(b4);
        addWindowListener((WindowListener)this);
        b1.addMouseListener(this);
        b2.addMouseListener(this);
        b3.addMouseListener(this);
        b4.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent me){
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        if(me.getSource()==b1){
            t3.setText((num1+num2)+"");
        }
        else if(me.getSource()==b2){
            t3.setText((num1-num2)+"");
        }
        else if(me.getSource()==b3){
            t3.setText((num1*num2)+"");
        }
        else if(me.getSource()==b4){
            t3.setText((num1/num2)+"");
        }
    }
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
}
class j73{
    public static void main(String[] args) {
        Myframe f=new Myframe();
        f.setVisible(true);
    }
}
