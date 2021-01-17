import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

/*
Если код выполняет одну простую операцию, его можно упростить
 */

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton = new JButton("submit");
        jPanel.add(jButton);
        //e.getSource() - тот кто прислал событие
//        jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jFrame.setTitle(((JButton) e.getSource()).getText());
//            }
//        });

        /*Тот же код, что и закомментированный
        1) Имплементируется ActionListener
        2) В title JFrame пихаем из JButton текст
         */
        jButton.addActionListener(EventHandler.create(ActionListener.class, jFrame, "title", "source.text"));
    }


    //Задаём основное окно
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
