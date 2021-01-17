import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main
{
    public static void createGUI()
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        final JFrame frame = new JFrame("Test frame");

        //Закрыть окно при нажатии по крестику
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        //Построчное расположение
        panel.setLayout(new FlowLayout());

        //Пишем стандартное событие для кнопки
        JButton minButton = new JButton("Minimize");
        minButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Свернуть Окно
                frame.setState(JFrame.ICONIFIED);
            }
        });
        panel.add(minButton);

        //Пишем стандартное событие для кнопки
        JButton maxButton = new JButton("Maximize");
        maxButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //максимальный размер окна
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
        panel.add(maxButton);


        JButton normalButton = new JButton("Normal");
        normalButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Норм размер окна
                frame.setExtendedState(JFrame.NORMAL);
            }
        });
        panel.add(normalButton);

        //Пишем стандартное событие для кнопки
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                //Выход с программы
                frame.setVisible(false);
                System.exit(0);
            }
        });
        panel.add(exitButton);

        //Иконка для окна
        ImageIcon img = new ImageIcon("add1.png");
        frame.setIconImage(img.getImage());

        //Загружаем в окно панель
        //frame.getContentPane().add(panel);
        frame.add(panel);

        //Отступ внутри она от компонентов
        frame.setPreferredSize(new Dimension(400, 80));

        frame.pack();
        //Расположения окна по центру экрана
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }



    public static void main(String[] args)
    {
        createGUI();
    }
}