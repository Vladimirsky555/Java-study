import java.util.List;
import java.util.Vector;

public class Storage {

    private List books = new Vector();

    public List getBooks() {
        return books;
    }

    public Book getBookByIndex(int index){
        return (Book)books.get(index);
    }

    public void setBooks(List books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void deleteBook(Book book){
        books.remove(book);
    }


    public Storage() {
        books.add("1 книга");
        books.add("2 книга");
    }
}
