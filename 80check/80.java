//Write a program to show the example of button size increase or decrease

import java.awt.*;
import java.awt.event.*;
 
class j80{
 
    private static final int button_count = 10;
 
    // Declare a Frame type variable
    Frame frame;
 
    // Create an array of Button type Objects
    Button []button = new Button[button_count];
 
    public j80() {
        // Create Frame Object and pass in the Frame Name / title
        frame = new Frame("AWT GUI EXAMPLE");
 
        // Use for loop to instantiate every button object
        for(int i = 0; i < button_count; ++i){
            button[i] = new Button( "" + i );
            button[i].setSize(50, 50);
        }
 
    }
 
    public static void main(String[] args) {
 
        // Create an instance of SimpleAwtGui
        j80 window = new j80();
 
        // call the showFrame() function to display the window
        window.showFrame();
 
    }
 
    // Not necessary but good practice all codes inside this can be written inside main
    public void showFrame() {
        // set the size of the window
        frame.setSize(400, 400);
 
        // set the layout for the window
        frame.setLayout(new FlowLayout());
 
        // Add all of the buttons to the layout
        for(int i = 0; i < button_count; ++i) {
            frame.add(button[i]);
        }
 
        // Register window listener event to the frame without implementing WindowListener
        frame.addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            }
        );
 
        // set the frame visible otherwise nothing will be shown
        frame.setVisible(true);
    }
}