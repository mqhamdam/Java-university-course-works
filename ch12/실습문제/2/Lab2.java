import javax.swing.*;
import java.awt.*;
/* import java.awt.event.*;
import java.util.*; */



public class Lab2 extends JFrame implements Runnable{

    public Lab2() {
        setTitle("원을 0.5초 간격으로 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());

        setContentPane(new MyPanel());
        Thread th = new Thread(this);
        th.start();

        setSize(300, 300);
        setVisible(true);
    }

    private class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
           // super.paintComponent(g);

            int x = (int) (Math.random() * (getWidth() - 50));
            int y = (int) (Math.random() * (getHeight() - 50));

            g.setColor(Color.MAGENTA);
            g.drawOval(x, y, 50, 50);
        }
    }

        @Override
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    
    
   public static void main(String[] args) {
       new Lab2();
   }


}