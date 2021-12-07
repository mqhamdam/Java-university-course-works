import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FlyingTextEx extends JFrame {
    private JLabel la = new JLabel("HELLO");

    public FlyingTextEx() {
        super("상,하,좌,우 키를 이용하여 텍스트 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);
        la.setSize(50, 20);
        la.setLocation(30,30);
        c.add(la);

        c.addKeyListener(new MyKeyListener());
        setSize(250, 150);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_UP:
                    la.setLocation(la.getX(), la.getY() - 10);
                    
                    break;
                case KeyEvent.VK_DOWN:
                    la.setLocation(la.getX(), la.getY() +10);

                    break;
                    case KeyEvent.VK_LEFT:
                    la.setLocation(la.getX() - 10, la.getY() );

                    break;
                    case KeyEvent.VK_RIGHT:
                    la.setLocation(la.getX() + 10, la.getY());

                    break;
                default:
                    break;
            }
            super.keyPressed(e);
        }
    }

    public static void main(String[] args) {
        new FlyingTextEx();
    }
}