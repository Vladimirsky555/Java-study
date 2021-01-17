import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
Диалоги - модальные окна, которые блокируют работу с программой, когда открыты
*/

public class Main {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("show dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(jPanel, "MessageDialog", "title", JOptionPane.ERROR_MESSAGE);
                //JOptionPane.showMessageDialog(jPanel, "MessageDialog", "title", JOptionPane.INFORMATION_MESSAGE);
                //JOptionPane.showMessageDialog(jPanel, "MessageDialog", "title", JOptionPane.QUESTION_MESSAGE);
                //JOptionPane.showMessageDialog(jPanel, "MessageDialog", "title", JOptionPane.PLAIN_MESSAGE);

                //int tmp = JOptionPane.showConfirmDialog(jPanel, "confirmation dialog", "title", JOptionPane.YES_NO_OPTION);
                //int tmp = JOptionPane.showConfirmDialog(jPanel, "confirmation dialog", "title", JOptionPane.YES_OPTION);
                //int tmp = JOptionPane.showConfirmDialog(jPanel, "confirmation dialog", "title", JOptionPane.CLOSED_OPTION);
                //int tmp = JOptionPane.showConfirmDialog(jPanel, "confirmation dialog", "title", JOptionPane.OK_CANCEL_OPTION);
//                int tmp = JOptionPane.showConfirmDialog(jPanel, "confirmation dialog", "title", JOptionPane.YES_NO_CANCEL_OPTION);
//                System.out.println(tmp);

//                int tmp = JOptionPane.showOptionDialog(jPanel, "showOption", "title", 0,0,null,
//                        new Object[]{"one", "two", "three", "four", "five", "six", "seven"}, "two");
//                int tmp = JOptionPane.showOptionDialog(jPanel, "showOption", "title",
//                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,null,
//                        new Object[]{"one", "two", "three", "four", "five", "six", "seven"}, "two");
//                System.out.println(tmp);

                String str = JOptionPane.showInputDialog(jPanel, "message");
                System.out.println(str);
            }
        });
        jPanel.revalidate();
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