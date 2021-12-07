import javax.swing.*;
import java.awt.*;

public class Lab3_1 extends JFrame {

    public Lab3_1() {
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
            Image _image1 = new ImageIcon("images/bg.jpg").getImage();
            Image _image2 = new ImageIcon("images/back.jpg").getImage();

            final int width = getWidth();
            final int height = getHeight();

            g.drawImage(_image1, 0, 0, width/2, height ,this);
            g.drawImage(_image2, width/2, 0, width/2, height, this);
            
        }
    }

   public static void main(String[] args) {
       new Lab3_1();
   }
}