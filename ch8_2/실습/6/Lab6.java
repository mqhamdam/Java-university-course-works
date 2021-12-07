import java.awt.*;
import javax.swing.*;

public class Lab6 extends JFrame {
    public Lab6() {
        this.setTitle("Random Labels");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();

        contentPane.setLayout(null);

        JLabel[] jLabels = new JLabel[20];
        int x = 0;
        int y = 0;
        for (int i = 0; i < 20; i++) {
            jLabels[i] = new JLabel(Integer.toString(i));

            x = (int) (Math.random() * 220) + 30;
            y = (int) (Math.random() * 220) + 30;

            jLabels[i].setBounds(x, y, 20, 20);
            jLabels[i].setForeground(Color.MAGENTA);
            contentPane.add(jLabels[i]);
        }

        this.setSize(300, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Lab6();

    }
}