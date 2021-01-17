import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int h = 300;
        int w = 500;

        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);//чтобы увидеть окно
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//чтоб можно было закрыть
//        jFrame.setSize(500,300);
//        jFrame.setLocation(400,150);
        Toolkit toolkit = Toolkit.getDefaultToolkit();//набор инструментов для работы с фреймами и т.д.
        Dimension dimension = toolkit.getScreenSize();

        jFrame.setBounds(dimension.width/2 - w/2,dimension.height/2 - h/2, w,h);
        ///jFrame.setBounds(400,100,500,300);//вместо setSize и setLocation
        jFrame.setTitle("Моя первая программа");
        //jFrame.setIconImage();//картинка
    }
}
