import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*

*/

public class Main {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("show custom dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDialog myDialog = new MyDialog();
                myDialog.setVisible(true);
            }
        });
    }

    static class MyDialog extends JDialog {
        public MyDialog() {
            super(jFrame, "title", true);
            add(new JTextField(), BorderLayout.NORTH);
            add(new JButton("submit"), BorderLayout.SOUTH);
            setBounds(500, 300, 150, 100);
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
