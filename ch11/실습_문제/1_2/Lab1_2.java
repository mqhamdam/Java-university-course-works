import javax.swing.*;
import java.awt.*;

public class Lab1_2 extends JFrame {

    public Lab1_2() {
        setTitle("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());
        setContentPane(new MyPanel());
        setSize(400,400);
        setVisible(true);
    }

    private class MyPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            final int width = 60;
            final int height = 60;
            g.setColor(Color.BLUE);
            g.drawOval(50, 20, width, height);
            g.setColor(Color.BLACK);     
            g.drawOval(120,  20,  width , height);
            g.setColor(Color.RED);
            g.drawOval(190, 20, width, height);  
            g.setColor(Color.YELLOW);
            g.drawOval(85, 45, width, height);
            g.setColor(Color.GREEN);
            g.drawOval(155, 45, width, height);

        }
    }

   public static void main(String[] args) {
       new Lab1_2();
   }
}