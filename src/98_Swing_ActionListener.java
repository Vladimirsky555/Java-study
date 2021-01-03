import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JButton jButton = new JButton("submit");
        JButton jButton1 = new JButton("submit_2");
        jPanel.add(jButton);//задаётся анонимным классом
        jPanel.add(jButton1);//задаётся обычным классом
        /*
        Создаём анонимный класс ActionListener с единственным
        переопределённым методом actionPerformed
        Код этого метода выполняется при нажатии на кнопку
        То есть в этот класс имплементит ActionListener и
        реализует actionPerformed
         */
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.blue);
            }
    });

        jButton1.addActionListener(new MyListener());
    }

    //Если бы не создавали анонимный класс, то так тоже можно было
    //Но не будет доступа к jFrame
    static class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("ActionListener");
        }
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
