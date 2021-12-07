import java.awt.event.*;
import javax.swing.*;

class MyWindowHandler implements WindowListener {

	public void windowOpened(WindowEvent e) {
		System.out.println("On Window opened");
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("On Window Closing");
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("On Window Closed");
	}

	public void windowActivated(WindowEvent e) {
		System.out.println("On Window Activated");
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("On Window Deactivated");
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("On window Iconified");
	}

	public void windowDeiconified(WindowEvent e) {
		System.out.println("On Window Deiconified");
	}
}

class Window1_MyWindowHandler extends JFrame {

	MyWindowHandler myhandler = new MyWindowHandler();

	public Window1_MyWindowHandler(String str) {
		super(str);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		addWindowListener(myhandler);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Window1_MyWindowHandler("Window 1");
		new Window1_MyWindowHandler("Window 2");
	}
}