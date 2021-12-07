import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Lab3 extends JFrame {
    public Lab3() {
        setTitle("드래깅동안...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Container _contentPane = getContentPane();
        _contentPane.setBackground(Color.GREEN);

        _contentPane.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent e) {
                _contentPane.setBackground(Color.GREEN);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        _contentPane.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                _contentPane.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }

        });
        setSize(500, 500);
        setVisible(true);

        _contentPane.setFocusable(true);
        _contentPane.requestFocus();
    }

    public static void main(String[] args) {
        new Lab3();
    }
}