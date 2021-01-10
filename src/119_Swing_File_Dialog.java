import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

public class Main {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("show file dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jFileChooser = new JFileChooser();
                //jFileChooser.setFileView();//для перенастройки внешнего вида диалога
                //jFileChooser.setMultiSelectionEnabled(true);
                //jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);//директории, файлы, файлы и директории
               // jFileChooser.setCurrentDirectory(new File("H:/"));
                //Например, хотим выбирать только гифки
//                jFileChooser.setFileFilter(new FileFilter() {
//                    @Override
//                    public boolean accept(File f) {
//                        if(f.getName().endsWith("gif")){
//                            return true;
//                        }
//                        return false;
//                    }
//
//                    @Override
//                    public String getDescription() {
//                        return "only gif files";
//                    }
//                });

//                TextField textField = new TextField("Я упала с самосвала, тормозила головой", 50);
//                jFileChooser.add(textField, BorderLayout.WEST);

                //ДОбавляем показ картинок перед выбором в окне выбора
//                jFileChooser.addPropertyChangeListener(new PropertyChangeListener() {
//                    @Override
//                    public void propertyChange(PropertyChangeEvent evt) {
//                        textField.setText(evt.getSource().toString());
//                    }
//                });

                //jFileChooser.showOpenDialog(jPanel);
                //jFileChooser.showSaveDialog(jPanel)
                int tmp = jFileChooser.showDialog(jPanel, "save as");
                System.out.println(tmp);//Cancel = 1, Open = 0

                //Вывод информации о выбранном файле
                File file = jFileChooser.getSelectedFile();
                System.out.println(file.getName());
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