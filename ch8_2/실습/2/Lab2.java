import java.awt.*;
import javax.swing.*;

public class Lab2 extends JFrame {
    public Lab2() {
        this.setTitle("BorderLayout Practice");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();

        contentPane.setLayout(new BorderLayout(50, 20));

        contentPane.add(new JButton("North"), BorderLayout.NORTH);
        contentPane.add(new JButton("South"), BorderLayout.SOUTH);
        contentPane.add(new JButton("West"), BorderLayout.WEST);
        contentPane.add(new JButton("East"), BorderLayout.EAST);
        contentPane.add(new JButton("Center"), BorderLayout.CENTER);

        this.setSize(400, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Lab2();

    }
}