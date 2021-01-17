import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/*
Интерфейсы
1) MouseListener
2) MouseMotionListener
mouseClicked - позволяет отслеживать клики мышкой
mouseMoved - позволяет отслеживать движение мыши
*/

public class Main {

    static JFrame jFrame = getFrame();
//    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
//        jFrame.add(jPanel);
//        jPanel.addMouseListener(new MouseListener() {
//            @Override
//            public void mouseClicked(MouseEvent e) { }
//            @Override
//            public void mousePressed(MouseEvent e) { }
//            @Override
//            public void mouseReleased(MouseEvent e) { }
//            @Override
//            public void mouseEntered(MouseEvent e) { }
//            @Override
//            public void mouseExited(MouseEvent e) { }
//        });

//        jPanel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                jPanel.setBackground(Color.blue);
//            }
//        });

        JComponent jComponent = new MyComponent();
        jFrame.add(jComponent);
        jFrame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                MyComponent.xCoord = e.getX();
                MyComponent.yCoord = e.getY();
                jComponent.repaint();//вызов printComponent и перерисовка координат
            }
        });
    }

    static class MyComponent extends JComponent {
        public static int xCoord;
        public static int yCoord;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ((Graphics2D)g).drawString("Coordinates x: " + xCoord +
                    "Coordinates y: " + yCoord, 50, 50);
        }
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
