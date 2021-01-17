import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {

    static JFrame jFrame = getFrame();

    public static void main(String[] args)throws Exception {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        jMenuBar.add(file);
        jMenuBar.add(edit);
        file.add(new JMenuItem("Open", 'O'));//добавление мнемоники
        JMenuItem save = file.add(new JMenuItem("Save", 'S'));//метод add возвращает JMenuItem
        save.setEnabled(false);
        file.addSeparator();

        //ДОбавляем событие для меню
        JMenuItem exit = file.add(new JMenuItem("Exit"));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exit.setAccelerator(KeyStroke.getKeyStroke("ctrl J"));//клавиши

        edit.add(new JMenuItem("Что-то"));
        edit.add(new JMenuItem("Ещё что-то"));
        edit.addSeparator();
        edit.add(new JMenuItem("Выход"));

        //Вложенные меню
        JMenu options = new JMenu("Options");
        edit.add(options);
        options.add("one");
        options.add("two");

        //Добавляем чекбокс
        edit.add(new JCheckBoxMenuItem("checkbox"));

        //Добавляем группу радиобатонов
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButtonMenuItem r1 = new JRadioButtonMenuItem("radio1");
        JRadioButtonMenuItem r2 = new JRadioButtonMenuItem("radio2");
        buttonGroup.add(r1); buttonGroup.add(r2);
        edit.add(r1); edit.add(r2);

        jFrame.setJMenuBar(jMenuBar);
        jFrame.revalidate();
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