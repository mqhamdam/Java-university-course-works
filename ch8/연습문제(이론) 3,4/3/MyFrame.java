import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame() {
        Container _container = getContentPane(); // 컨텐트팬에 대한 레퍼런스 얻기
        _container.add(new JButton("hello")); // 컨텐트팬에 "hello" 버튼 달기
        setSize(200,400); // 프레임을 너비 200, 높이 400픽셀로 설정
        setVisible(true);
    }

    public static void main(String [] args) {
       MyFrame frame = new MyFrame(); // MyFrame 생성
    }
}