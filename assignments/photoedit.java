import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;



public class photoedit extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;

    public void paintComponent(Graphics g) {
        BufferedImage Chad = null;
        try{
            Chad = ImageIO.read(new File("Chad.PNG"));
        }
        catch(IOException e){}
        g.drawImage(Chad, 0, 0, 1800, 400, getBackground(), getFocusCycleRootAncestor());
        
        g.setColor(Color.BLACK);
        g.fillOval(500, 160, 200, 75);
        g.fillOval(1000, 160, 200, 75);

        g.drawArc(600, 150, 250, 50, 0, -90);
        g.drawArc(850, 150, 250, 50, 180, 90);

        g.drawLine(510, 180, 300, 130);

    }

    public static void main(String[] args) {

       var panel = new photoedit();

       var frame = new JFrame("A Chad if I've every seen one");
       frame.setSize(400, 400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().add(panel, BorderLayout.CENTER);
       frame.setVisible(true);

    }
}
    