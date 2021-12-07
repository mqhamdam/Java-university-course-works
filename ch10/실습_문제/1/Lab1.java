import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab1 extends JFrame {
    private JLabel[] label = new JLabel[4];
    private ImageIcon[] ii = { new ImageIcon("images/1.jpg"), new ImageIcon("images/2.jpg"),
            new ImageIcon("images/3.jpg"), new ImageIcon("images/4.jpg") };

    public Lab1() {
		this.setTitle("4 Images");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new GridLayout());
		
		for(int i = 0; i < label.length; i++) {
			label[i] = new JLabel(ii[i]);
			c.add(label[i]);
		}
		
		this.setSize(500, 180);
		this.setVisible(true);
	}
    static public void main(String[] arg) {
        new Lab1();
    }
}
