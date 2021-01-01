import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
Методы equals() и hashcode() переопределяются при работе с коллекциями
equals() - сравнивает адреса в памяти
hashcode() - возвращает адрес в памяти
В нашем случае читательский билет имеет один и тот же номер, но занимает 2 разных места
в памяти. Поэтому нужно переопределять методы equals и hashcode, чтобы привязать читательский билет
не к месту в памяти, а к номеру билета
При переопределении этих метов в классе Ticket стало возможным записать записать в Map один объект Ticket,
а получить данные по другому объекту с тем же номером
Хэшкод это интовое значение. Как выйдем за 4 млрд, значения начнут повторяться.
При повторении хешкода, метод equals срабатывает
По одному ключу могут находиться несколько объектов
Работа map:
1) Проверка хешкода
2) Если в ячейке записано несколько объектов, сверка по параметрам и поиск нужного

Равные объекты по equals также равны по хешкоду.
Равные же по хешкоду, не обязательно будут равны по equals
 */

class Book{
    String autor;
    String name;
}

class Ticket{
    int number;
    String libraryName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//проверяем объект
        if (o == null || getClass() != o.getClass()) return false;//проверка на нулл и принадл. к классу
        Ticket ticket = (Ticket) o;//приводим к классу Ticket
        return number == ticket.number &&//сверяем параметры
                Objects.equals(libraryName, ticket.libraryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, libraryName);
    }
}

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.number = 13456;

        //Потерял читательский билет
        Ticket ticket2 = new Ticket();
        ticket2.number = 13456;

        Book book1 = new Book();
        book1.autor = "Karnegy";
        book1.name = "How to get friends";

        Map<Ticket,Book> library = new HashMap<>();
        library.put(ticket, book1);

        Book karnegyBook = library.get(ticket2);
        System.out.println(karnegyBook.autor);
        System.out.println(karnegyBook.name);


//        System.out.println(book.hashCode());
//        System.out.println(new Book().hashCode());


    }
}
