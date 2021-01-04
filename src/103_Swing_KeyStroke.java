import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
1) Достаём из панели inputMap
2) Помещаем в неё keyStroke и какой-то объект
3) Достаём из панели actionMap
4) Говорим ему, что по ключу будем вызывать такой-то Action
 */

public class Main {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        AbstractAction myAction = new MyAction();
        JButton jButton = new JButton(myAction);
        jButton.setText("submit");
        jPanel.add(jButton);

        KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl B");
        InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);//достаём InputMap из панели
        inputMap.put(keyStroke, "changeColor");
        ActionMap actionMap = jPanel.getActionMap();
        actionMap.put("changeColor", myAction);
    }

    static class MyAction extends AbstractAction {
        public MyAction() {
            putValue(AbstractAction.SHORT_DESCRIPTION, "My small action");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.blue);
        }
    }


    static JFrame getFrame(){
        int h = 400; int w = 500;
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - w/2,dimension.height/2 - h/2, w,h);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("My program");
        return jFrame;
    }
}
