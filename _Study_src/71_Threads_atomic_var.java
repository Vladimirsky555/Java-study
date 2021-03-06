import java.util.concurrent.atomic.AtomicInteger;
/*
Атомарные переменные
Вот работает инкремент i++
1) int tmp = i + 1;
2) i = tmp;
В результате два потока могут выполнять одну и ту же операцию, и конечное число не будет 10000, а может быть
9997, 9993 и т.д.

http://java-online.ru/concurrent-atomic.xhtml
Пакет java.util.concurrent.atomic содержит девять классов для выполнения атомарных операций.
Операция называется атомарной, если её можно безопасно выполнять при параллельных вычислениях в нескольких потоках,
не используя при этом ни блокировок, ни синхронизацию synchronized.

С точки зрения программиста операции инкремента (i++, ++i) и декремента (i--, --i) выглядят наглядно и компактно. Но, с точки
зрения JVM (виртуальной машины Java) данные операции не являются атомарными, поскольку требуют выполнения нескольких
действительно атомарных операции: чтение текущего значения, выполнение инкремента/декремента и запись полученного результата.
При работе в многопоточной среде операции инкремента и декремента могут стать источником ошибок.
Т.е. в многопоточной среде простые с виду операции инкремента и декремента требуют использование синхронизации и блокировки.
Но блокировки содержат массу недостатков, и для простейших операций инкремента/декремента являются тяжеловесными.
Выполнение блокировки связано со средствами операционной системы и несёт в себе опасность приостановки с невозможностью
дальнейшего возобновления потока, а также опасность взаимоблокировки или инверсии приоритетов (priority inversion).
Кроме этого, появляются дополнительные расходы на переключение потоков. Но можно ли обойтись без блокировок?
В ряде случаев можно!

Блокировка подразумевает пессимистический подход, разрешая только одному потоку выполнять определенный код,
связанный с изменением значения некоторой «общей» переменной. Таким образом, никакой другой поток не имеет
доступа к определенным переменным. Но можно использовать и оптимистический подход. В этом случае блокировки не
происходит, и если поток обнаруживает, что значение переменной изменилось другим потоком, то он повторяет операцию снова,
но уже с новым значением переменной. Так работают атомарные классы.
 */

public class Main {

    static AtomicInteger i = new AtomicInteger(0);

    public static void main(String[] args) throws Exception{
        for (int j = 0; j < 10000; j++) {
            new MyTread().start();
        }
        Thread.sleep(2000);
        System.out.println(i.get());
    }

    static class MyTread extends Thread {
        @Override
        public void run() {
            i.incrementAndGet();
            //System.out.println(Thread.currentThread().getName());
        }
    }
}
