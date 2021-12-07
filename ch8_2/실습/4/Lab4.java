import java.awt.*;
import javax.swing.*;

public class Lab4 extends JFrame {
    public Lab4() {
        this.setTitle("Ten Color Buttons Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(1, 10));

        Color[] colors = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
                Color.GRAY, Color.PINK, Color.LIGHT_GRAY, };

        JButton[] jButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            jButtons[i] = new JButton(Integer.toString(i));
            jButtons[i].setOpaque(true);
            jButtons[i].setBackground(colors[i]);
            contentPane.add(jButtons[i]);
        }

        this.setSize(500, 250);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Lab4();

    }
}