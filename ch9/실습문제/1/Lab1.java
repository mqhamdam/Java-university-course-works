import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Lab1 extends JFrame {
    public Lab1() {
        setTitle("Java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Container _contetPane = getContentPane();

        _contetPane.setLayout(new FlowLayout());

        JLabel _jLabel = new JLabel("자기야");
        _jLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent e) {
                _jLabel.setText("사랑해");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                _jLabel.setText("자기야");
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }
        });
        _contetPane.add(_jLabel);

        setSize(200, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab1();
    }
}