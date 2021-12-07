import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MouseEvent1_Button extends JFrame {
	public MouseEvent1_Button(String str) {
		super(str);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JButton button1 = new JButton("ONE");
		JButton button2 = new JButton("TWO");

		add(button1);
		add(button2);

		addMouseListener(new MouseEventListener());

		button1.addMouseListener(new MouseEventListener());
		button2.addMouseListener(new MouseEventListener());

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseEvent1_Button("Mouse Event first assignment");
	}
}

class MouseEventListener implements MouseListener {
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse onClick");
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse onPressed");
	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Released");
	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered");
	}

	public void mouseExited(MouseEvent e) {
		System.out.println("MouseExited");
	}
}