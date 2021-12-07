import javax.swing.*;
import java.awt.*; 
import java.util.*; 

// import java.awt.event.*;


public class Lab4 extends JFrame {
    private DigitalWatch _digitalWatch;

    public Lab4() {
        setTitle("Digital Watch");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());
        getContentPane().setLayout(null);
        _digitalWatch = new DigitalWatch();
        _digitalWatch.setFont(new Font("Arial", Font.ITALIC,77));
        _digitalWatch.setBounds(40,40,500,120);
        add(_digitalWatch);
        
        Thread th = new Thread(_digitalWatch);

        th.start();
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab4();
    }
    
}


class DigitalWatch extends JLabel implements Runnable{
    
    private int hour, min, second;
    private Calendar c;

    @Override
    public void run() {
        while (true) {
            c = Calendar.getInstance();
            hour = c.get(Calendar.HOUR_OF_DAY);
            min = c.get(Calendar.MINUTE);
            second = c.get(Calendar.SECOND);
            String clockText = Integer.toString(hour);
            clockText = clockText
            .concat(":")
            .concat(Integer.toString(min))
            .concat(":")
            .concat(Integer.toString(second));

            setText(clockText);
        }
    }

}