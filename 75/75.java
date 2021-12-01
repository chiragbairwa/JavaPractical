//75. Program to show the example of box move every corner

import java.awt.*;
import java.awt.event.MouseEvent;

class boxmove extends Frame implements Runnable{
    Button movb=new Button("Move");
    Button boxb=new Button();
    int xPos=20, yPos=250;
    int x=0,y=0;
    Thread t1;
    int bun=1,run=0;
    boxmove(){
       setSize(500,300);
       setLayout(null);
       movb.setBounds(200,130, 70, 30);
       add(movb);
       boxb.setBounds(xPos,yPos, 70, 30);
       boxb.setBackground(Color.blue);
       add(boxb);
       setVisible(true);
       t1=new Thread(this);
       movb.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent me){
                t1.start();
            }
        });
    }
    
    public void run(){
        while(true){
            if(boxb.getX()>this.getX()&&boxb.getX()<this.getWidth()-100&&bun==1){
                run=2;
                xPos=xPos+11;
                boxb.setBounds(xPos,boxb.getY(),70,30);
                try{Thread.sleep(100);}catch(Exception e){}
            }
            else if(boxb.getY()>this.getY()+50&&boxb.getY()<this.getHeight()&&run==2){
                bun=3;
                yPos=yPos-11;
                boxb.setBounds(boxb.getX(),yPos,70,30);
                try{Thread.sleep(100);}catch(Exception e){}
            }
            else if(boxb.getX()>this.getX()+20&&boxb.getX()<this.getWidth()&&bun==3){
                run=4;
                xPos=xPos-11;
                boxb.setBounds(xPos,boxb.getY(),70,30);
                try{Thread.sleep(100);}catch(Exception e){}
            }
            else if(boxb.getY()>this.getY()&&boxb.getY()<this.getHeight()-50&&run==4){
                bun=0;
                yPos=yPos+11;
                boxb.setBounds(boxb.getX(),yPos,70,30);
                try{Thread.sleep(100);}catch(Exception e){}
            }
        }
    }
}
class j75{
    public static void main(String[] args){
        boxmove b=new boxmove();
    }
}