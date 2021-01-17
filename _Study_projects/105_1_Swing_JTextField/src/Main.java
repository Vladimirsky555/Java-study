import javax.swing.*;
import java.awt.*;

/*
JTextField, JPasswordField, JLabel, JTextArea, ScrollPane
*/

public class Main {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JLabel jLabel = new JLabel("this is label");
        jPanel.add(jLabel);

        JTextField jTextField = new JTextField("default value", 20);
//        jPanel.add(new JTextField(20));
        jPanel.add(jTextField);
        jPanel.add(new JPasswordField(20));

        JTextArea jTextArea = new JTextArea(5,20);//по умолчанию расширяется по горизонтали
        jTextArea.setLineWrap(true);//расширяется вниз
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jPanel.add(jScrollPane);

        jPanel.revalidate(); //jPanel.repaint();
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
