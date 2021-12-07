import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab4 extends JFrame {

    public Lab4() {
        setTitle("이미지 위에 원 드래깅");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());
        setContentPane(new MyPanel());
        setSize(400,400);
        setVisible(true);
    }

    private class MyPanel extends JPanel {
        private Point p;
        public MyPanel(){
            addMouseMotionListener(new MouseMotionListener() {
               @Override
               public void mouseDragged(MouseEvent e) {
                   p = e.getPoint();
                   repaint();
               }
               @Override
                   public void mouseMoved(MouseEvent e) {                  }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Image _image1 = new ImageIcon("images/back.jpg").getImage();

            final int width = getWidth();
            final int height = getHeight();

            g.drawImage(_image1, 0, 0, width, height ,this);
            g.setColor(Color.GREEN);
            
            if(p!=null)
            g.fillOval(p.x, p.y, 10, 10);
            
        }
    }

   public static void main(String[] args) {
       new Lab4();
   }
}