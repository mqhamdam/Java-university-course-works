import javax.swing.*;
import java.awt.*; 

// import java.awt.event.*;
// import java.util.*; 


public class Lab3 extends JFrame {
    public Lab3() {
        setTitle("걸어서 나오는 문자열");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(getOwner());
        getContentPane().setLayout(new FlowLayout());
        final WalkingLabel _walkingLabel = new WalkingLabel("나는 당신을 사랑합니다!");
        add(_walkingLabel);
        // hamdLabel.run();
        Thread thread = new Thread(_walkingLabel);
        thread.start();
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab3();
    }
    
}


class WalkingLabel extends JLabel implements Runnable{
    public WalkingLabel(String text){
        this.text = text;
    }
    private String text;
    private String printString; 
    private int index;

    @Override
    public void run() {
        while (true) {
            printString = text.substring(0,index);
            setText(printString);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                return;
            }

            if(index >= text.length()){
                index = 0;
            } 
            index++;
        }
    }

}