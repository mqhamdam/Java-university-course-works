import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Lab5 extends JFrame {

    public Lab5() {
        setTitle("마우스로 폐다각형 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());
        setContentPane(new MyPanel());
        setSize(400,400);
        setVisible(true);
    }

    private class MyPanel extends JPanel {
        private Vector<Point> _vPoint = new Vector<Point>();
        
        public MyPanel() {
            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    Point p = e.getPoint();
                    _vPoint.add(p);

                    repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            for (int i = 0; i < _vPoint.size(); i++) {
                if (i == 0) {
                    g.drawLine(_vPoint.elementAt(0).x, _vPoint.elementAt(0).y, _vPoint.lastElement().x, _vPoint.lastElement().y);
                }
            }
            for (int i = 0; i < _vPoint.size()- 1; i++) {
                g.drawLine(_vPoint.elementAt(i).x, _vPoint.elementAt(i).y, _vPoint.elementAt(i+1).x, _vPoint.elementAt(i+1).y);
            }
            
        }
    }

   public static void main(String[] args) {
       new Lab5();
   }
}