import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * Lab5
 */
public class Lab6 extends JFrame {
    private JLabel labelArrays[] = new JLabel[12];
    private int r, g, b;

    public Lab6() {
        setTitle("Lab6");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Container _contentPane = getContentPane();
        _contentPane.setLayout(new GridLayout(4, 3));

        int i = 0;
        for (JLabel jLabel : labelArrays) {
            jLabel = new JLabel(Integer.toString(i++));
            jLabel.setBackground(Color.WHITE);

            jLabel.addMouseListener(new MouseListener() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    JLabel la = (JLabel) e.getSource();

                    r = (int) (Math.random() * 256);
                    g = (int) (Math.random() * 256);
                    b = (int) (Math.random() * 256);

                    la.setOpaque(true);
                    la.setBackground(new Color(r, g, b));
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
            _contentPane.add(jLabel);
        }

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab6();
    }
}