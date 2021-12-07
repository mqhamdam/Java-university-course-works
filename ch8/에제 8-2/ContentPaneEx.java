import javax.swing.*;
import java.awt.*;

/**
 * MyFrame
 */
public class ContentPaneEx extends JFrame {
    
    public ContentPaneEx() {
        setTitle("ContentPane과 JFrame 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
         contentPane.setBackground(Color.orange);

        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JButton("Ok"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        setSize(300,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        ContentPaneEx contentPaneEx =  new ContentPaneEx();
        
    }
}