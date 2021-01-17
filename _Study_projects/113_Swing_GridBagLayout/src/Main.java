import javax.swing.*;
import java.awt.*;

/*

 */

public class Main {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);

        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.weightx = 0;//чтобы сам растягивался
        constraints1.weighty = 0;
        constraints1.gridx = 0;
        constraints1.gridy = 0;
        constraints1.gridheight = 2;//2 клетки по высоте
        constraints1.gridwidth = 2;//2 клетки по ширине
        jPanel.add(new JTextArea(4,20), constraints1);

        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.weightx = 0;//чтобы сам растягивался
        constraints2.weighty = 0;
        constraints2.gridx = 2;
        constraints2.gridy = 0;
        constraints2.gridheight = 1;
        constraints2.gridwidth = 2;//2 клетки по ширине
        jPanel.add(new JButton("Button very long name"), constraints2);

        GridBagConstraints constraints3 = new GridBagConstraints();
        constraints3.weightx = 0;//чтобы сам растягивался
        constraints3.weighty = 0;
        constraints3.gridx = 2;
        constraints3.gridy = 1;
        constraints3.gridheight = 1;
        constraints3.gridwidth = 1;
        jPanel.add(new JButton("Button "), constraints3);

        GridBagConstraints constraints4 = new GridBagConstraints();
        constraints4.weightx = 0;//чтобы сам растягивался
        constraints4.weighty = 0;
        constraints4.gridx = 3;
        constraints4.gridy = 1;
        constraints4.gridheight = 1;
        constraints4.gridwidth = 1;
        jPanel.add(new JButton("Button "), constraints4);

        jPanel.revalidate();
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