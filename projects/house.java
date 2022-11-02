package projects;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class house extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;

    public void paintComponent(Graphics g) {
        //drawLine(starting x, starting y, end x, end y)
        //setColor(Color.COLOR)
        //draw.String("what you want to say")
        //drawRect(start x, start y, width, height)
        //drawArc(start x, start y, width, height, start angle, end angle)


        // draw will give outline, fill will give colored in
        

        super.paintComponent(g);

        //g.setColor(Color.RED);
        //g.drawLine(350 , 50 , 50 ,350);

        //g.setColor(Color.BLUE);
        //g.fillOval(50, 50, 70, 50);

        //g.setColor(Color.BLUE);
        //g.fillOval(260, 50, 70, 50);

        //g.setColor(Color.BLACK);
        //g.setFont(getFont().deriveFont(50));
        //g.drawString("car go vroom vroom",  50, 200);


        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 30000, 15000);

        g.setColor(Color.GREEN.darker());
        g.fillOval(-750, 280, 2000, 500);

        g.setColor(Color.WHITE);
        g.fillOval(500, 190, 50, 40);

        g.setColor(Color.WHITE);
        g.fillOval(535, 200, 30, 30);

        g.setColor(Color.WHITE);
        g.fillOval(485, 200, 30, 20);


        g.setColor(Color.WHITE);
        g.fillOval(650, 150, 50, 40);

        g.setColor(Color.WHITE);
        g.fillOval(685, 160, 30, 30);

        g.setColor(Color.WHITE);
        g.fillOval(635, 160, 30, 20);

        g.setColor(Color.WHITE);
        g.fillOval(385, 100, 30, 20);


        //house
        g.setColor(Color.CYAN.darker());
        g.fillRect(50, 150, 300, 150);

        

        //door
        g.setColor(Color.BLUE.darker());
        g.fillRect(300, 250, 25, 50);

        g.setColor(Color.YELLOW.darker());
        g.fillOval(305, 275, 5, 5);


        //left window 
        g.setColor(Color.BLUE.darker());
        g.fillRect( 125, 225, 25, 25);

        g.setColor(Color.BLUE.darker());
        g.fillRect( 95, 225, 25, 25);

        g.setColor(Color.BLUE.darker());
        g.fillRect( 125, 255, 25, 25);

        g.setColor(Color.BLUE.darker());
        g.fillRect( 95, 255, 25, 25);

        g.setColor(Color.BLUE.darker());
        g.drawRect(95 , 225 , 55 ,55);


        //right window
        g.setColor(Color.BLUE.darker());
        g.fillRect( 225, 225, 25, 25);

        g.setColor(Color.BLUE.darker());
        g.fillRect( 195, 225, 25, 25);

        g.setColor(Color.BLUE.darker());
        g.fillRect( 225, 255, 25, 25);

        g.setColor(Color.BLUE.darker());
        g.fillRect( 195, 255, 25, 25);

        g.setColor(Color.BLUE.darker());
        g.drawRect(195 , 225 , 55 ,55);

        //Roof
        g.setColor(Color.BLUE.darker());
        g.fillPolygon(new int[] {30, 200, 370}, new int[] {150, 50, 150}, 3);


        //g.setColor(Color.blue);
        //g.drawArc( 50, 150, 300, 20, 0 , -180);

        //bushes 
        g.setColor(Color.GREEN.darker().darker());
        g.fillOval(50, 270, 50, 40);

        g.setColor(Color.GREEN.darker().darker());
        g.fillOval(85, 280, 30, 30);

        g.setColor(Color.GREEN.darker().darker());
        g.fillOval(35, 285, 30, 20);

        g.setColor(Color.GREEN.darker().darker());
        g.fillOval(220, 270, 50, 40);

        g.setColor(Color.GREEN.darker().darker());
        g.fillOval(255, 280, 30, 30);

        g.setColor(Color.GREEN.darker().darker());
        g.fillOval(205, 285, 30, 20);


        //ferrari
        g.setColor(Color.RED);
        g.fillRect(425, 300, 265, 15);

        g.setColor(Color.RED);
        g.fillRect(423, 315, 263, 5);

        g.setColor(Color.RED);
        g.fillRect(430, 295, 270, 8);

        g.setColor(Color.RED);
        g.fillRect(450, 290, 245, 7);

        g.setColor(Color.RED);
        g.fillRect(450, 300, 245, 10);

        g.setColor(Color.RED);
        g.fillRect(470, 287, 225, 7);

        g.setColor(Color.RED);
        g.fillRect(490, 280, 207, 7);

        g.setColor(Color.RED);
        g.fillRect(510, 275, 162, 5);

        g.setColor(Color.RED);
        g.fillRect(520, 270, 126, 5);

        g.setColor(Color.RED);
        g.fillRect(530, 265, 106, 5);


        //winsdow
        g.setColor(Color.BLACK);
        g.fillRect(533, 271, 100, 10);

        g.setColor(Color.BLACK);
        g.fillRect(527, 276, 110, 5);

        g.setColor(Color.BLACK);
        g.fillRect(517, 281, 120, 5);

        //Body lines
        g.setColor(Color.BLACK);
        g.fillRect(587, 301, 25, 5);

        g.setColor(Color.BLACK);
        g.drawLine(587 , 301 , 547 ,301);

        g.setColor(Color.BLACK);
        g.fillRect(587, 295, 25, 5);

        g.setColor(Color.BLACK);
        g.drawLine(587 , 295 , 547 ,295);

        g.setColor(Color.BLACK);
        g.fillRect(587, 307, 25, 5);

        g.setColor(Color.BLACK);
        g.drawLine(587 , 307 , 547 ,307);


        g.setColor(Color.BLACK);
        g.fillRect(690, 287, 5, 10);

        g.setColor(Color.BLACK);
        g.drawString("ferrari",  700, 350);


            //wheels
        g.setColor(Color.BLACK.darker());
        g.fillOval(480, 290, 40, 40);

        g.setColor(Color.BLACK.darker());
        g.fillOval(630, 290, 40, 40);

        g.setColor(Color.GRAY.darker());
        g.fillOval(485, 295, 30, 30);

        g.setColor(Color.GRAY.darker());
        g.fillOval(635, 295, 30, 30);

        int x = 300;
        while(x < 650){

            g.drawArc(x, 50, 50, 50, 0, 90);
            g.drawArc(x+50, 50, 50, 50, 90, 90);

            x+=100;

        }

        

        


    }

    public static void main(String[] args) {

        var panel = new house();

        var frame = new JFrame("A simple graphics program");
        frame.setSize(800, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }
}

