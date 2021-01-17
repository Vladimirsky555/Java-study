import javax.swing.*;
import java.awt.*;

/*
FlowLayOut - по умолчанию используется, размещает все элементы друг за другом
 */

public class Main {

    static JFrame jFrame = getFrame();

    public static void main(String[] args) {
        //FlowLayOut
//        JPanel jPanel = new JPanel();
//        jFrame.add(jPanel);
//        jPanel.add(new JButton("one"));
//        jPanel.add(new JButton("two"));
//        jPanel.add(new JButton("three"));

        //BorderLayout
//        jFrame.add(new JButton("one"), BorderLayout.EAST);
//        jFrame.add(new JButton("two"), BorderLayout.WEST);
//        jFrame.add(new JButton("three"), BorderLayout.NORTH);
//        jFrame.add(new JButton("four"), BorderLayout.SOUTH);
//        jFrame.add(new TextField(), BorderLayout.CENTER);

        //GreedLayOut
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        jPanel.setLayout(new GridLayout(2,2));
        jPanel.add(new JButton("one"));
        jPanel.add(new JButton("two"));
        jPanel.add(new JButton("three"));
        jPanel.add(new JButton("four"));
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