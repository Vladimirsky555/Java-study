import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
Список содержит группу элементов, аналогично выпадающему списку JComboBox, но обладает двумя отличительными 
особенностями. Во-первых, на экране видны одновременно несколько элементов списка. Во-вторых, пользователь 
может выбрать в списке не один элемент, а несколько (если установлен соответствующий режим выделения).

Создать список можно с помощью конструктора, работающего на основе массива Object[] или вектора Vector 
(аналогично JComboBox).

setVisibleRowCount(int count) устанавливает количество видимых элементов списка.
setSelectionMode(int mode) указывает на ListSelectionModel:SINGLE_SELECTION — может быть выделен только один элемент, 
SINGLE_INTERVAL_SELECTION — может быть выделено несколько элементов, 
но составляющих непрерывный интервал,MULTIPLE_INTERVAL_SELECTION — может быть выделено произвольное 
количество смежных и несмежных элементов.
set/getSelectedValue() - Выделенный элемент списка (если он один).
set/getSelectedValues() - Возвращает все выделенные элементы списка в виде массива Object[].
set/getSelectedIndex() и set/getSelectedIndices() - возвращают они не сами выделенные элементы, а их индексы.
 */

public class Main extends JFrame
{
    Main()
    {
        super("Пример с JList");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Object[] elements = new Object[] {"Колбаса", "<html><font color = red>Масло", "Сгущенное молоко"};
        JList list = new JList(elements);
        list.setVisibleRowCount(5);
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setSelectedIndices(new int[] {1,2});
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(new JScrollPane(list));
        setSize(200,150);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        Main m = new Main();
    }
}