import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;

/*
paintComponent(Graphics g) - устаревший метод. Он позволяет рисовать, но не поворачивать рисурки, поэтому
делаем так Graphics2D g2 = (Graphics2D) g;
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());//добавляем JComponent на форму

        //main.getInfoAboutFonts();//Выводим информацию о шрифтах в системе
    }

    //Рисуем в основном окне
    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Tahoma", Font.BOLD, 20);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);

            //Пишем строку
            g2.drawString("Hellow World", 50, 50);

            //Задаём точки
            Point2D p1 = new Point2D.Double(70,70);
            Point2D p2 = new Point2D.Double(170,170);

            //Рисуем линию по координатам или точкам
            //Line2D line = new Line2D.Double(70,70,190,190);
            Line2D line = new Line2D.Double(p1,p2);
            g2.draw(line);

            //Рисуем эллипс по координатам или точкам
            //Ellipse2D el = new Ellipse2D.Double(70,70,170,170);
            //g2.setPaint(new Color(120,150,63));
            Ellipse2D el = new Ellipse2D.Double();
            el.setFrameFromDiagonal(p1,p2);
            g2.setPaint(Color.magenta);
            g2.draw(el);
            //g2.fill(el);//закрашивает

            //Рисуем квадрат по координатам или точкам
            //Rectangle2D rec = new Rectangle2D.Double(70,70,170,170);
            Rectangle2D rec = new Rectangle2D.Double();
            rec.setFrameFromDiagonal(p1,p2);
            g2.draw(rec);

            //Картинка из интернета
//            try {
                //URL url = new URL("https://www.softexia.com/wp-content/uploads/2017/04/Java-logo.png");
                //Image image = new ImageIcon(url).getImage();
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }

            //Картинка с диска
            Image image = new ImageIcon("img/java.png").getImage();
            g2.drawImage(image, 220, 70, null);

        }
    }

    //Задаём основное окно
    static JFrame getFrame(){
        int h = 400; int w = 500;
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - w/2,dimension.height/2 - h/2, w,h);
        jFrame.setTitle("My program");
        return jFrame;
    }

    void getInfoAboutFonts(){
        String[]fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(String s : fonts){
            System.out.println(s);
        }
    }
}
