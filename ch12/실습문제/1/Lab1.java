import javax.swing.*;
import java.awt.*;
/* import java.awt.event.*;
import java.util.*; */



public class Lab1 extends JFrame{

    public Lab1() {
        this.setTitle("");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());

        getContentPane().setBackground(Color.YELLOW);

        Thread th = new MyThread();
        th.start();

        this.setSize(300, 200);
        this.setVisible(true);
    }
    
    private class MyThread extends Thread {
        @Override
        public void run() {
            setTitle("실행 시작");
            try {
                Thread.sleep(10000);        
            } catch (InterruptedException e) {
                return;
            }
            setTitle("실행 종료");
            getContentPane().setBackground(Color.BLUE);
        }
    }
    
   public static void main(String[] args) {
       new Lab1();
   }


}