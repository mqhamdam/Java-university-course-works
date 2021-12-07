import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * Lab5
 */
public class Lab5 extends JFrame {
    private int coordX, coordY;

    public Lab5() {
        setTitle("Lab5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container _contentPane = getContentPane();
        _contentPane.setLayout(null);

        JLabel label = new JLabel("C");
        label.setBounds(50, 50, 40, 40);

        _contentPane.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                coordX = (int) (Math.random() * (getContentPane().getWidth() - label.getWidth()));
                coordY = (int) (Math.random() * (getContentPane().getHeight() - label.getHeight()));
                label.setLocation(coordX, coordY);
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        _contentPane.add(label);

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab5();
    }
}