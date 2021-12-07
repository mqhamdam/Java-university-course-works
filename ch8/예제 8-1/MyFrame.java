import javax.swing.*;

/**
 * MyFrame
 */
public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("300x300 Swing 프레임 만들기");
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}