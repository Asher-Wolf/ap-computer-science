package learning;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class graphing extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        int x = -400;
        int y = 300;
        int prevY = 0;
        int prevx = 0;

        g.setColor(Color.CYAN.darker());

        for(x=0; x<=300 ; x+=20){
            g.drawLine(x, 0, x, 300);
        }

        for(y=0; y<=300 ;y+=20){
            g.drawLine(0,y,300,y);
        }

        g.setColor(Color.RED.darker());
        for (x=0; x<=500; x+=1){
            y= (int) ((x*x)/10);
            //g.fillOval(x+150, y+50, 8 , 8);
            //g.fillOval(-x+150, y+50, 8 , 8);

            g.drawLine(x+150,y+50,prevx+150,prevY+50);
            g.drawLine(-x+150,y+50,-prevx+150,prevY+50);

            prevY = y;
            prevx = x;
            
        }

    }

    public static void main(String[] args) {

        var panel = new graphing();
        var frame = new JFrame("A simple graphics program");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }
}
