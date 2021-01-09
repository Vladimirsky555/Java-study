import javax.swing.*;
import java.awt.*;

/*

 */

public class Main {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) throws Exception {
        jFrame.add(jPanel);
        jPanel.setLayout(new MyLayout());
        jPanel.add(new JButton("b1"));
        jPanel.add(new JButton("b2"));
        jPanel.add(new JButton("b3"));
        jPanel.add(new JButton("b4"));
        jPanel.add(new JButton("b5"));
        jPanel.add(new JButton("b6"));
        jPanel.add(new JButton("b7"));
        jPanel.add(new JButton("b8"));
        jPanel.add(new JButton("b9"));
    }

    static class MyLayout implements LayoutManager {
        @Override
        public void addLayoutComponent(String name, Component comp) { }

        @Override
        public void removeLayoutComponent(Component comp) { }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            return null;
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            return null;
        }

        @Override
        public void layoutContainer(Container parent) {
            for (int i = 0; i < parent.getComponentCount(); i++) {
                Component component = parent.getComponent(i);
                component.setBounds(i*60, i*30, 60, 30);
            }
        }
    }


    static JFrame getFrame(){
        int h = 309; int w = 556;
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