import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

/**
 * Lab4
 */
public class Lab4 extends JFrame {
    private Font font;
    private int fontSize;

    public Lab4() {
        setTitle("Lab4");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container _contentPane = getContentPane();

        _contentPane.setLayout(new FlowLayout());
        JLabel label = new JLabel("Love Java");
        _contentPane.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
                font = label.getFont();
                fontSize = font.getSize();

                if (e.getKeyChar() == '+') {
                    label.setFont(new Font("Arial", Font.PLAIN, fontSize + 5));
                } else if (e.getKeyChar() == '-') {
                    label.setFont(new Font("Arial", Font.PLAIN, fontSize - 5));
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        _contentPane.add(label);
        _contentPane.setFocusable(true);
        _contentPane.requestFocus();

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab4();
    }
}