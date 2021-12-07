import javax.swing.*;
import java.awt.*;
/* import java.awt.event.*;
import java.util.*; */



public class RunnableTimerEx extends JFrame implements Runnable{
    private JLabel timerLabel = new JLabel();

    public RunnableTimerEx() {
        setTitle("Runnable을 구현한 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        //JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic",Font.ITALIC, 80));
        c.add(timerLabel);

        
        

        setSize(250,150);
        setVisible(true);

        Thread th = new Thread(this);
        th.start();
    }
    @Override
    public void run() {
        int n = 0 ;
        while (true) {
            timerLabel.setText(Integer.toString(n++));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
    
    
   public static void main(String[] args) {
       new RunnableTimerEx();
   }


}