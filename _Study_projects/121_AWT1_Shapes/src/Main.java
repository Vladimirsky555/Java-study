import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Main {

    static JFrame jFrame = getFrame();

    public static void main(String[] args) {
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics g) {
//            g.drawLine(0,0,100,100); - неполиморфно
            Graphics2D g2 = (Graphics2D) g;

            //Задаём точки
            Point2D p1 = new Point2D.Double(50,0);
            Point2D p2 = new Point2D.Double(100,50);

//            Line2D line = new Line2D.Double(p1,p2);
            Line2D line = new Line2D.Double(0,0,100,100);
            g2.draw(line);//полиморфно. Все фигуры имплементируют класс Shape

            Rectangle2D rectangle = new Rectangle2D.Double(100,0,100,50);
            g2.draw(rectangle);

            RoundRectangle2D roundRectangle = new RoundRectangle2D.Double(250,20,100,70,30,30);
            g2.draw(roundRectangle);

            Ellipse2D ellipse = new Ellipse2D.Double(400,20,100,50);
            g2.draw(ellipse);

            //координаты точек и точки, куда изгиб направляется
            QuadCurve2D quadCurve = new QuadCurve2D.Double(50,100,100,500,150,100);
            g2.draw(quadCurve);

            CubicCurve2D cubicCurve = new CubicCurve2D.Double(450, 50, 475, 150, 525, -50, 550, 50);
            g2.draw(cubicCurve);

            //Обрезанный эллипс
            Arc2D arc2D = new Arc2D.Double(0, 100, 100, 100, 0, 90, Arc2D.PIE);
            g2.draw(arc2D);

            g2.setPaint(Color.magenta);
            GeneralPath generalPath = new GeneralPath();
            generalPath.moveTo(100,100);
            generalPath.lineTo(200,100);
            generalPath.quadTo(250, 300, 300, 100);
            generalPath.curveTo(325, 200, 375, 0, 400, 100);
            generalPath.closePath();
            g2.draw(generalPath);
        }
    }

    static JFrame getFrame(){
        int h = 500; int w = 600;
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