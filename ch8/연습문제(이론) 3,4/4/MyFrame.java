import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame() {
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        // JFrame mf = new JFrame(); 
        // ! Nothing appears because of the line above. Correct Version in the below line
        JFrame frame = new MyFrame();
    }
}