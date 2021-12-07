import javax.swing.*;
import java.awt.*;

public class Lab1_4 extends JFrame {

    public Lab1_4() {
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
            int x = 0,y = 0;
            for (int i = 0; i < 9; i++) {
                int width = getWidth();
                int height = getHeight(); 
                g.drawLine(width/10 + x, 0, width/10+x, height);
                g.drawLine(0, height/10+y, width, height/10+y);
                x+=width /10;
                y+=height / 10;
            }
        }
    }

   public static void main(String[] args) {
       new Lab1_4();
   }
}