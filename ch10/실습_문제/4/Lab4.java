import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab4 extends JFrame {
    private JCheckBox [] cb = new JCheckBox[2];
    private String [] cbLabels = {
        "버튼 비활성화"
        , "버튼 감추기",
    };
    private JButton btn = new JButton("test button");

    public Lab4() {
        setTitle("CheckBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        cb[0] = new JCheckBox( cbLabels[0]);
        cb[1] = new JCheckBox(cbLabels[1]);

        for (JCheckBox jCheckBox : cb) {
            c.add(jCheckBox);
            jCheckBox.addItemListener(new ItemListener(){

                @Override
                public void itemStateChanged(ItemEvent e) {
                    if(e.getStateChange() == ItemEvent.SELECTED){
                        if (e.getItem() == cb[0]) {
                            btn.setEnabled(false);
                        } else {
                            btn.setVisible(false);
                        }
                    } else {
                        if (e.getItem() == cb[0]) {
                            btn.setEnabled(true);
                        } else {
                            btn.setVisible(true);
                        }
                    }
                }
                
            });
            c.add(btn);
            
        }
        setSize(400, 400);
        setVisible(true);
    }

    static public void main(String[] arg) {
        new Lab4();
    }
}
