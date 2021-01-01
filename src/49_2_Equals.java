import java.util.HashMap;
import java.util.Map;

/*
Методы equals() и hashcode() переопределяются при работе с коллекциями
equals() - сравнивает адреса в памяти
hashcode() - возвращает адрес в памяти
 */

class Book{
    String autor;
    String name;
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book().;
        book.autor = "Karnegy";
        book.name = "How to get friends";
        Map<String,Book> library = new HashMap<>();
        library.put(book.name, book);

        Book karnegyBook = library.get(book.name);
        System.out.println(karnegyBook.autor);
        System.out.println(karnegyBook.name);

        System.out.println(book.hashCode());

        for (int i = 0; i < 100; i++) {
            System.out.println(new Book().hashCode());
        }

    }
}
