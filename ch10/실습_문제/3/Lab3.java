import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab3 extends JFrame {
    private JRadioButton[] rb = new JRadioButton[2];
    private String[] color = { "Red", "Blue" };

    public Lab3() {
        setTitle("two Radio Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        ButtonGroup bg = new ButtonGroup();
        rb[0] = new JRadioButton(color[0]);
        rb[1] = new JRadioButton(color[1]);
        for (JRadioButton btn : rb) {

            c.add(btn);
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JRadioButton r = (JRadioButton)e.getSource();
                    if (r.getActionCommand() == "Red") {
                        c.setBackground(Color.red);
                    } else {
                        c.setBackground(Color.blue);
                    }

                }
            });
            bg.add(btn);
        }
        setSize(300, 300);
        setVisible(true);
    }

    static public void main(String[] arg) {
        new Lab3();
    }
}
