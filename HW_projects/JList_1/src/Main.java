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
        Storage s = new Storage();

        JList booksList = new JList((Vector) s.getBooks());
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

            }
        });
    }

    static void ChaptersList(){
        Book book = new Book();

        JList chaptersList = new JList((Vector) book.getChapters());
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
                book.addChapter(newChapter);
                chaptersList.setListData((Vector) book.getChapters());
            }
        });
        chaptersMenu.add("Редактировать");
        chaptersMenu.add("Удалить");
        chaptersList.setComponentPopupMenu(chaptersMenu);
    }

    static void SectionList(){
        Chapter chapter = new Chapter();

        JList sectionsList = new JList((Vector) chapter.getSections());
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
                chapter.addSection(newSection);
                sectionsList.setListData((Vector) chapter.getSections());
            }
        });
        sectionsMenu.add("Редактировать");
        sectionsMenu.add("Удалить");
        sectionsList.setComponentPopupMenu(sectionsMenu);
    }

    static void TextArea(){
        Section section = new Section();

        JTextArea jTextArea = new JTextArea(5,20);//по умолчанию расширяется по горизонтали
        jTextArea.setLineWrap(true);//расширяется вниз
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jTextArea.append(section.getText());
        jPanel.add(jScrollPane);
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