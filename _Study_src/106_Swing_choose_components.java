import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

/*

 */

public class Main {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        jPanel.add(new JCheckBox("checkbox label"));

        JRadioButton rb1 = new JRadioButton("one");
        JRadioButton rb2 = new JRadioButton("two");
        JRadioButton rb3 = new JRadioButton("three");
        rb3.setSelected(true);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1); bg.add(rb2); bg.add(rb3);
        jPanel.add(rb1); jPanel.add(rb2); jPanel.add(rb3);

        Border border = BorderFactory.createEtchedBorder();
        Border border1 = BorderFactory.createTitledBorder(border, "Title");


        JComboBox<String> comboBox = new JComboBox();
        comboBox.addItem("one");
        comboBox.addItem("two");
        comboBox.addItem("three");
        jPanel.add(comboBox);

        jPanel.setBorder(border1);
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