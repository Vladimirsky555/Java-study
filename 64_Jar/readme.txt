Запуск в консоли:
1) В папке Classes удаляем папку prnl
2) Выполняем команду
jar cf myJar.jar com - создание архива в папке classes
3) Помещаем архив в папку проекта
4) Запускаем проект
java -cp classes; myJar.jar com/user/hello/Main (для windows - ;, для Linux - :)(у меня не сработала)
5) Если поместить в папку установки java наш архив, то для запуска команда
java -cp classes com/user/hello/Main

Запуск в среде разработки:
Исходный код:
import com.user.prnt.Print;
public class Main {
    public static void main(String[] args){
        Print print = new Print();
        print.print();
    }
}
1) Добавить архив к классу в среде разработки:
File -> Project Structure -> Libraries -> + -> Java -> добавляю файл из файловой системы
2) Программа компилируется

Как узнать где установлена java:
File -> Project Structure -> SDKs

jar -tf MyJar.jar - команда для просмотра jar
