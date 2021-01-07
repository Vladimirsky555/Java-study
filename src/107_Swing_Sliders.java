import javax.swing.*;
import java.awt.*;

/*

 */

public class Main {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);

        JSlider jSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);
        jPanel.add(jSlider);
        jSlider.setMinorTickSpacing(10);
        jSlider.setMajorTickSpacing(20);
        jSlider.setPaintTicks(true);
        jSlider.setSnapToTicks(true);//фиксирует на делениях
        jSlider.setPaintLabels(true);//цифры на делениях

        JSlider jSlider1 = new JSlider(JSlider.VERTICAL, 0, 100, 0);
        jPanel.add(jSlider1);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);//фиксирует на делениях
        jSlider1.setPaintLabels(true);//цифры на делениях
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