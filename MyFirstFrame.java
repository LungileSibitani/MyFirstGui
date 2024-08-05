
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;


public class MyFirstFrame extends JFrame{

    public MyFirstFrame() {
        
        setTitle("My first GUI .");
        setSize(500, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setForeground(Color.red);
        setResizable(true);
        
        
    }
    
    
}
