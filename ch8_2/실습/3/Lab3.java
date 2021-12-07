import java.awt.*;
import javax.swing.*;

public class Lab3 extends JFrame {
    public Lab3() {
        this.setTitle("FlowLayout Practice");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();

        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JLabel("100 + 200"));
        contentPane.add(new JButton("="));
        contentPane.add(new JLabel("300"));

        this.setSize(400, 100);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Lab3();

    }
}