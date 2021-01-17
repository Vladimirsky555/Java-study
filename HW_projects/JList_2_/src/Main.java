import org.w3c.dom.DOMStringList;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.*;


public class Main extends JFrame
{
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    static Book currentBook;
    static Chapter currentChapter;
    static Section currentSection;

    static Storage s = new Storage();
    static JList booksList = new JList((Vector) s.getBooks());
    //static Book book = new Book();
    static JList chaptersList;
    //static Chapter chapter = new Chapter();
    static JList sectionsList;
    //static Section section = new Section();



    public static void main(String[] args)
    {
        jFrame.add(jPanel);
        jPanel.setLayout(new GridLayout(2,2));
        BooksList();
        ChaptersList();
        SectionList();
        TextArea();
        jPanel.revalidate();
    }

    static void BooksList(){
        booksList.setVisibleRowCount(10);
        booksList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        booksList.setSelectedIndices(new int[] {1,2});
        JScrollPane jScrollPane = new JScrollPane(booksList);
        jScrollPane.setSize(200,150);
        jScrollPane.setVisible(true);
        jPanel.add(jScrollPane);
        booksList.clearSelection();

        JPopupMenu booksMenu = new JPopupMenu();
        booksMenu.add("Добавить").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Book newBook = new Book();
                String str = JOptionPane.showInputDialog(jPanel, "Добавить книгу");
                newBook.setName(str);
                s.addBook(newBook);
                booksList.setListData((Vector) s.getBooks());
            }
        });
        booksMenu.add("Редактировать");
        booksMenu.add("Удалить").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        booksList.setComponentPopupMenu(booksMenu);

        //реакция на клик мышью
        booksList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int index = booksList.getSelectedIndex();
                currentBook = s.getBookByIndex(index);
                chaptersList.setEnabled(true);
                chaptersList.setListData((Vector) currentBook.getChapters());
            }
        });
    }

    static void ChaptersList(){
        chaptersList = new JList((Vector) currentBook.getChapters());
        chaptersList.setVisibleRowCount(10);
        chaptersList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        chaptersList.setSelectedIndices(new int[] {1,2});
        JScrollPane jScrollPane = new JScrollPane(chaptersList);
        jScrollPane.setSize(200,150);
        jScrollPane.setVisible(true);
        jPanel.add(jScrollPane);
        chaptersList.clearSelection();

        JPopupMenu chaptersMenu = new JPopupMenu();
        chaptersMenu.add("Добавить").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Chapter newChapter = new Chapter();
                String str = JOptionPane.showInputDialog(jPanel, "Добавить главу");
                newChapter.setName(str);
                currentBook.addChapter(newChapter);
                chaptersList.setListData((Vector) currentBook.getChapters());
            }
        });
        chaptersMenu.add("Редактировать");
        chaptersMenu.add("Удалить");
        chaptersList.setComponentPopupMenu(chaptersMenu);
        chaptersList.setEnabled(false);
    }

    static void SectionList(){
        sectionsList = new JList((Vector) currentChapter.getSections());
        sectionsList.setVisibleRowCount(10);
        sectionsList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        sectionsList.setSelectedIndices(new int[] {1,2});
        JScrollPane jScrollPane = new JScrollPane(sectionsList);
        jScrollPane.setSize(200,150);
        jScrollPane.setVisible(true);
        jPanel.add(jScrollPane);
        sectionsList.clearSelection();

        JPopupMenu sectionsMenu = new JPopupMenu();
        sectionsMenu.add("Добавить").addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Section newSection = new Section();
                String str = JOptionPane.showInputDialog(jPanel, "Добавить параграф");
                newSection.setName(str);
                currentChapter.addSection(newSection);
                sectionsList.setListData((Vector) currentChapter.getSections());
            }
        });
        sectionsMenu.add("Редактировать");
        sectionsMenu.add("Удалить");
        sectionsList.setComponentPopupMenu(sectionsMenu);
        sectionsList.setEnabled(false);
    }

    static void TextArea(){
        JTextArea jTextArea = new JTextArea(5,20);//по умолчанию расширяется по горизонтали
        jTextArea.setLineWrap(true);//расширяется вниз
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jTextArea.append(currentSection.getText());
        jPanel.add(jScrollPane);
        jScrollPane.setEnabled(false);
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