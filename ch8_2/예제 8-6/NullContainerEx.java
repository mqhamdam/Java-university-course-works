import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
    public NullContainerEx() {
        setTitle("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        JLabel label = new JLabel("Hello, Press Buttons");
        label.setLocation(130, 50);
        label.setSize(200, 20);
        contentPane.add(label);

        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(Integer.toString(i));
            button.setLocation(i * 15, i * 15);
            button.setSize(50, 20);
            contentPane.add(button);
        }

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        NullContainerEx nullContainerEx = new NullContainerEx();

    }
}