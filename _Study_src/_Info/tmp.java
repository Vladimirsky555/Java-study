import javax.swing.*;
import java.awt.*;

/*

*/

public class Main {
	
	    static JFrame jFrame = getFrame();
        static JPanel jPanel = new JPanel();
		
    public static void main(String[] args) {
        jFrame.add(jPanel);
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
