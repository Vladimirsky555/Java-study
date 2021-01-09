import javax.swing.*;
import java.awt.*;

/*
Фокус по умолчанию идёт слева направо, начиная с 1-го элемента
*/

public class Main {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        jPanel.add(new JButton("button1"));
        jPanel.add(new JButton("button2")).setFocusable(false);//никогда не будет в фокусе
        jPanel.add(new JButton("button3")).requestFocusInWindow();//переназначаем фокус
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