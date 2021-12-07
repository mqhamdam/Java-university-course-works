import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Lab2 extends JFrame {
    public Lab2() {
        setTitle("키 누리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Container _contentPane = getContentPane();
        _contentPane.setBackground(Color.CYAN);
        _contentPane.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == 'R') {
                    _contentPane.setBackground(Color.RED);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                _contentPane.setBackground(Color.CYAN);
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }
        });

        setSize(500, 500);
        setVisible(true);

        _contentPane.setFocusable(true);
        _contentPane.requestFocus();
    }

    public static void main(String[] args) {
        new Lab2();
    }
}