//package assignments;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Point;
//import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class multiply extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        
        g.setColor(Color.CYAN.darker());

        for(int x=-400; x<=600 ; x+=40){
            g.drawLine(x, 0, x, 600);
        }

        for(int y=0; y<=600 ;y+=40){
            g.drawLine(0,y, 600,y);
        }

        for(int x=0; x<=15; x++){
            for(int y=0; y<=15; y++){
                g.drawString(x*y + "", x*40-30, y*40-10 );
            }

        }

    }
   

    public static void main(String[] args) {

        var panel = new multiply();
        var frame = new JFrame("A simple graphics program");
        frame.setSize(617, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }
}

