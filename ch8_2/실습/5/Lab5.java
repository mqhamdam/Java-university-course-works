import java.awt.*;
import javax.swing.*;

public class Lab5 extends JFrame {
    public Lab5() {
        this.setTitle("4x4 Color Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(4, 4));

        Color[] colors = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
                Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.BLACK, Color.DARK_GRAY, Color.WHITE, };

        JLabel[] jLabels = new JLabel[16];
        int randNum = 0;
        for (int i = 0; i < 16; i++) {
            jLabels[i] = new JLabel(Integer.toString(i));
            randNum = (int) (Math.random() * 12);
            jLabels[i].setOpaque(true);
            jLabels[i].setBackground(colors[randNum]);
            contentPane.add(jLabels[i]);
        }

        this.setSize(500, 250);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Lab5();

    }
}